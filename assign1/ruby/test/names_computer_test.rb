require 'minitest/autorun'
require './src/names_computer'

class SampleTest < MiniTest::Test
  def setup
    @namesComputer = NamesComputer.new
  end

  def test_Canary
    assert true
  end 

  def test_averageTestEmptyList_functional
    assert_equal 0.0, @namesComputer.average_length_functional([])
  end

  def test_averageListWithOneName_functional
    assert_equal 6.0, @namesComputer.average_length_functional(["Fahran"])
  end

  def test_averageListWithTwoNamesSameLetterAndLength_functional
    assert_equal 4.0, @namesComputer.average_length_functional(["Matt", "Mort"])
  end

  def test_averageListWithTwoDifferentNameLengths_functional
    assert_equal 5.5, @namesComputer.average_length_functional(["Harry", "Joseph"])
  end

  def test_averageTest_functional
    assert_equal 5.0, @namesComputer.average_length_functional(["Alice", "Billy", "Caleb"])
  end

  def test_averageTestDifferentLengths_functional
    assert_equal 5.25, @namesComputer.average_length_functional(["Anh", "Bob", "Joel", "Jennifer", "ReallyExtraLongSuperName", "D", "A", "I", "Alice", "Billy", "Caleb", "Zoe"])
  end

  def test_noNamesTest_functional
      assert_equal Hash.new, @namesComputer.names_starting_with_each_letter_functional([])
  end

  def test_oneNameListTest_functional
    assert_equal Hash["B",1], @namesComputer.names_starting_with_each_letter_functional(["Bill"])
  end

  def test_twoNamesSameLetterAndLengthList_functional
    assert_equal Hash["B",2], @namesComputer.names_starting_with_each_letter_functional(["Bill","Burt"])
  end

  def test_twoNamesDifferentLettersAndLengthsList_functional
    assert_equal Hash["A", 1, "J", 1], @namesComputer.names_starting_with_each_letter_functional(["Alice", "Joe"])
  end

  def test_numberOfNamesForEachLetterTest_functional
    assert_equal Hash["A", 1, "B", 1, "C", 1], @namesComputer.names_starting_with_each_letter_functional(["Alice", "Billy", "Caleb"])
    assert_equal false, @namesComputer.names_starting_with_each_letter_functional(["Alice", "Billy", "Caleb"]).has_key?("D")
  end

  def test_testManyNames_functional
    assert_equal Hash["A", 4, "B", 3, "D", 1, "G", 1, "H", 1, "T", 2, "M", 2, "F", 1, "N", 1, "Y", 1], @namesComputer.names_starting_with_each_letter_functional(["Asdf", "Asd", "Asdf", "Afff", "Bbbb", "Bob", "Billy", "Dde", "Guy", "Hello", "Test", "Many", "More", "Fun", "Names", "Thank", "You"])
  end

  def test_averageTestEmptyList_imperative
    assert_equal 0.0, @namesComputer.average_length_imperative([])
  end

  def test_averageListWithOneName_imperative
    assert_equal 6.0, @namesComputer.average_length_imperative(["Fahran"])
  end

  def test_averageListWithTwoNamesSameLetterAndLength_imperative
    assert_equal 4.0, @namesComputer.average_length_imperative(["Matt", "Mort"])
  end

  def test_averageListWithTwoDifferentNameLengths_imperative
    assert_equal 5.5, @namesComputer.average_length_imperative(["Harry", "Joseph"])
  end

  def test_averageTest_imperative
    assert_equal 5.0, @namesComputer.average_length_imperative(["Alice", "Billy", "Caleb"])
  end

  def test_averageTestDifferentLengths_imperative
    assert_equal 5.25, @namesComputer.average_length_imperative(["Anh", "Bob", "Joel", "Jennifer", "ReallyExtraLongSuperName", "D", "A", "I", "Alice", "Billy", "Caleb", "Zoe"])
  end

  def test_noNamesTest_imperative
    assert_equal Hash.new, @namesComputer.names_starting_with_each_letter_imperative([])
  end

  def test_oneNameListTest_imperative
    assert_equal Hash["B",1], @namesComputer.names_starting_with_each_letter_imperative(["Bill"])
  end

  def test_twoNamesSameLetterAndLengthList_imperative
    assert_equal Hash["B",2], @namesComputer.names_starting_with_each_letter_imperative(["Bill","Burt"])
  end

  def test_twoNamesDifferentLettersAndLengthsList_imperative
    assert_equal Hash["A", 1, "J", 1], @namesComputer.names_starting_with_each_letter_imperative(["Alice", "Joe"])
  end

  def test_numberOfNamesForEachLetterTest_imperative
    assert_equal Hash["A", 1, "B", 1, "C", 1], @namesComputer.names_starting_with_each_letter_imperative(["Alice", "Billy", "Caleb"])
    assert_equal false, @namesComputer.names_starting_with_each_letter_imperative(["Alice", "Billy", "Caleb"]).has_key?("D")
  end

  def test_testManyNames_imperative
    assert_equal Hash["A", 4, "B", 3, "D", 1, "G", 1, "H", 1, "T", 2, "M", 2, "F", 1, "N", 1, "Y", 1], @namesComputer.names_starting_with_each_letter_imperative(["Asdf", "Asd", "Asdf", "Afff", "Bbbb", "Bob", "Billy", "Dde", "Guy", "Hello", "Test", "Many", "More", "Fun", "Names", "Thank", "You"])
  end

  def test_noNamesTest_imperative
    assert_equal Hash.new, @namesComputer.names_starting_with_each_letter_imperative([])
  end

  def test_oneNameListTest_imperative
    assert_equal Hash["B",1], @namesComputer.names_starting_with_each_letter_imperative(["Bill"])
  end

  def test_twoNamesSameLetterAndLengthList_imperative
    assert_equal Hash["B",2], @namesComputer.names_starting_with_each_letter_imperative(["Bill","Burt"])
  end

  def test_twoNamesDifferentLettersAndLengthsList_imperative
    assert_equal Hash["A", 1, "J", 1], @namesComputer.names_starting_with_each_letter_imperative(["Alice", "Joe"])
  end

  def test_numberOfNamesForEachLetterTest_imperative
    assert_equal Hash["A", 1, "B", 1, "C", 1], @namesComputer.names_starting_with_each_letter_imperative(["Alice", "Billy", "Caleb"])
    assert_equal false, @namesComputer.names_starting_with_each_letter_imperative(["Alice", "Billy", "Caleb"]).has_key?("D")
  end

  def test_testManyNames_imperative
    assert_equal Hash["A", 4, "B", 3, "D", 1, "G", 1, "H", 1, "T", 2, "M", 2, "F", 1, "N", 1, "Y", 1], @namesComputer.names_starting_with_each_letter_imperative(["Asdf", "Asd", "Asdf", "Afff", "Bbbb", "Bob", "Billy", "Dde", "Guy", "Hello", "Test", "Many", "More", "Fun", "Names", "Thank", "You"])
  end
end