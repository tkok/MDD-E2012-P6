MDD-E2012-P6
============

Visit [the Wiki](https://github.com/tkok/MDD-E2012-P6/wiki) and get smart!

# Code Generation From ECDAR

As complexity of Software Projects grows, it becomes necessary to lift abstraction to a higher level. This is very useful when experts from specific domains who are not familiar with classical programming need to develop systems. Instead of educating programmers in these domains, we can increase productivity by giving aforementioned experts the proper tools to develop these systems which also enables re-usability.

These tools usually create models which specify the desired program. Since a model is just an abstract representation, the need for tools that generate actual executable program code is obvious.

Our project focuses on ECDAR, a modelling language for the specification of Timed I/O Automata [1]. Our main goal is to be able to translate simple ECDAR models into compilable and executable code. The target language is yet to be determined. We will base our implementation on a parser generated from an already existing ECDAR meta-model. This will possibly be altered to fit our needs. Furthermore we will use relevant literature as our theoretical basis for code generation.

An extended goal of this project is to implement code generation for composed TIOA. Here, we will focus on the parallel-composition operator which combines two TIOA to run in parallel on the same system.

The result of this project will be a code generation tool for simple TIOA, possibly extended to generating code for parallel automata. This, together with the report, can build a foundation for further projects aiming to generate code from ECDAR models. It is also an important step towards additional value for the industry to encourage using high-level TIOA modelling.

[1]  A. David, K. G. Larsen, A. Legay, M. H. Møller, U. Nyman, A. P. Ravn, A. Skou, and A. Wąsowski, “Compositional verification of real-time systems using Ecdar,” International Journal on Software Tools for Technology Transfer, Jun. 2012.

