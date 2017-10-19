# sieve_of_eratosthenes_scala
design, develop and test a Scala based application, using functional programming paradigm, to calculate prime numbers between 1 to a given large n, using the Sieve of Eratosthenes, method.
# Approach
Basic principle behind this algorithm is that it stops on sqrt(n) and removes all the multiples of every previous element. I used lists for this. Populated the list using range(2 to n) and the called the separate function which calculates all the prime numbers. All this is done in f_Prime function which is in object srieve.
# How to Run
Use scala compiler for running.
