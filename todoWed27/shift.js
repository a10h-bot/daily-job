function shift(array) {
  let j = 0;
  for (let i = 0; i < array.length; i++) {
    if (array[i] <= 0) {
      let temp = array[i];
      array[i] = array[j];
      array[j] = temp;
      j++;
    }
  }
  return array;
}
console.log(shift([1, 3, -1, -8, 9, 10, -7, 0, 5, 2, -2]));
