 
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