from math import sqrt 
import matplotlib.pyplot as plt 
import matplotlib


file_name = ["results.csv"]

def which_solver(solver,version,i):
    if solver[i] == "sat4j-java":
        return 0
    elif solver[i] == "sat4j-maven":
        return 1
    elif solver[i] == "sat4j-jar":
        return 2
    elif version[i] == "5.6.7":
        return  3
    else :
        return 4

def sum(l):
    s = 0
    for i in range(len(l)):
        s+=l[i]
    return s
for name in file_name : 
    file = open('./' + file_name[0])
    benchmark = []
    solver = []
    version = []
    sat = []
    time = [] 
    while True : 
        line = file.readline()
        sliced = line.split(',') 
        if not line : break
        benchmark.append(sliced[0])
        solver.append(sliced[1])
        version.append(sliced[2])
        sat.append(sliced[3])
        time.append(int(sliced[4]))

    perf = [[],[],[],[],[] ]
    bench = [[],[],[],[],[] ]
    solv = ["sat-4j-java", "sat-4j-maven", "sat-4j-jar", "cryptominisat 5.6.7" , "cryptominisat 5.6.8"]

    consider =  [True,True,True,True,True]
    for i in range(len(sat)):
        j = which_solver(solver,version,i)
        perf[j].append(time[i])
        bench[j].append(benchmark[i])
    mean = []
    for i in range(5):
        mean.append(sum(perf[i])/(len(perf[i])))

        #    print(solv)
        #    print(mean)

    formula = []
    for i in range(5):
        m = max(perf[i])
        j = perf[i].index(m)
        formula.append(bench[i][j])


    saved = []
    times = []

    for f in formula:
        hard = 0
        curr_time = 0
        for i in range(len(sat)):
            if benchmark[i] == f:
                j = which_solver(solver,version,i)
                if time[i] > mean[j] and sat[i] == "SAT": 
                    hard += 1
                    curr_time += time[i]


                    
        if hard > 2:
            saved.append(f)
            times.append(curr_time/hard)
            

    #print(saved)
    #print(times)


    curr_benc = ""
    curr_solv = ""
    curr_ver  = ""

    for i in range(len(sat)):
        curr_benc = benchmark[i]
        curr_solv = solver[i]
        curr_ver = version[i]
        awsn = sat[i]
        st = 0
        unsat = 0
        for j in range(len(sat)):
            if curr_benc == benchmark[j]:
                if awsn == "SAT" : 
                    st +=1
                else:
                    unsat +=1
        if st > unsat :
            if awsn != "SAT":
                print(curr_benc,curr_solv,curr_ver)
        else :
            if awsn == "SAT":
                    print(curr_benc,curr_solv,curr_ver)



                    
