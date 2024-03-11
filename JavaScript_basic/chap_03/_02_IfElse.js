// IF 문 기본 사용법
const open = true;

// 한줄 코드
if (open) console.log('영업중입니다.');

// 여러줄 코드 - 블록문 사용
if (open) {
  console.log('환영합니다.');
  console.log('즐거운 쇼핑하세요!');
}

console.log("-----------------------------");

// IF ELSE 문
const x = 20;

if (x % 2) {
  console.log('홀수입니다.');
} else {
  console.log('짝수입니다.');
}

console.log("-----------------------------");

// 중첩 IF문
const x1 = 22;

if (x1 % 4) {
  if (x1 % 2) {
    console.log('홀수입니다.');
  } else {
    console.log('짝수입니다.');
  }
} else {
  console.log('4의 배수입니다.');
}

console.log("-----------------------------");

// if ~ else if ~문
const x2 = 21;

if (x2 % 2) {
  console.log('홀수입니다.');
} else if (x2 % 4) {
  console.log('짝수입니다.');
} else {
  console.log('4의 배수입니다.');
}

console.log("-----------------------------");

// return문: 함수 실행을 완전히 종료 
// 함수, return문을 사용한 IF문
// 점점 실행할 것이 복잡할 경우 매우 유리한 방법
function evalNum () {
  const x = 21;

  if (x % 2) {
    console.log('홀수입니다.');
    return;
  }

  if (x % 4) {
    console.log('짝수입니다.');
    return;
  }

  console.log('4의 배수입니다.');
}

evalNum();
console.log('블록문 바깥');