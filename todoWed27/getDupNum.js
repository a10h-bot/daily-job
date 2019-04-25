//How to find duplicate number on Integer array in Java?
function getUniqArray(array) {
  let res = [];
  let j = 0;
  for (let i = 1; i < array.length - 1; i++) {
    if (array[j] === array[i]) {
      res.push(array[j]);
      j += 2;
    } else {
      res.push(array[j]);
      j++;
    }
  }
  return res;
}
let x = [1, 1, 2, 2, 3, 4, 5];
console.log(getUniqArray(x)); //[1,2,3,4,5]
