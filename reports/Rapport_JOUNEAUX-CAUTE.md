# Rapport 

Auteurs : JOUNEAUX Gwendal & CAUTE Maxime

## Condition de l'experience

Toutes les experience on été réalisée sur une machine avec un processeur Intel® Core™ i7-8750H CPU @ 2.20GHz 12 coeurs logiques à fréquence fixée à 2.20Ghz. nous utilisons la JVM d'eclipse avec exactement 4G de RAM allouée. Le resaux ainsi que tout les autre programmes on été arrêté durant l'experience. Toutes les experiences on été lancée dans des conditions similaire pour éviter les variations due aux variations dans les conditions initiales \[Kalibera2005\].

## Experimentation

Notre suite de benchmarks ce concentre sur 10 benchmarks proposé. Nous en avons effectuer seulement 10 car l'experience était déja longue et la JVM plantais avec plus de fichiers.

Les solveur étudier sont sat4j en utilisation direct(sat4j-java) et en standalone(sat4j-jar), cryptominisat dans sa version 3.3 et minisat en version 1.4 et 2.2. La version compilé de sat4j utilisant directement la librairie nos n'avons pas jugé utile de l'ajouter car la compilation est lente et les performance à l'exécution seront similaire à sat4j-java car ils utilisent la même méthode. Nous utilison le parametre rnd-freq=0.2 pour minisat en version 2.2.

## Equivalence fonctionnelle

Nos experimentation ne permettent pas de montrer des différence fonctionnelle entre les solveur. Toutefois, notre suite étant restreinte il n'est absolument pas certains que des expressions soit évaluée différemment par certains solveurs.

## Ecarts de performances

Au vu de nos résultats, la solution sat4j-java est la plus lente de toute tandis qu'il n'y a pas de différence notable entre les autres solveur(les courbes sont disponibles dans le notebook en annexe). Toutefois, minisat semble régulierement être légerement superieur mais nous ne pouvons l'assurer avec certitude.

## Formule SAT "dure"

Il ne semble pas il y avoir de formule foncièrement plus dure, mais il existe des formules plus dure pour certains types de solveurs en raison des différentes tactiques de résolutions.

## Sous-set de formules

Il est probablement pas correct de reduire a un sous-set des formules choisi. En effet, il faudrais être en mesure de prover que ce sous-set est aussi représentatif que le premier, or il semble dur voir impossible de prover une tel chose. Par exemple, certains de nos benchmarks montre parfois des pics correspondant à des réduction de performances, si ces pic ne sont pas dû au conditions de l'experience, il révelent un comportement particulier du solveur et de tels comportement serais perdu dans le cadre d'un sous-set. 

Notre experience ce concentre sur un sous-set des benchmarks proposé, nous avons donc forcément rater des informations liées aux autres benchmarks. C'est pourquoi nos résultats sont à prendre avec du recul.
