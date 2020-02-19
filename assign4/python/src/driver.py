import os
import time
import sys
from functools import reduce
sys.path.append('../src')
import gameoflife as GameOfLife

def cls():
    os.system('cls' if os.name=='nt' else 'clear')

def get_window(lis):
  xmax = max(lis, key = lambda tupl: tupl[0])[0]
  ymax = max(lis, key = lambda tupl: tupl[1])[1]
  xmin = min(lis, key = lambda tupl: tupl[0])[0]
  ymin = min(lis, key = lambda tupl: tupl[1])[1]
  return {"xmin":xmin, "xmax":xmax, "ymin":ymin, "ymax":ymax}

def print_list(cell_list):
  win = get_window(cell_list)
 
  xrange = (abs(win["xmin"] - win["xmax"]))
  yrange = (abs(win["ymin"] - win["ymax"]))

  xoffset = win["xmin"]
  yoffset = win["ymin"]

  shifted_cell_list =list(
    map(lambda tup: (tup[0] - xoffset, tup[1] - yoffset), cell_list))

  for y in reversed(range(yrange + 1)):
    for x in range(xrange + 1):
      if (x,y) in shifted_cell_list:
        print("x", end = "")
      else:
        print(" ", end = "")
    print()
                          
def initial():
  return [(1, 1), (1, 3), (2, 2), (2, 3), (3, 2)]

def print_cli(current_gen, ignore):
  cls()
  print_list(current_gen)
  time.sleep(1)
  return GameOfLife.next_generation(current_gen)

time.sleep(4)
reduce(print_cli, iter(initial, 1))