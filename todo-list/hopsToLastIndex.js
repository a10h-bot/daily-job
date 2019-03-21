// Daily Coding Problem: Problem #106
// Feb 17, 2019, 10: 41 PM(17 hours ago)
// Good morning! Here's your coding interview problem for today.
// This problem was asked by Pinterest.

// Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.

// For example, [2, 0, 1, 0] returns true while [1, 1, 0, 1] returns false.

function hopsTolastIndex(array) {
  let res = true;
  for (let index = 0; index < array.length; index++) {
    const element = array[index];
    if (element === 0 && index !== array.length - 1)
      res = false;
    index += element;
  }
  return res;
}
console.log(hopsTolastIndex([2, 0, 1, 0]));
console.log(hopsTolastIndex([1, 1, 0, 1]));
console.log(hopsTolastIndex([0, 0, 1]));
