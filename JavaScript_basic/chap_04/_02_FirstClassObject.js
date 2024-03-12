// ⭐️ 함수의 자료형
function addNumbers (a, b) { return a + b; }
console.log(typeof addNumbers);

console.log("-----------------------------");

function isOddNum (number) {
  console.log(
    (number % 2 ? '홀' : '짝')
    + '수입니다.'
  );
  return number % 2 ? true : false;
};

const checkIfOdd = isOddNum; // 뒤에 괄호 없음 유의
console.log(checkIfOdd(23));

console.log("-----------------------------");

let x = 7, y = 3;

let func1 = (a, b) => a + b;
let func2 = (a, b) => a - b;
console.log(func1(x, y), func2(x, y));

console.log("-----------------------------");

// 함수도 객체와 배열처럼 참조타입
func1 = func2
console.log(func1(x, y), func2(x, y));

console.log("-----------------------------");

let person = {
  name: '홍길동',
  age: 30,
  married: true,
  introduce: function () {
    return `저는 ${this.name}, ${this.age}살이고 `
    + `${this.married ? '기혼' : '미혼'}입니다.`;
  }
}

console.log(person.introduce()); 

console.log("-----------------------------");

let list = [1, 2, 3, 4, 5];

function doInArray (array, func) {
  for (item of array) {
    func(item);
  }
}

// console.log - console이란 객체에서 log란 키에 할당된 함수
doInArray(list, console.log);
// 함수를 다른 함수의 인자로서 전달.
console.log("-----------------------------");

function doNTimes (func, repeat, x, y) {
  let result = x;
  for (i = 0; i < repeat; i++) {
    result = func(result, y);
  } 
  return result;
}

console.log(
  doNTimes((x, y) => x * y, 3, 5, 2), // 40
  doNTimes((x, y) => x / y, 3, 5, 2), // 0.625
);

console.log("-----------------------------");

// calculate
const add = (a, b) => a + b;
const subtract = (a, b) => a - b;
const multiply = (a, b) => a * b;

// evaluate
const isOdd = (number) => !!(number % 2);
const isPositive = (number) => number > 0;

function calcAndEval (calc, eval, x, y) {
  return eval(calc(x, y));
}

console.log(
  calcAndEval(add, isOdd, 5, 7), // false
  calcAndEval(subtract, isPositive, 5, 7), // false
  calcAndEval(multiply, isOdd, 5, 7) // true
);

console.log("-----------------------------");

// 함수를 결과값으로서 반환하는 형태
function getIntroFunc (name, formal) {
  return formal
  ? function () {
    console.log(`안녕하십니까, ${name}입니다.`);
  } : function () {
    console.log(`안녕하세요~ ${name}이라고 해요.`);
  }
}

const hongIntro = getIntroFunc('홍길동', true); 
const jeonIntro = getIntroFunc('전우치', false); 

hongIntro();  // 안녕하십니까, 홍길동입니다.
jeonIntro(); // 안녕하세요~ 전우치이라고 해요.

console.log("-----------------------------");

const add1 = (a, b) => a + b;
const sub = (a, b) => a - b;
const mul = (a, b) => a * b;
const div = (a, b) => a / b;

function comb3ArmFuncs(armFunc1, armFunc2, armFunc3) {
  return (x, y) => armFunc3(armFunc2(armFunc1(x, y), y), y);
}

const add_mul_sub = comb3ArmFuncs(add1, mul, sub);
const mul_add_div = comb3ArmFuncs(mul, add1, div);
const div_add_mul = comb3ArmFuncs(div, add1, mul);
console.log(
  add_mul_sub(10, 4), // 14 -> 56 -> 52
  mul_add_div(10, 4), // 40-> 44 -> 11
  div_add_mul(10, 4) // 26
);

console.log("-----------------------------");
// 💡 커링 currying
//필요한 인자보다 적은 수의 인자를 받으면, 나머지 인자를 인자로 받는 다른 함수를 반환

// 기존의 코드
function addMultSubt (a, b, c, d) {
  return (a + b) * c - d;
}

const addMultSubt2 = (a, b, c, d) => (a + b) * c - d;

console.log(
  "커링 적용 전",
  addMultSubt(2, 3, 4, 5),
  addMultSubt2(2, 3, 4, 5),
);

console.log("-----------------------------");

// ⭐ 커링으로 작성된 함수
function curryAddMultSubt (a) {
  return function (b) {
    return function (c) {
      return function (d) {
        return (a + b) * c - d;
      }
    }
  }
}

const curryAddMultSubt2 = a => b => c => d => (a + b) * c - d;

console.log(
  "커링 적용 후",
  curryAddMultSubt(2)(3)(4)(5),
  curryAddMultSubt2(2)(3)(4)(5)
);

const curryAddMultSubtFrom2 = curryAddMultSubt(2);
const curryMultSubtFrom5 = curryAddMultSubt(2)(3);
const currySubtFrom20 = curryAddMultSubt(2)(3)(4);

console.log(curryAddMultSubtFrom2);
console.log(curryMultSubtFrom5);
console.log(currySubtFrom20);
// 화살표 함수로 바꾸어 다시 실행해 볼 것

console.log(
  curryAddMultSubtFrom2(3)(4)(5),
  curryMultSubtFrom5(4)(5),
  currySubtFrom20(5)
);