# Command line app

## Main functionality
Command line application, which computes the multiplication of two large numbers outside the range of Long. 

2 implementations provided - one using built-in Java class BigInteger (--alt1), one written from scratch (--alt2).

Unit tests are implemented to test partial functionality as well as whole solution.

Delivered with shell script to run directly from bash command line.

## Run app
$ ./multiply.sh --alg1 12345678901234567890 11111111111111111111
137174210013717420998628257899862825790

## Tech Stack
**Java 8**
**Gradle project**

## Lessons learned
1. Command line arguments setup in IntelliJ
2. Building jar file + writing shell script
3. Testing of print output via ByteArrayOutputStream
