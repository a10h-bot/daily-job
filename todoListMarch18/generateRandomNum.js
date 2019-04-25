function getRandomNum(min, max) {
  min = Math.ceil(min);
  max = Math.floor(max);
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

console.log(getRandomNum(1, 10));
// Implement a bit array.

// A bit array is a space efficient array that holds a value of 1 or 0 at each index.

//   init(size): initialize the array with size
// set(i, val): updates index at i with val where val is either 1 or 0.
// // get(i): gets the value at index i.
class bitArray {
  constructor() {
    let bitArray = [];
  }
  set(i, val) {
    this.bitArray[i] = val;
  }

  get(i) {
    return this.bitArray[i];
  }
  init(size) {
    this.bitArray = new Array(size);
  }
  getLength() {
    return this.bitArray.length;
  }
}

let x = new bitArray();
x.init(12);
x.set(0, 1);
console.log(x.get(0));

console.log(x.getLength());

var Rectangle = class {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
};

console.log(Rectangle.name);
