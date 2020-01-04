# Uniform Sampling of SAT Solutions for Configurable Systems: Are We There Yet?

Uniform or near-uniform generation of solutions for large satisfiability formulas is a problem of theoretical and practical interest for the testing community. Recent works proposed two algorithms (namely Unigen and QuickSampler) for reaching a good compromise between execution time and uniformity guarantees, with empirical evidence on SAT benchmarks. 
In the context of highly-configurable software systems (e.g., Linux), it is unclear whether Unigen and QuickSampler can scale and sample uniform software configurations. We investigate this question in an ICST'19 paper.  
 This repository aims to provide all feature models of the benchmarks, Python scripts to execute experiments, Python scripts to compute plots, figures, and statistics of this paper as well as additional ones, and instructions to reuse our work. 

## Contributors 

Quentin Plazar, Mathieu Acher, Gilles Perrouin, Xavier Devroey and Maxime Cordy

## Installation

You will need to product the following binaries, and move them to the `scripts/` directory, to run the experiments :

- `quicksampler`
- `unigen`
- `sharpSAT`
- `doalarm`
- `z3`

Please use the sources provided in the `tools/` directory to build them. Do not use another version of z3 as it will break quicksampler.

in most cases you just need to move to the corresponding subdirectory in `tools/`, follow the instructions, and move the executable to scripts.

To build z3, from the `tools/z3/` subdirectory

```
python scripts/mk_make.py
cd build
make
sudo make install
```

Important note : Unigen will probably not run on Mac OS

## Using the python scripts

Several python scripts to run experiments are provided, they are of three kinds :

### the `bench\*.py` scripts

These scripts build a list of `.cnf` files to be sampled, and output a comparison table with the results. Examples include `benchQsPaper.py` or `benchFeatureModels.py`. they are run without arguments, e.g. :

```
python benchQsPaper.py
```

The results are output in the `out/` directory. The files containing the generated samples are deleted (otherwise large benchmarks would produce TB of data).

To create your own bench configuration, and for detailed instuctions, refer to the comments at the top of the `makeComparisonTable.py` script.

### the `makeDistributionFigure.py` script

This script makes a 'ditribution figure', that is, a figure similar to those found in the unigen and quicksampler papers. It takes a `.cnf` file as argument and outputs a distribution figure for that formula. You can use the `-noug`, `-noqs`, or `-nouniform` options to omit using the corresponding sampler.

### the `makeFrequencyDiagram.py` script

This script makes a frequency diagram, that is, it reports for every feature of a `.cnf` file, the deviations between the theoretical sample frequency of that feature, and the one reported by unigen and quicksampler. It takes a `.cnf` file as argument and output figures and logs in `out/FrequencyDiagrams`. You can use the `-noug` or `-noqs` options to omit using the corresponding sampler.

Please note that you should annotate your `.cnf` file with the names of the feature you want to compute deviations for. Do this by adding a comment at the top of the file. for example :

```
c 15 myFeature
```

Indicates that variable 15 corresponds to the feature 'myFeature'. Variables not referenced this way will be flagged as intermediate variables, and will be ignored. 

Important Note :

Sample files generated by `makeDistributionFigure.py` and `makeFrequencyDiagram.py` are not deleted, and can take up a lot of disk space. Consider removing them when you are done with editing the figures.