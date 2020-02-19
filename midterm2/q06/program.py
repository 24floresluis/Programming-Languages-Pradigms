import itertools

def get_factors(num):
    return list(filter(lambda x: num % x == 0, range(1, num + 1)))

def get_factors_for_list(passed_list):
    return list(set(itertools.chain.from_iterable(map(get_factors, passed_list))))

print(get_factors_for_list([2, 5, 7, 8, 12, 18, 15]))
print(get_factors_for_list([1, 3, 5, 7, 4, 8]))
