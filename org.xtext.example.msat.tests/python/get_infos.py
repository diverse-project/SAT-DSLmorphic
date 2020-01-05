import csv

data_filename = "results_1.csv"


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
		is_sat 		= bool(row[3])
		time 		= float(row[4])
		parameter 	= str(row[5])

		formulas.append(formula)
		solvers.append(solver)
		versions.append(version)
		is_sats.append(is_sat)
		times.append(time)
		parameters.append(parameter)

i = 7
#print(formulas[i], solvers[i], versions[i], is_sats[i], times[i], parameters[i])

size = len(formulas)


# list of 6-uplets (formula, solvers, versions, is_sats, times, parameters)
#
#


data_rewritten = []

previous_formula = ""
for i in range(1, size) : 
	actual_formula = formulas[i]
	if actual_formula == previous_formula : 
		data_rewritten[-1][1].append(solvers[i])
		data_rewritten[-1][2].append(versions[i])
		data_rewritten[-1][3].append(is_sats[i])
		data_rewritten[-1][4].append(times[i])
		data_rewritten[-1][5].append(parameters[i])
	else : 
		new_tuple = []
		new_tuple.append(formulas[i]) 		# 0
		new_tuple.append([solvers[i]])		# 1
		new_tuple.append([versions[i]])		# 2
		new_tuple.append([is_sats[i]])		# 3
		new_tuple.append([times[i]])		# 4
		new_tuple.append([parameters[i]])	# 5
		data_rewritten.append(new_tuple)	
	previous_formula = actual_formula

print(data_rewritten[0])


index_min = -1
data_for_formula_0 = data_rewritten[0]
print(data_for_formula_0)
max_time = 99999999
for i in range(len(data_for_formula_0[1])): 
	time = data_for_formula_0[4][i]
	if time < max_time : 
		max_time = time
		index_min = i
print("for formula " + data_for_formula_0[0] + ", fastest solver is " + 
		data_for_formula_0[1][index_min])
















