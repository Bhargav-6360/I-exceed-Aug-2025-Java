 let marks=43;
 if(marks<40)
{
     console.log("Re appear");
 }
 else if(marks>40 && marks<60)
 {
     console.log("Pass");
 }
 else if(marks>60 && marks<80)
 {
     console.log("A grade");
 }
 else if(marks>80 && marks<=100)
 {
     console.log("A++ grade");
 }
 else{
     console.log("Enter the proper marks");
 marks=83;
 
let res1=marks<40 ? "re-appear" : marks>40&& marks<60 ? "Pass" : marks>60 && marks<80 ? "A grade" : marks>80 && marks<=100?"A++ grade":"Enter proper marks";
console.log(res1);
 
let res2=marks<40 ? "re-appear" : marks>40&& marks<60 ? "Pass" : marks>60 && marks<80 ? "A grade" : marks>80 && marks<=100?"A++ grade":"Enter proper marks";
console.log(res2);


 function validateMe(marks)
 {
   let res=marks<40 ? "re-appear" : marks>40&& marks<60 ? "Pass" : marks>60 && marks<80 ? "A grade" :marks>80 && marks<=100?"A++ grade":"Enter proper marks";
   return res;
 }
 
 console.log(validateMe(22));

// //example of ternary operator
 function attendanceCheck(attendance)
 {
   let res=attendance<75 ? "You are not eligible for exam" : attendance>=75 && attendance<=100 ? "You are eligible for exam" : "Enter proper attendance";
   return res;
 }
  console.log(attendanceCheck(80));
 




//another example of function
  displaybio=function (name, age, city="Mysuru") {
    console.log(name);
    console.log(age);
    console.log(city="Bangalore");
  }
 displaybio("Bhargav", 25,"shivamogga");




let getData=(x,y)=>x+y;
console.log(getData(10,65));
 
let getMe=(x)=>x.toLowerCase();
console.log(getMe("RAKESH"))
console.log(getData(10,43));
 

let getMail=(name, age, city) => name+age+city;+"@"+"gmail.com";
console.log(getMail("Rakesh", 21, "Bangalore"));



let getTrim = (x) => x.trim().replaceAll(" ", "").toUpperCase();

console.log(getTrim("     helloworld    bio    master   "));



getMail=(x="bhargavdangersmiley",y)=> x+ y+"@gmail.com";
console.log(getMail());



function displayData(name,age,city,...args)
{
console.log(name);
  console.log(age);
  console.log(city);
//console.log(arguments);
 
 console.log(args.sort());
 
}
displayData("sathish",43,"salem","Tamilnadu","India","Asia","earth",'milky galaxy');
 }
