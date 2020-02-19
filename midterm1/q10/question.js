//CHANGE ONLY THE PARAMETERS FOR THE printCrew FUNCTION.
//DON'T CHANGE ANY OTHER LINES and DON'T ADD ANY NEW LINES OF CODE.

const crew = {
  flight: 101,
  pilot: {
    first: 'Sara',
    last: 'Parker'
  },
  copilot: {
    first: 'Mark',
    last: 'Walker'
  }
};

function printCrew({flight: number, pilot: {first}, copilot: {first: copilot}}) {
  console.log(`${number} --- ${first} and ${copilot}`);
}

printCrew(crew); //Should print 101 --- Sara and Mark
