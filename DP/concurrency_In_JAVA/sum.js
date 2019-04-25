function getSubArrays(array) {
  let res = 0;
  for (let i = 0; i < array.length; i++) {
    for (let j = i; j < array.length; j++) {
      for (let k = i; k <= j; k++) {
        res += array[k];
        console.log(array[k]);
      }
    }
  }
  return res;
}

console.log(getSubArrays([1, 3, 7]));

function getSubArraySum2(array) {
  let res = 0;
  for (let i = 0; i < array.length; i++) {
    let sum = 0;
    for (let j = i; j < array.length; j++) {
      sum += array[j];
      console.log(array[j]);

      res += sum;
    }
  }
  return res;
}
console.log(getSubArraySum2([1, 3, 7]));
