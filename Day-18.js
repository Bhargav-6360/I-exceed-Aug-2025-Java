
function outer()
 {
    let count=67;
 
     function inner()
    {
        count++;
        return count;
        
    }
    return inner();}
 
 
// const counter=outer();
 
 console.log(outer());
 console.log(outer());









//Example of closure
function Circle()
{
    let radius=5;
    let misscircle=10;
    function semicircle()
    {
    //radius++;
    //return radius;
    misscircle++;
    radius--;
    
    return (misscircle,radius)
   // return semicircle;
    }
    return semicircle();
};
console.log(Circle());
console.log(Circle());