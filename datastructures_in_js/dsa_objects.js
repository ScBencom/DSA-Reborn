//A collection of key-value pairs
// Each key has to be unique

const obj = {
    prop1: "I'm",
    prop2: "an",
    prop3: "object"
}

//Objects in JavaScript can store both values and functions
const obj2 = {
    prop1: "Hello!",
    prop3: function() {console.log("I'm a property dude!")
}}

console.log(obj2.prop1) // "Hello!"
console.log(obj2["prop1"]) // "Hello!"
obj2.prop3() // "I'm a property dude!"

//assigning new values
obj.prop4 = 125
obj["prop5"] = "The new prop on the block"
obj.prop6 = () => console.log("yet another example")

console.log(obj.prop4) // 125
console.log(obj["prop5"]) // "The new prop on the block"
obj.prop6() // "yet another example"


