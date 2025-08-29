let bankaccount={};
 
Object.defineProperty(bankaccount,"balance",{get:function(){
    return this._balance;
},set:function(amt)
    {
        if(!this._balance)this._balance=0;
 
        this._balance+=amt;
        console.log(`The Deposited amount is ${amt} and the updated balance is ${this._balance}`);
    }
}
);
 
bankaccount.balance=10000;
bankaccount.balance=5000;
 
Object.defineProperty(bankaccount,"withdraw",{
    set:function(amt)
    {
        if(!this._balance)this._balance=0;
        if(amt>this._balance)
        {
            console.log("Insufficient balance");
        }
        else{
            this._balance-=amt;
            console.log(`you withdrawal amount is ${amt} and your current balance is ${this._balance}`);
        }
 
}});
 
bankaccount.withdraw=2000;bankaccount.withdraw=500;bankaccount.withdraw=5000;bankaccount.deposit=10000;
console.log(bankaccount._balance);
console.log("The account balance is "+bankaccount._balance);
console.log("---------------------------------------------------");