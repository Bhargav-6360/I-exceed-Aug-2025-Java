//"use strict";

const { act } = require("react");

 
let age=19;
 
if(age<18)
{
   
    greeting= function ()
     {
        console.log("welcome you all and wait for your turn!");
     };
 
     
}
else
{
     greeting=function()
     {
        console.log("welcome you all and you are all eligible to write the exam!");
     };
}
greeting();


console.log("Hello Bhargav")
console.log("Hello Rakesh");





//Cteating an object by literal
let person = { name: "Bhargav",age: 25,city: "Mysuru",isAvail: true }; 
        console.log(person);
    

//creating an object by constructor
let person1 = new Object();
 person1.name = "Rakesh";
person1.age = 21;   
 person1.city = "Bangalore";
 person1.isAvail = true;
console.log(person1);













 
 
const customer=new Object();
customer.name="Bhargav";
customer.id=43243;
customer.isActive=true;
 
const customer1={
                    name:"Bhargav",
                    id:43434,
                    city:"Bangalore",
                    account:{
                                accno:4343435,
                                type:"sb",
                                balance:100000,
                                deposit:function(amt)
                                {
                                     return this.balance+=amt;  
                                },
                                withdraw:function(amt)
                                {
                                    return this.balance-=amt;
                                }
                                }
                };
 
console.log(customer1.account.deposit(10000));
console.log(customer1.account.withdraw(20000));