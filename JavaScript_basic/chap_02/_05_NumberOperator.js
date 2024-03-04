let x = 1 / 'abc';
let y = 2 * '가나다';
let z = NaN;

console.log(x, typeof x);
console.log(y, typeof y);
console.log(z, typeof z);

let x1 = 1 / 'abc';

console.log(
  x1,
  x1 == NaN,
  x1 === NaN,
  isNaN(x1), // 숫자가 아닐 시 true
  Number.isNaN(x1) // 보다 엄격한 버전
);