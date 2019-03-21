Daily blog - Day-1 :

Topic : let vs var vs const
=>  So JS is every where these days , wheather you are writing frontend or backend, we have tons of NPM modules(piece of reusuable codes written by many kind geeks) to use in our projects.Before intoduction of ES6 in JS we had only way to tell JS compiler that i am looking for a varriable was to use var keywords, well ES6 bought let and const to declare varriable in completely new way or will almost killed var keyword.

lets undestand how they differ in day to day use in our codes :

1> var =>

var is function scoped.

function varDemo(array) {
  for (var i = 0; i <= array.length - 1; i++) {
    const element = array[i];
    console.log(element); //4, 6, 7, 8, 2
  }
  console.log(i)//5
}
varDemo([4, 6, 7, 8, 2])

2 >let =>

let is block scoped.

function letDemo(array) {
  for (let i = 0; i <= array.length - 1; i++) {
    const element = array[i];
    console.log(element);////4, 6, 7, 8, 2
  }
  console.log(i) //here i is undefined
}
letDemo([4, 6, 7, 8,2])

3> const =>
  the varriable we do not want to re-assign but array can be mutated.

let array1 =[5,8,9,10]
const array =[6,7,8,9]
array.push(10) //its OK here we can change the conent of the array but not reference
array=array1; //error cant re-assign to const
console.log(array);

