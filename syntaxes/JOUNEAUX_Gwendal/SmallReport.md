# Grammar

My grammar is designed to ensure an order in the priority of each operator for example NOT has a strong priority when EQUIV has a low priority. So, { !A && B -> C <=> D OR E } will be evaluated { (((!A) && B) -> C) <=> (D OR E) }. The priority of those operator was set arbitrarily with a little bit of common sense.

Variable & parenthesis > Not > Nand > And > Or > Implies > Equiv

# Metamodels

The first metamodel i came with is really simple. There is one root class for the file and this metaclass is composed of multiple expressions. Moreover, I created seven classes for the operators and variables and all those classes implements the Expression interface.

Since i am quite used to write grammar, i created my grammar in a way that allow me to manage operator's priority and allow me to use the dispatch keyword that is included in xTend to take advantage of the polymorphism.

So, in this case my first metamodel and the metamodel generated from my grammar are, as far i can see, the same.
