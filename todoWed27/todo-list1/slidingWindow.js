// Given an array and an integer k, find the maximum for each and every contiguous subarray of size k.
//   Examples :

// Input:
// arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6}
// k = 3
// Output:
// 3 3 4 5 5 5 6

// Input:
// arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
// k = 4
// Output:
// 10 10 10 15 15 90 90

function slidingWindow(array, n) {
  let res = [];
  let max = 0;
  for (let i = 0; i <= array.length - n; i++) {
    max = array[i];
    for (let j = 1; j < n; j++) {
      if (array[i + j] > max);
      max = array[i + j];
    }
    res.push(max);
  }
  return res;
}

let a = [1, 2, 3, 1, 4, 5, 2, 3, 6];
console.log(slidingWindow(a, 3))
//--------------------------------------------------------------------------------------

function twoSum(arr, S) {
  var sums = [];
  var hashTable = {};
  // check each element in array
  for (var i = 0; i < arr.length; i++) {
    // calculate S - current element
    var sumMinusElement = S - arr[i];

    // check if this number exists in hash table
    // if so then we found a pair of numbers that sum to S
    if (hashTable[sumMinusElement] !== undefined) {
      sums.push([arr[i], sumMinusElement]);
    }
    // add the current number to the hash table
    hashTable[arr[i]] = arr[i];
  }
  // return all pairs of integers that sum to S
  return sums;

}
console.log(twoSum([3, 5, 2, -4, 8, 11], 7));
//--------------------------------------------------------------------------------------------

// find min and max in an array
function minMax(array) {
  if (array[0] <= array[1]) {
    min = array[0];
    max = array[1];
  }
  else {
    min = array[1];
    max = array[0];
  }
  for (let i = 2; i < array.length; i++) {
    if (array[i] < min) {
      min = array[i];
    }
    if (array[i] > max) {
      max = array[i];
    }
  }
  return [min, max];
}
console.log(minMax([20, 3, 8, 9, 10, 7, 12, 1, 19]));
console.log(minMax([10, 8, 9, 4, 4, 10, 7, 18, 4]));

const minMax1 = a => [Math.min(...a), Math.max(...a)];

console.log(minMax1([20, 3, 8, 9, 10, 7, 12, 1, 19]));
