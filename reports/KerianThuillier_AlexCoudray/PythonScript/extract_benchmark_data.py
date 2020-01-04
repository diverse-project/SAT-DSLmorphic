import glob, os

benchmark_folder = "/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark"
os.chdir(benchmark_folder)
files = []
for file in glob.glob("*.cnf"):
    files.append(file)

print("Benchmark\tNumber of variables\tNumber of clauses\tPercentage of simple clause")
for file in files :
	filename = file.replace("/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/", "")
	with open(file) as fp:
	   line = fp.readline()
	   variables = set([])
	   count_claused = 0
	   simple_claused = 0
	   while line:
	       if line[0] not in ['p', 'c'] :
		       line = line.replace("-", "")
		       line = line.split()
		       if len(line) == 2 :
		       		simple_claused += 1
		       for n in line :
		       		if n not in ['0', 0, '\n'] :
		       			variables.add(n)
		       count_claused += 1
	       line = fp.readline()
	   count_vars = len(variables)
	   print("{}\t{}\t{}\t{:.2f}".format(filename, count_vars, count_claused, simple_claused / count_claused * 100))