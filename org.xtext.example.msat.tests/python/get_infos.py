import csv


def presentation_solver(solver, version, parameters) : 
	line = solver + " - v" + version + " - parameters : " + parameters
	return line



nb_timeouts = {}
def get_in_map_timeout(formula, infos_solver) : 
	if (formula, infos_solver) in nb_timeouts : 
		return nb_timeouts[(formula, infos_solver)]
	else : 
		return 0

def incr_in_map_timeout(formula, infos_solver) : 
	if (formula, infos_solver) in nb_timeouts : 
		nb_timeouts[(formula, infos_solver)] += 1
	else : 
		nb_timeouts[(formula, infos_solver)] = 1


def open_results(data_filename) : 
	with open(data_filename) as csvfile:
		readCSV = csv.reader(csvfile, delimiter=';')
	
		formulas = []
		solvers  = []
		versions = []
		is_sats = []
		times = []
		parameters = []
	
		first = True
		for row in readCSV:

			if first : 
				first = False
				continue

			formula 	= str(row[0])
			solver 		= str(row[1])
			version 	= str(row[2])
			parameter 	= str(row[3])
			is_sat 		= bool(row[4])
			time 		= float(row[5])

			if time < -0.5 :
				incr_in_map_timeout(formula, presentation_solver(solver, version, parameter))
				time = 900

			formulas.append(formula)
			solvers.append(solver)
			versions.append(version)
			parameters.append(parameter)
			is_sats.append(is_sat)
			times.append(time)
	results = [formulas, solvers, versions, parameters, is_sats, times]
	return results


def rewrite_data(results) : 
	data_rewritten = []
	formulas = results[0]
	solvers = results[1]
	versions = results[2]
	parameters = results[3]
	is_sats = results[4]
	times = results[5]


	size = len(formulas)

	previous_formula = ""
	for i in range(size) : 
		actual_formula = formulas[i]
		if actual_formula == previous_formula : 
			data_rewritten[-1][1].append(solvers[i])
			data_rewritten[-1][2].append(versions[i])
			data_rewritten[-1][3].append(parameters[i])
			data_rewritten[-1][4].append(is_sats[i])
			data_rewritten[-1][5].append(times[i])
		else : 
			new_tuple = []
			new_tuple.append(formulas[i]) 		# 0
			new_tuple.append([solvers[i]])		# 1
			new_tuple.append([versions[i]])		# 2
			new_tuple.append([parameters[i]])	# 3
			new_tuple.append([is_sats[i]])		# 4
			new_tuple.append([times[i]])		# 5
			data_rewritten.append(new_tuple)	
		previous_formula = actual_formula
	return data_rewritten


def get_informations(index_solver, data_rewritten) : 
	line = data_rewritten[0]
	return presentation_solver(line[1][index_solver], line[2][index_solver], line[3][index_solver])

results_1 = open_results("results_1.csv")
results_2 = open_results("results_2.csv")
results_3 = open_results("results_3.csv")
results_4 = open_results("results_4.csv")
results_5 = open_results("results_5.csv")
results_6 = open_results("results_6.csv")

def compute_nb_of_timeout_per_solver(results_1) : 
	formulas = results_1[0]
	solvers = results_1[1]
	versions = results_1[2]
	parameters = results_1[3]
	is_sats = results_1[4]
	times = results_1[5]

	size = len(formulas)

	#print(nb_timeouts)
	nb_timeouts_per_solver = [0,0,0,0,0,0,0,0,0,0]
	last_formula = ""
	index_solver = -1
	for i in range(size) : 
		formula = formulas[i]
		solver = solvers[i]
		version = versions[i]
		parameter = parameters[i]

		index_solver+=1
		if formula != last_formula : 
			last_formula = formula
			index_solver = 0
		nb_timeouts_per_solver[index_solver] += get_in_map_timeout(formula, presentation_solver(solver, version, parameter))
	return nb_timeouts_per_solver

nb_timeouts_per_solver = compute_nb_of_timeout_per_solver(results_1)

rewritten_results_1 = rewrite_data(results_1)
rewritten_results_2 = rewrite_data(results_2)
rewritten_results_3 = rewrite_data(results_3)
rewritten_results_4 = rewrite_data(results_4)
rewritten_results_5 = rewrite_data(results_5)
rewritten_results_6 = rewrite_data(results_6)

#print(rewritten_results_1)

data = [rewritten_results_1, rewritten_results_2, rewritten_results_3, rewritten_results_4, rewritten_results_5, rewritten_results_6]

def mix_rewritten_data(datas) : 
	infos_on_formula = {}
	mixed_results = []
	
	#creating map on mixed times
	for line in datas[0] : 
		formula = line[0]
		infos_on_formula[formula] = [0,0,0,0,0,0,0,0,0,0]
	for i_data in range(len(datas)) : 
		data = datas[i_data]
		for i_line in range(len(data)) : 
			line = data[i_line]
			formula = line[0]
			times = line[5]
			infos_on_formula[formula] = [sum(i) for i in zip(infos_on_formula[formula], times)]
	# meaning these times
	for line in datas[0] : 
		formula = line[0]
		infos_on_formula[formula] = [i/len(datas) for i in infos_on_formula[formula]]
	
	
	
	#creating new lines
	for line in datas[0] : 
		formula = line[0]
		solvers = line[1]
		versions = line[2]
		parameters = line[3]
		is_sats = line[4]

		mixed_line = [formula, solvers, versions, parameters, is_sats, infos_on_formula[formula]]
		mixed_results.append(mixed_line)

	return mixed_results	

	#print(all_formulas)
	#for formula in all_formulas : 
		

mixed_results = mix_rewritten_data(data)

#print(mixed_results)





#i = 7
#print(formulas[i], solvers[i], versions[i], is_sats[i], times[i], parameters[i])


# list of 6-uplets (formula, solvers, versions, is_sats, times, parameters)
#
#



data_rewritten = mixed_results
#print(data_rewritten[0])



minimal_time_for_counting = 0.01
nb_fastest = [0,0,0,0,0,0,0,0,0,0]
mean_times = [0,0,0,0,0,0,0,0,0,0]
# sat4j-jar, minisat 1.14.0, minisat 2.2.0 freq0, minisat 2.2.0 freq0.5, minisat 2.2.0 freq0.9,
# cryptominisat 2.4.0, cryptominisat 4.5.3, cryptominisat 5.6.8 freq0, cryptominisat 5.6.8 freq0.5,
# cryptominisat 5.6.8 freq0.9
nb_formulas = len(data_rewritten)

important_formulas_and_best = []
for i in range(nb_formulas) : 
	index_min = -1
	data_for_formula_i = data_rewritten[i]
	max_time = 99999999
	for j in range(len(data_for_formula_i[1])): 
		time = data_for_formula_i[5][j]
		if time < max_time : 
			max_time = time
			index_min = j

		mean_times[j] += time	


	if max_time > minimal_time_for_counting : 
		nb_fastest[index_min]+=1
		important_formulas_and_best.append( (i, index_min) )


mean_times = [val/nb_formulas for val in mean_times]

	#print("for formula " + data_for_formula_i[0] + ", fastest solver is " + 
	#		get_informations(i, index_min))


def check_functionnal(results) : 
	for i in range(len(results)) : 
		result = results[i]
		is_sats = result[4]
		times = result[5]
		sats_where_time_is_not_900 = [is_sats[j] for j in range(len(times)) if times[j] < 899.]
		if sats_where_time_is_not_900.count(sats_where_time_is_not_900[0]) == len(sats_where_time_is_not_900) : 
			pass #all cool
		else : 
			ERROR 
			

check_functionnal(mixed_results)

#print(nb_fastest)
#print(mean_times)

print()
print("Results on mixed data : \n")

print("Only counting non-easy formulas (taking more than " + str(minimal_time_for_counting) + " s to compute), here is the number of times each solver has been the fastest : ")
for i in range(len(nb_fastest)) : 
	print("Solver " + get_informations(i, mixed_results) + " got " + str(nb_fastest[i]))
print()
print("Mean time for each solver on every formula : ")
for i in range(len(mean_times)) : 
	print("Solver " + get_informations(i, mixed_results) + " has a mean of  " + str(mean_times[i]))

'''
print()
print("Number of timeouts time for each solver : ")
for i in range(len(how_many_timeouts)) : 
	print("Solver " + get_informations(i, mixed_results) + " has echoed a timeout " + str(how_many_timeouts[i]) + " times")
'''

print()
print("Number of timeouts time for each solver : ")
for i in range(len(nb_timeouts_per_solver)) : 
	print("Solver " + get_informations(i, mixed_results) + " has echoed a timeout " + str(nb_timeouts_per_solver[i]) + " times")



print()
print("Big instances : ")
sum_earlyness = 0
nb_first = 0
sum_lateness = 0
nb_not_first = 0
for (i,j) in important_formulas_and_best :
	#print("Solver " + get_informations(j, mixed_results) + " won on formula " + mixed_results[i][0] + ".")
	#print("Here all times : ")
	#print(list(zip(mixed_results[i][1],mixed_results[i][5])))
	#print()
	if (j != 6) : 
		time_crypto4 = mixed_results[i][5][6]
		time_best = mixed_results[i][5][j]
		sum_lateness += time_crypto4 - time_best
		nb_not_first += 1
	else : 
		time_crypto4 = mixed_results[i][5][6]
		time_best_except_crypto = 9999
		for k in range(len(mixed_results[i][5])) : 
			timee = mixed_results[i][5][k]
			if k != 6 and timee < time_best_except_crypto : 
				time_best_except_crypto = timee

		sum_earlyness += time_best_except_crypto - time_crypto4
		nb_first += 1
	#print()
	#print()


print("Mean advance for cryptominisat4 : " + str(sum_earlyness / nb_first))
print("Mean lateness for cryptominisat4 : " + str(sum_lateness / nb_not_first))
		#print("cryptominisat4.5.3 was only " + str(time_best_except_crypto - time_crypto4) + " seconds late")
		













