let slave={name:"pavan"};
let master ={name:"Bhargav",
    displayName:function()
    {
        return this.name;
    },
    calculateHisyear:function(dob)
    {
        this.dob=dob;
        return new Date().getFullYear()-this.dob;
    }
};
console.log(master.displayName());
console.log(master.displayName.bind(slave)());
console.log(master.calculateHisyear(1988));
let slave_age=master.calculateHisyear.bind(slave);
console.log(slave_age(2002));
console.log("---------------------------------------------------");