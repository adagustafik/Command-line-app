Calculate mutiplication
=======================
Write a program which computes the multiplication of two large numbers (integers) entered as command line arguments. 
Each number can have any number of digits (up to the maximum length of a CLI argument, try at least 20 digits for each).
It is mandatory to provide two implementations of the algorithm computing the multiplication (one of them can use
e.g.: BigInteger class another one should implement the algorithm from scratch).
Program must allow to choose one of the implementations by arguments.
It is also mandatory to implement at least one unittest which computes multiplication using both algorithms for
the same inputs and compares results which must be equal.

E.g. for 12345678901234567890*11111111111111111111:
$ ./multiply.sh --alg1 12345678901234567890 11111111111111111111
137174210013717420998628257899862825790

Deliverables
============
It is mandatory that implementation of this task is done in Java. 
Optionally, extra points are achieved if implementation:
* clean architecture, layer separation and API design
* is delivered as maven or gradle project, when is loaded into IDE (Eclipse or Intellij Idea).
* unit tests are implemented to test partial functionality as well as whole solution.
* is delivered as zipped git repository with clean history of commits.
* performance tests are provided
* runs in java 9 or 10

