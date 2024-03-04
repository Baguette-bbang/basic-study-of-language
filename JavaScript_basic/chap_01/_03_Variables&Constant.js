// 예전에는 var를 변수 앞에다가 붙였다.
// 이제는 let과 const를 활용하게 된다.

console.log('Hello,', '철수');

const SALUTATION = 'Hello,'; // 상수: 바뀔 수 없는 값
let person = '철수'; // 변수: 바꿀 수 있는 값
console.log(SALUTATION, person);

person = '영희';
console.log(SALUTATION, person);