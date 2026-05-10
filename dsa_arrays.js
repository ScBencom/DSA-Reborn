// A collection of the values 1, 2 and 3
const arr = [1, 2, 3]

// Each value is related to one another, in the sense that each is indexed in a position of the array
const indexOfTwo = arr.indexOf(2)
console.log(arr[indexOfTwo-1]) // 1
console.log(arr[indexOfTwo+1]) // 3

// We can perform many operations on the array, like pushing new values into it
arr.push(4)
console.log(arr) // [1,2,3,4]

const arr2 = ['a', 'b', 'c', 'd']
console.log(arr2[2]) // c
console.log(arr2.length) //4

//values of anytype
const arr3 = ['store', 1, 'whatever', 2, 'you want', 3]

//Multidimensional Array
const arr4 = [
    [1,2,3],
    [4,5,6],
    [7,8,9],
]