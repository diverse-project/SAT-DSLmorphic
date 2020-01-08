package org.xtext.example.msat.GJ_MC_Process

interface Benchmarkable {
	def Pair<Boolean,Long> benchmark(String filename)
}