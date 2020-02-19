import sys
import unittest
from collections import Counter
sys.path.append('../src')
import gameoflife as GameOfLife

class GameOfLifeTests(unittest.TestCase):

  def test_canary(self):
    self.assertTrue(True)

  def test_live_cell_one_neighbor(self):
    self.assertFalse(GameOfLife.is_alive(True, 1))

  def test_live_cell_four_neighbors(self):
    self.assertFalse(GameOfLife.is_alive(True, 4))

  def test_live_cell_two_neighbors(self):
    self.assertTrue(GameOfLife.is_alive(True, 2))

  def test_live_cell_three_neighbors(self):
    self.assertTrue(GameOfLife.is_alive(True, 3))

  def test_dead_cell_one_neighbor(self):
    self.assertFalse(GameOfLife.is_alive(False, 1))

  def test_dead_cell_four_neighbor(self):
    self.assertFalse(GameOfLife.is_alive(False, 4))

  def test_dead_cell_two_neighbor(self):
    self.assertFalse(GameOfLife.is_alive(False, 2))

  def test_dead_cell_three_neighbor(self):
    self.assertTrue(GameOfLife.is_alive(False, 3))

  def test_signals_in_an_empty_universe(self):
    signals = GameOfLife.generate_signals([])
    self.assertEqual(0, len(signals))

  def test_signals_in_an_universe_with_one_live_cell(self):
    signals = GameOfLife.generate_signals([(2, 3)])
    
    self.assertEqual(8, len(signals))
    self.assertEqual(
      [(1, 2), (1, 3), (1, 4), (2, 2), (2, 4), (3, 2), (3, 3), (3, 4)],
      signals)
    
  def test_signals_in_an_universe_with_two_live_cells(self):
    signals = GameOfLife.generate_signals([(2, 3), (10, 12)])
    
    self.assertEqual(16, len(signals))
    self.assertTrue((1, 2) in signals)
    self.assertTrue((10, 11) in signals)
    
  def test_signals_in_an_universe_with_two_nearby_cells(self):
    signals = GameOfLife.generate_signals([(2, 3), (2, 5)])
    
    self.assertEqual(16, len(signals))         
    self.assertEqual(2, len(list(filter(lambda e: e == (2, 4), signals))))

  def test_count_signals_in_universe_with_no_signals(self):
    self.assertEqual({}, GameOfLife.count_signals_for_each_cell([]))

  def test_count_signals_in_universe_with_one_signal(self):
    self.assertTrue(((1, 2), 1) 
      in GameOfLife.count_signals_for_each_cell([(1, 2)]).items())

  def test_count_signals_in_universe_with_two_signals(self):
    self.assertTrue(((1, 2), 2) 
      in GameOfLife.count_signals_for_each_cell([(1, 2), (1, 2)]).items())

  def test_count_signals_in_universe_with_three_signals(self):
    self.assertTrue(((3, 2), 2), ((101, 102), 1) in
      GameOfLife.count_signals_for_each_cell(
        [(3, 2), (101, 102), (3, 2)]).items())
  
  def test_count_signals_in_universe_with_six_signals(self):
    self.assertTrue(((3, 2), 4), ((1, 2), 1) in
      GameOfLife.count_signals_for_each_cell(
        [(3, 2), (101, 102), (3, 2), (1, 2), (3, 2), (3, 2)]).items())

  def test_next_generation_empty_universe(self):
    next_live_cells = GameOfLife.next_generation([])

    self.assertEqual(0, len(next_live_cells))

  def test_next_generation_one_cell(self):
    next_live_cells = GameOfLife.next_generation([(1, 2)])

    self.assertEqual(0, len(next_live_cells))       

  def test_next_generation_block(self):
    next_live_cells = GameOfLife.next_generation(
      [(1, 2), (2, 2), (1, 3), (2, 3)])
    
    self.assertTrue((1, 2) in next_live_cells)
    self.assertTrue((2, 2) in next_live_cells)
    self.assertTrue((1, 3) in next_live_cells)
    self.assertTrue((2, 3) in next_live_cells)

  def test_next_generation_vertical_oscillator(self):
    next_live_cells = GameOfLife.next_generation(
      [(1, 2), (2, 2), (3, 2)])

    self.assertTrue((2, 1) in next_live_cells)
    self.assertTrue((2, 2) in next_live_cells)
    self.assertTrue((2, 3) in next_live_cells)

  def test_next_generation_horizontal_oscillator(self):
    next_live_cells = GameOfLife.next_generation(
      [(2, 1), (2, 2), (2, 3)])

    self.assertTrue((1, 2) in next_live_cells)
    self.assertTrue((2, 2) in next_live_cells)
    self.assertTrue((3, 2) in next_live_cells)

  def test_next_generation_glider(self):
    next_live_cells = GameOfLife.next_generation(
      [(1, 1), (1, 3), (2, 2), (2, 3), (3, 2)])

    self.assertTrue((1, 3) in next_live_cells)
    self.assertTrue((2, 1) in next_live_cells)
    self.assertTrue((2, 3) in next_live_cells)
    self.assertTrue((3, 2) in next_live_cells)
    self.assertTrue((3, 3) in next_live_cells)