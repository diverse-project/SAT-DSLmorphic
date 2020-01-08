#!/usr/bin/env python

import os
import subprocess

short = True

BASE_DIR = "/home/gwandalf/SAT-DSLmorphic/"
BENCHMARK = BASE_DIR+"Benchmarks/"
ANNEXE = BASE_DIR+"JOUNEAUX-CAUTE_annexes/"

benchmarks = os.listdir(BENCHMARK)
files = list(filter(lambda x : ".cnf" in x, benchmarks))

if(not short):
	folders = list(filter(lambda x : not ".cnf" in x, benchmarks))
	for folder in folders:
		subbenchmarks = os.listdir(BENCHMARK+folder+"/")
		subbenchmarks = map(lambda x: folder+"/"+x,subbenchmarks)
		files.extend(subbenchmarks)

files = map(lambda x: BENCHMARK+x,files)

out =  "solver sat4j-jar sat4j-java minisat version \"1.4\""
out += "minisat rnd-freq 0.2"
out += "cryptominisat\nbenchmarkDIMACS " 

for file in files[0:10]:
	out += '"'+file+'",'
	
out = out[0:-1]
f = open(ANNEXE+"benchmarks.msat","w+")
f.write(out)
f.close()
