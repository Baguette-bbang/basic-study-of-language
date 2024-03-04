// 원시 자료형(primitive data types)
const a = true, b = 123.45, c = '안녕하세요!';

// typeof : 객체의 타입을 파악하기 위함.
console.log(a, typeof a);
console.log(b, typeof b); // 특이하게도 double이나 float가 아닌 number이라는 타입을 반환함.
console.log(c, typeof c);

let d;
console.log(d, typeof d); // undefinded 라는 값을 반환
d = null;
console.log(d, typeof d); // null의 타입이 object 라는 이상한 결과를 출력함 (언어의 설계가 이상함)

// undefined 와 null 과의 차이를 알아야함.
// typeof null이 왜 object라고 하는가?
