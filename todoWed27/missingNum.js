//1.How to find the missing number in integer array of 1 to 10
function getMissingEle(A) {
  let sum = 0;
  for (let i = 0; i < A.length; i++) {
    sum += A[i];
  }
  return (10 * 11) / 2 - sum;
}
let inputArray = [1, 2, 3, 4, 5, 6, 8, 9, 10];

console.log(getMissingEle(inputArray)); //7

//-----------------------------------------------------------

function getMissingEle1(A) {
  A.sort((a, b) => a - b);
  console.log(A);

  let missEle;
  for (let i = 1; i < A.length; i++) {
    if (A[i] - A[i - 1] !== 1) {
      missEle = A[i] - 1;
    }
  }
  return missEle;
}
let inputArray1 = [1, 3, 4, 5, 7, 8, 10, 9, 2];

console.log(getMissingEle1(inputArray1)); //6
//___________________________________________________

function getMissingEle2(A) {
  A.sort((a, b) => a - b);
  console.log(A);

  let missEle;
  for (let i = 1; i < A.length; i++) {
    if (A[i] - A[i - 1] !== 1 && A[i] - A[i - 1] !== 0) {
      missEle = A[i] - 1;
    }
  }
  return missEle;
}
let inputArray2 = [1, 3, 4, 6, 7, 10, 9, 2, 3, 8];

console.log(getMissingEle2(inputArray2)); //5
