import itertools
import os
import time
import sys

def is_prime_number(num):
    if num >= 2:
        for i in range(2, num - 1):
            if not ( num % i ):
                return False
    else:
	    return False
    return True


def inf_list(x):
    return range(x + 1, 10000)


def get_primes_larger(num):
    return list(filter(lambda x: is_prime_number(x), inf_list(num)))

def print_cli(currentPrime, ignore):
  print(currentPrime)
  time.sleep(1)()


print("Please enter number: ")
x = input()
for prime in get_primes_larger(x):
    print(prime)
    time.sleep(1)



