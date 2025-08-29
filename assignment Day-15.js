//Object.assign(target, ...sources)

//Copies properties from one or more source objects into a target object.
let target = {a:1};
let source = {b:2, c:3};
Object.assign(target, source);
console.log(target); 
console.log(source); 


//Object.create(proto, [propertiesObject])
// Creates a new object with the specified prototype.
let person = {greet() {console.log("Hello");}};
let user = Object.create(person);
user.name = "Bhargav";
user.greet();
console.log(user.name); 


//Object.defineProperty(obj, prop, descriptor)
// Defines a new property with detailed control.

let user1 = {};
Object.defineProperty(user1, "name", {value:"Bhargav", writable:false});
console.log(user1.name);
user1.name = "Raj";


//Object.defineProperties(obj, props)
//Defines multiple properties at once.

let user2 = {};
Object.defineProperties(user2, {
  name: {value:"Bhargav", writable:true},
  age: {value:22, writable:false}
});
console.log(user2); 


//Object.entries(obj)
//Returns array of [key, value] pairs.

let user3 = {name:"Bhargav", age:22};
console.log(Object.entries(user3)); 



//Object.fromEntries(iterable)
//Converts key-value pairs back into an object.

let arr1 = [["name","Bhargav"],["age",22]];
console.log(Object.fromEntries(arr1)); 


//Object.freeze(obj)
// Freezes an object (no changes allowed).

let user4 = {name:"Bhargav"};
Object.freeze(user4);
user4.name = "Raj"; 
console.log(user4); 



//Object.getOwnPropertyDescriptor(obj, prop)
// Returns property details.

let user5 = {name:"Bhargav"};
console.log(Object.getOwnPropertyDescriptor(user5,"name"));




//Object.getOwnPropertyDescriptors(obj)
//Returns all property descriptors.

let user6 = {name:"Bhargav", age:22};
console.log(Object.getOwnPropertyDescriptors(user6));



//Object.getOwnPropertyNames(obj)
//Returns all property names (including non-enumerable).

let obj1 = Object.create({}, {hidden:{value:42, enumerable:false}});
console.log(Object.getOwnPropertyNames(obj1)); 



//Object.getOwnPropertySymbols(obj)
//Returns array of symbol properties.

let sym = Symbol("id");
let obj2 = {[sym]:123};
console.log(Object.getOwnPropertySymbols(obj2)); 


//Object.getPrototypeOf(obj)
//Gets the prototype of an object.

let arr2 = [];
console.log(Object.getPrototypeOf(arr2) === Array.prototype); 



//Object.hasOwn(obj, prop)
//Checks if property exists directly on object (not via prototype).

let user7 = {name:"Bhargav"};
console.log(Object.hasOwn(user7,"name")); 



// Object.is(value1, value2)
//Strict comparison (better than === for NaN and -0).

console.log(Object.is(NaN, NaN)); 
console.log(Object.is(-0, +0));  


//Object.isExtensible(obj)
//Checks if object allows adding new properties.

let obj3 = {};
console.log(Object.isExtensible(obj3)); 
Object.preventExtensions(obj3);
console.log(Object.isExtensible(obj3)); 




// Object.isFrozen(obj)
//Checks if object is frozen.

let obj4 = {name:"Bhargav"};
Object.freeze(obj4);
console.log(Object.isFrozen(obj4)); 



//Object.isSealed(obj)
//Checks if object is sealed.

let obj5 = {name:"Bhargav"};
Object.seal(obj5);
console.log(Object.isSealed(obj5)); 



// Object.keys(obj)
//Returns array of keys.

let user8 = {name:"Bhargav", age:22};
console.log(Object.keys(user8));



//Object.preventExtensions(obj)
//Prevents new properties from being added.

let obj6 = {name:"Bhargav"};
Object.preventExtensions(obj6);
obj6.age = 22; 
console.log(obj6);



// Object.seal(obj)
// Seals object (can modify existing, but not add/remove).

let obj7 = {name:"Bhargav"};
Object.seal(obj7);
obj7.name = "Raj"; 
delete obj7.name;  



//Object.setPrototypeOf(obj, prototype)
//Sets prototype of object.

let proto1 = {greet(){console.log("Hi!");}};
let obj8 = {};
Object.setPrototypeOf(obj8, proto1);
obj8.greet(); 



//Object.values(obj)
//Returns array of values.

let user9 = {name:"Bhargav", age:22};
console.log(Object.values(user9));





//Object.prototype.constructor
//Specifies the function that created the object.

function Person(name) {
  this.name = name;
}
let p1 = new Person("Bhargav");
console.log(p1.constructor === Person); 

//Object.prototype.hasOwnProperty(prop)
//Checks if the property exists directly on the object (not inherited).

let obj9 = {name:"Bhargav"};
console.log(obj9.hasOwnProperty("name")); 
console.log(obj9.hasOwnProperty("toString")); 




//Object.prototype.isPrototypeOf(obj)
//Checks if an object exists in another object’s prototype chain.

function Person() {}
let p = new Person();
console.log(Person.prototype.isPrototypeOf(p)); 




// Object.prototype.propertyIsEnumerable(prop)
//Checks if a property is enumerable.

let obj10 = {name:"Bhargav"};
console.log(obj10.propertyIsEnumerable("name")); 
console.log(obj10.propertyIsEnumerable("toString")); 




//Object.prototype.toLocaleString()
//Converts object to a locale-specific string (often same as toString).

let num1 = 1234567.89;
console.log(num1.toLocaleString("en-IN"));




//Object.prototype.toString()
//Returns string representation of the object.

let arr3 = [1,2,3];
console.log(arr3.toString()); 
console.log(Object.prototype.toString.call(arr3)); 




//Object.prototype.valueOf()
//Returns the primitive value of an object.

let num2 = new Number(10);
console.log(num2.valueOf()); 




//(Legacy) proto getter/setter
//Gives access to the internal [[Prototype]] (deprecated, avoid using).

let proto = {greet(){console.log("Hi");}};
let obj = {};
obj.__proto__ = proto;
obj.greet(); 