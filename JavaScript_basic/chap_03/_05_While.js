// while - 조건이 참인 동안 반복수행
let x = 0;

while (x < 10) {
  console.log(x++);
}

console.log("-----------------------------");

let x1 = 0;

while (true) {
  if (x1++ >= 5) break; // 😎
  console.log(x1);
}
// 1 ~ 5 출력

console.log("-----------------------------");

// 1, 3, 5, 7을 의도한 코드. 그러나...
// ⚠️ 무한루프! 왜일까? if (x2 % 2 === 0) continue;
// let x2 = 0;
// while (x2 < 14) {
//   if (x2 % 2 === 0) continue;
//   if (x2 > 7) break;
//   console.log(x2++);
// }

// 짧게 짠 수정 코드
let x2 = 0;
while (x2 < 14) {
  if (x2++ % 2 === 0) continue;
  if (x2 > 8) break;
  console.log(x2 - 1);
}

console.log("-----------------------------");

// 가독성 위주로 짠 코드
// 코드에 의도가 드러나도록
let x3 = 0;
while (x3 < 14) {
  const toContinue = x3 % 2 === 0;
  const toBreak = x3 > 7;
  const xNow = x3++;

  if (toContinue) continue;
  if (toBreak) break;

  console.log(xNow);
}

console.log("-----------------------------");

//  더 짧고도 직관성을 유지한 코드의 예
let x4 = 0;
while (x4 < 14) {
  const xNow = x4++;

  if (xNow % 2 === 0) continue;
  if (xNow > 7) break;

  console.log(xNow);
}

console.log("-----------------------------");

// do while - 일단 수행하고 조건을 평가

let x5 = 12;

do {
  console.log(x5++);
} while (x5 < 10);