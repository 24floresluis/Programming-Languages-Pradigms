//Given this JavaScript code:

var employment = { 
  salary: 100,
  bonus: function() {
    this.salary *= 1.2;
  }  
}

class Person {}

const jill = new Person();
const jack = new Person();

Object.setPrototypeOf(jill, employment);
Object.setPrototypeOf(jack, employment);

console.log(Object.getPrototypeOf(jill) === Object.getPrototypeOf(jack)); // true

console.log(jill.salary); // 100
console.log(jack.salary); // 100

jill.bonus();

console.log(jill.salary); // 120
console.log(jack.salary); // 100

//The first console.log shows that both the objects, jill and jack,
//share the prototype. The values for salary for each are the same as well,
//initially. But, when the bonus function sets the salary, it changed only for
//the object jill and not for the object jack. Why is that? Explain.

/*
Your response goes here:

Both jill and jack are object copies of the prototype of employment which contains properties salary and the method bonus. Both jill and jack originally have their property salary initialized to 100. When jill.bonus(); is called, the method is performed on the object jill only not on the prototype itself thus only the object of jill has it's salary property set to 120. 

If on the other hand the following line would've been called:

  jill.__proto__.bonus();

This would've called bonus on the prototype of jill which is Person, derived from the object employment which would then set any instance of that prototype's salary property to 120 thus both jill and jack's salary property would then be 120.

*/
