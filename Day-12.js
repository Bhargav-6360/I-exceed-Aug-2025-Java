console.log(Math.PI);           
console.log(Math.round(4.6));   
console.log(Math.floor(4.9));   
console.log(Math.ceil(4.1));    
console.log(Math.trunc(4.7));   

console.log(Math.random());     
console.log(Math.abs(-7));      
console.log(Math.pow(2, 3));    
console.log(Math.sqrt(16));     
console.log(Math.log10(100));   
console.log(Math.max(2, 8, 5)); 
console.log(Math.min(2, 8, 5)); 



let x = 50.5;
let roundedBill=Math.round(x);
console.log(roundedBill);
console.log(Math.abs(x)); 
console.log(Math.sqrt(x));
console.log(Math.floor(x));
console.log(Math.ceil(x));
console.log(Math.trunc(x));


//let randomnum1="0.999";
let randomnum=Math.floor(Math.random() * 10)-1;
let guess =5;
if(guess===randomnum)
{
    console.log("Congratulations");
}
else{
        console.log("Ohh sorry !your guessed number is "+ randomnum);
    }



let n=5;
let i=1;

    for(i=n;i<=5;i++)
    {
        console.log("bhargav");
    }
    if(i<5)
    {
        console.log("bhargav is greater than 5");
    }
    else 
    {
        console.log("bhargav is less than 5");
    }
