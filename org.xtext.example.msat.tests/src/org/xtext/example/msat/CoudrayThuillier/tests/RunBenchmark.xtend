package org.xtext.example.msat.CoudrayThuillier.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.mSat.SATMorphic
import org.xtext.example.mydsl1.tests.MSatInjectorProvider
import org.xtext.example.msat.CoudrayThuillier.Solve

@ExtendWith(InjectionExtension)
@InjectWith(MSatInjectorProvider)
class RunBenchmark {
	val csv_export = "/home/kerian/Documents/M1-SIF/DSL/benchmark-10x.csv"
	
	val msat_benchmark = '''
		solver
			sat4j-java
			sat4j-jar version "2.0.0"
			sat4j-jar version "2.0.4"
			sat4j-jar version "2.2.3"
			sat4j-jar version "2.3.1"
			sat4j-maven version "2.0.0"
			sat4j-maven version "2.0.4"
			sat4j-maven version "2.2.3"
			sat4j-maven version "2.3.1"
			cryptominisat
			minisat rnd-freq 0.01
			minisat rnd-freq 0.2
			minisat rnd-freq 0.4
			minisat rnd-freq 0.6
			minisat rnd-freq 0.8
			minisat rnd-freq 0.99
		benchmarkDIMACS
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/10.sk_1_46.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/107.sk_3_90.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/109.sk_4_36.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/110.sk_3_88.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/111.sk_2_36.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/17.sk_3_45.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/19.sk_3_48.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/20.sk_1_51.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/27.sk_3_32.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/29.sk_3_45.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/30.sk_5_76.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/32.sk_4_38.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/35.sk_3_52.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/36.sk_3_77.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/51.sk_4_38.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/53.sk_4_32.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/54.sk_12_97.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/55.sk_3_46.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/56.sk_6_38.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/57.sk_4_64.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/63.sk_3_64.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/7.sk_4_50.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/70.sk_3_40.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/71.sk_3_65.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/77.sk_3_44.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/79.sk_4_40.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/80.sk_2_48.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/81.sk_5_51.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/84.sk_4_77.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/ActivityService.sk_11_27.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/ActivityService2.sk_10_27.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/ConcreteActivityService.sk_13_28.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/ConcreteRoleAffectationService.sk_119_273.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/GuidanceService.sk_4_27.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/GuidanceService2.sk_2_27.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/IssueServiceImpl.sk_8_30.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/IterationService.sk_12_27.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/LoginService.sk_20_34.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/LoginService2.sk_23_36.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/NotificationServiceImpl2.sk_10_36.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/PhaseService.sk_14_27.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/Pollard.sk_1_10.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/ProcessBean.sk_8_64.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/ProjectService3.sk_12_55.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/SetTest.sk_9_21.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/UserServiceImpl.sk_8_32.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/compress.sk_17_291.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/diagStencil.sk_35_36.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/doublyLinkedList.sk_8_37.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/enqueueSeqSK.sk_10_42.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/isolateRightmost.sk_7_481.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/jburnim_morton.sk_13_530.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/karatsuba.sk_7_41.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/log2.sk_72_391.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/logcount.sk_16_86.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/lss.sk_6_7.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/parity.sk_11_11.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/partition.sk_22_155.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/polynomial.sk_7_25.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/registerlesSwap.sk_3_10.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/reverse.sk_11_258.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/signedAvg.sk_8_1020.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/sort.sk_8_52.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/tableBasedAddition.sk_240_1024.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/tutorial1.sk_1_1.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/tutorial2.sk_3_4.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/tutorial3.sk_4_31.cnf",
			"/home/kerian/Documents/M1-SIF/DSL/SAT-DSLmorphic/org.xtext.example.msat.tests/Benchmark/xpose.sk_6_134.cnf"
'''

	@Inject
	ParseHelper<SATMorphic> parseHelper

	@Test
	def void ProcessingModel1() {
		println("Start benchmarking...")
		val result = parseHelper.parse(msat_benchmark)
		println("Benchmark is parsed...")
		Solve.process_to_CSV(result, csv_export, 10)
		println("End benchmarking.")
	}
}
