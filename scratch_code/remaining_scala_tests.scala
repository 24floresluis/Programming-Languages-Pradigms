//Functional Tests

    //Computing Hash Map with Initials :: Functional

    test("No Names Functional") {
        assert(NamesComputer.namesStartingWithEachLetterFunctional(List()).isEmpty)
    }

    test("One Name List Functional") {
        assert( Map("B"->1) == NamesComputer.namesStartingWithEachLetterFunctional(List("Bill")))
    }

    test("Two Names Same Letter And Length List Functional") {
        assert( Map("B"->2) == NamesComputer.namesStartingWithEachLetterFunctional(List("Bill","Burt")))
    }

    test("Two Names Different Letters And Lengths List Functional") {
        assert( Map("A" -> 1, "J" -> 1) == NamesComputer.namesStartingWithEachLetterFunctional(List("Alice", "Joe")))
    }

    test("Number Of Names For Each Letter Functional") {
        assert( Map("A" -> 1, "B" -> 1, "C" -> 1) == NamesComputer.namesStartingWithEachLetterFunctional(List("Alice", "Billy", "Caleb")))
        //assert(!NamesComputer.namesStartingWithEachLetterFunctional(List("Alice", "Billy", "Caleb")).contains("D"))
    }

    test("Many Names Functional") {
        assert( Map("A" -> 4, "B" -> 3, "D" -> 1, "G" -> 1, "H" -> 1, "T" -> 2, "M" -> 2, "F" -> 1, "N" -> 1, "Y" -> 1) == NamesComputer.namesStartingWithEachLetterFunctional(List("Asdf", "Asd", "Asdf", "Afff", "Bbbb", "Bob", "Billy", "Dde", "Guy", "Hello", "Test", "Many", "More", "Fun", "Names", "Thank", "You")))
    }



//Imperatice Tests

    //Average Method :: Imperative
    
    test("Average Test Empty List Imperative") {
        assert(NamesComputer.averageLengthImperative(List()) == 0.0f)
    }

    test("Average List With One Name Imperative") {
        assert(NamesComputer.averageLengthImperative(List("Fahran")) == 6.0f)
    }

    test("Average List With Two Names Same Letter And Length Imperative") {
        assert(NamesComputer.averageLengthImperative(List("Matt", "Mort")) == 4.0f)
    }

    test("Average List With Two Different Name Lengths Imperative") {
        assert(NamesComputer.averageLengthImperative(List("Harry", "Joseph")) == 5.5f)
    }

    test("Average Test Imperative") {
        assert(NamesComputer.averageLengthImperative(List("Alice", "Billy", "Caleb")) == 5.0f)
    }

    test("Average Test Different Lengths Imperative") {
        assert(NamesComputer.averageLengthImperative(List("Anh", "Bob", "Joel", "Jennifer", "ReallyExtraLongSuperName", "D", "A", "I", "Alice", "Billy", "Caleb", "Zoe")) == 5.25f)
    }

    //Computing Initial Count Hash Map :: Imperative

    test("No Names Imperative") {
        assert(NamesComputer.namesStartingWithEachLetterImperative(List()).isEmpty)
    }

    test("One Name List Imperative") {
        assert( Map("B"->1) == NamesComputer.namesStartingWithEachLetterImperative(List("Bill")))
    }

    test("Two Names Same Letter And Length List Imperative") {
        assert( Map("B"->2) == NamesComputer.namesStartingWithEachLetterImperative(List("Bill","Burt")))
    }

    test("Two Names Different Letters And Lengths List Imperative") {
        assert( Map("A" -> 1, "J" -> 1) == NamesComputer.namesStartingWithEachLetterImperative(List("Alice", "Joe")))
    }

    test("Number Of Names For Each Letter Imperative") {
        assert( Map("A" -> 1, "B" -> 1, "C" -> 1) == NamesComputer.namesStartingWithEachLetterImperative(List("Alice", "Billy", "Caleb")))
        //assert(!NamesComputer.namesStartingWithEachLetterImperative(List("Alice", "Billy", "Caleb")).contains("D"))
    }

    test("Many Names Imperative") {
        assert( Map("A" -> 4, "B" -> 3, "D" -> 1, "G" -> 1, "H" -> 1, "T" -> 2, "M" -> 2, "F" -> 1, "N" -> 1, "Y" -> 1) == NamesComputer.namesStartingWithEachLetterImperative(List("Asdf", "Asd", "Asdf", "Afff", "Bbbb", "Bob", "Billy", "Dde", "Guy", "Hello", "Test", "Many", "More", "Fun", "Names", "Thank", "You")))
    }
