// prototype object
const bankaccount={
    balance:1000,
    deposit:function(amt)
            {
                this.balance+=amt;
            },
    withdraw:function(amt)
    {
        this.balance-=amt;
    },
    getBalance:function(amt)
    {
        return this.balance;
    }
 
}
 
let savingaccount=Object.create(bankaccount);
savingaccount.accno="sb001";
savingaccount.accholder="Rakesh";
savingaccount.bank="hdfc";
savingaccount.branch="bangalore BTM";
 
let currentaccount=Object.create(bankaccount);
currentaccount.accno="cb001";
currentaccount.accholder="Rakesh";
currentaccount.bank="hdfc";
currentaccount.branch="bangalore BTM";
 
console.log(savingaccount.accholder)
savingaccount.deposit(120000);
savingaccount.withdraw(21000);
console.log(savingaccount.getBalance());
console.log(currentaccount.accholder)
currentaccount.deposit(1000000);
currentaccount.withdraw(50000);
console.log(currentaccount.getBalance());




// prototype inheritance
class BankAccount{
    constructor(balance)
    {
       
        this.balance=balance;
    }
    deposit=function(amt)
            {
                this.balance+=amt;
            }
    withdraw=function(amt)
    {
        this.balance-=amt;
    }
    getBalance=function()
    {
        return this.balance;
    }
 
}

 let savingaccount1=new BankAccount(1000);
savingaccount1.accno="sb001";
savingaccount1.accholder="Rakesh";
savingaccount1.bank="hdfc"; 
savingaccount1.branch="bangalore BTM";
console.log(savingaccount1.accholder);
savingaccount1.deposit(120000);
console.log(savingaccount1.getBalance());
 
 

class bankaccount1
{
    constructor(balance)
    {
        this.balance=balance;
    }
    deposit=function(amt)
            {
                this.balance+=amt;
            }
    withdraw=function(amt)
    {
        this.balance-=amt;
    }
    getBalance=function(amt)
    {
        return this.balance;
    }
 
};
 



let bank=new bankaccount1(10000);
bank.deposit(200000);
console.log(bank.getBalance());

let businessbankaccount=Object.create(bankaccount,{accno:{value:"bba01",configurable:true,writable:true,enumerable:true},holder:{value:"astosh",writable:false,configurable:true,enumerable:true},balance:{value:1,writable:true},deposit:{value:function(amt){this.balance+=amt;},writable:true,configurable:true},withdraw:{value:function(amt){this.balance-=amt;},writable:true,configurable:true}});
businessbankaccount.holder="abcd";
console.log(businessbankaccount.holder);
console.log(businessbankaccount.balance);
businessbankaccount.deposit(2000);
console.log(businessbankaccount.balance);
businessbankaccount.withdraw(500);
console.log(businessbankaccount.balance);

 