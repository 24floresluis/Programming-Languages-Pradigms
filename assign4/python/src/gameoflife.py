from functools import reduce
from collections import Counter

def is_alive(alive, living_neighbors):
  return alive and living_neighbors == 2 or living_neighbors == 3

def generate_signals(live_cells):
 return sum(
   [[(cell[0] - 1, cell[1] - 1), (cell[0] - 1, cell[1]),
  (cell[0] - 1, cell[1] + 1), (cell[0], cell[1] - 1),
  (cell[0], cell[1] + 1), (cell[0] + 1, cell[1] - 1),
  (cell[0] + 1, cell[1]), (cell[0] + 1, cell[1] + 1)] 
    for cell in live_cells],
  [])

def count_signals_for_each_cell(signals):
  return Counter(signals)
  
def next_generation(live_cells):
  signals = generate_signals(live_cells)

  return [cell for cell, count in count_signals_for_each_cell(signals).items()
    if is_alive(cell in live_cells, count)]