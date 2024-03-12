// 인자로 두 개의 값을 받아 그 중 더 큰 값을 반환하는 함수를 작성해보세요. 1강에서 배운 3가지 형태로 각각 선언해보세요.
// 1-1. 가장 기본적인 방법 함수 선언하기
function max1(x, y) {
  return x>= y ? x : y;
}
console.log(max1(1,2)); // 2

// 1-2. 상수나 변수에 함수 대입하기
max2 = function (x, y) {
  return x >= y ? x : y;
}
console.log(max2(1, 2)); // 2

// 1-3. 화살표 함수 사용하기
max3 = (x, y)=> x>= y ? x : y;
console.log(max3(1,2)); // 2

console.log("-----------------------------");

// 아래의 함수 `funcEach`를 작성해보세요.
// 두 개의 인자를 받습니다.
// 첫 번째 인자인 `func` 는 또 다른 함수,
// 두 번째 인자인 `array` 는 배열입니다.
// `array` 안의 모든 요소들을 하나씩 `func` 에 인자로 넣어 실행합니다.
//  호출 예시
// funcEach(console.log, [1, 2, 3]);

function funcEach1(func, array) {
  for (let item of array) {
    func(item);
  }
}
funcEach1(console.log, [1, 2, 3]);

console.log("-----------------------------");

// 위 2번 문제의 함수를, 배열 대신 N개의 인자들을 받는 코드로 다시 작성해보세요.
function funcEach2(func, ...rests) {
  for (let rest of rests) {
    func(rest);
  }
}
funcEach2(console.log, 1, 2, 3);


console.log("-----------------------------");

// 인자로 주어진 숫자를 0이 될 때까지 재귀적으로 출력하는 함수를 작성해보세요.
function recursiveDecrease(num) {
  console.log(num);
  if (num > 0) {
    recursiveDecrease(--num);
  }
}
//  호출 예시
recursiveDecrease(5)

console.log("-----------------------------");

