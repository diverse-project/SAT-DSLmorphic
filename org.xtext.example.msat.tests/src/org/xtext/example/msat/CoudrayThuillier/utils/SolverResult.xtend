package org.xtext.example.msat.CoudrayThuillier.utils

enum SolverStatus {
	SAT,
	UNSAT
}

class SolverResult {
	
	String benchmark = ""
	String solver = ""
	String version = ""
	SolverStatus status = SolverStatus.UNSAT
	long mean_t = -1
	long sd_t = -1
	
	new(String benchmark, String solver, String version, boolean status, long mean_t, long sd_t) {
		this.benchmark = benchmark
		this.solver    = solver
		this.version   = version
		if (status) {
			this.status = SolverStatus.SAT 
		} else {
			this.status = SolverStatus.UNSAT
		}
		this.mean_t    = mean_t
		this.sd_t      = sd_t
	}
	
	def String getBenchmark () {
		return benchmark
	}
	
	def String getSolver () {
		return solver
	}
	
	def String getVersion () {
		return version
	}
	
	def String getStatus () {
		return status.toString()
	}
	
	def long getMeanTime () {
		return mean_t
	}
	
	def long getStandardDeviationTime () {
		return sd_t
	}
	
	def static String toString(SolverStatus status) {
		switch status {
			case SolverStatus.SAT : return "SAT"
			case SolverStatus.UNSAT : return "UNSAT"
			default : return "UNSAT"
		}
	}
	
	def static String getHeader () {
		return "Benchmark\tSolver\tVersion\tSat?\tMean Time\tStandard Deviation Time"
	}
	
	override String toString() {
		return benchmark + "\t" + solver + "\t" + version + "\t" + status.toString + "\t" + mean_t + "\t" + sd_t
	}
	
}