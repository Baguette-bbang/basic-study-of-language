let job = '학생';
let age = 17;

console.log(job, age);
console.log(job, typeof job);
console.log(age, typeof age);

age = '열일곱'; // 기존에 number가 담겨있던 변수에 string을 담아도 문제가 되지 않는다.
console.log(age, typeof age);
// 자바스크립트는 동적 타입을 가진 언어

function getUpperCase(str) {
  return str.toUpperCase();
}
console.log(getUpperCase('hello'));
// console.log(getUpperCase(1)); -> 오류