function getKthEle(array, k) {
  return array.flat()[k - 1];
}
//__________________________________________________-
function kthSmallest(matrix, k) {
  let m = matrix.length;

  let lower = matrix[0][0];
  let upper = matrix[m - 1][m - 1];

  while (lower < upper) {
    let mid = lower + (upper - lower) / 2;
    let count = count1(matrix, mid);
    if (count < k) {
      lower = mid + 1;
    } else {
      upper = mid;
    }
  }

  return upper;
}
function count1(matrix, target) {
  let m = matrix.length;
  let i = m - 1;
  let j = 0;
  let count = 0;

  while (i >= 0 && j < m) {
    if (matrix[i][j] <= target) {
      count += i + 1;
      j++;
    } else {
      i--;
    }
  }

  return count;
}

let matrix = [[1, 5, 9], [10, 11, 13], [12, 13, 15]];

console.log(kthSmallest(matrix, 8));
