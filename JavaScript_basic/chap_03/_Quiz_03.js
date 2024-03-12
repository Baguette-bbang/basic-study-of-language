let a = 1;
let b = 2;

{
    a = 3;
    let b = 4;

    console.log(a, b);
}

console.log(a, b);

//  어떤 값이 출력될까요? 
// 3, 4
// 3, 2
console.log("-----------------------------");

const score = 85;
// 위와 같이 `score` 란 상수가 있을 때, 아래와 같이 학점을 출력하는 코드를 `if` 문으로 작성해보세요.

// 90점 이상은 A
// 80점 이상 90점 미만은 B
// 70점 이상 80점 미만은 C
// 60점 이상 70점 미만은 D
// 60점 미만은 F
if (score >= 90) {
  console.log("A");
} else if (score >= 80) {
  console.log("B");
} else if (score >= 70) {
  console.log("C");
} else if (score >= 60) {
  console.log("D");
} else {
  console.log("F");
}

console.log("-----------------------------");

const food = 'suchi'; // risotto, burger, suchi 등으로 변경

// `food` 에 이름이 들어간 음식이 속하는 카테고리를 출력하는 함수 `switch`  문을 작성하세요. 조건은 아래와 같습니다.

// ‘pizza’와 ‘risotto’, ‘pasta’는 **‘Italian’**으로,
// ‘burger’는 **‘American’**으로,
// 기타 음식은 **‘Unknown’**으로 분류됩니다.

switch (food) {
  case 'pasta' :
  case 'risotto' :
  case 'pasta' :
    console.log("Italian");
  break;
  case 'burger' :
    console.log("American");
    break;
  default :
    console.log("Unknown");
    break;
}

console.log("-----------------------------");

// for 문을 활용해서 1~20까지의 숫자 중 짝수를 로그에 찍는 코드를 작성하세요.
for(let i = 1; i < 21; i++) {
  if (i%2==0) {
    console.log(i);
  }
}

console.log("-----------------------------");

const numbers = [1, 2, 3, 4, 5];
let sum = 0;
//  배열 안의 숫자를 모두 더하는 코드를 작성해보세요.
numbers.forEach(num => {sum += num;})
console.log(sum)

console.log("-----------------------------");

let user = {id: 1, name: 'Alice', job: 'Developer'};

//  for문을 사용해서 name을 제외한 정보들을 출력하는 코드를 작성해보세요.

//  목표 결과:
//  id: 1
//  job: Developer

for (let info in user) {
  if (info !== 'name') {
    console.log(info + ": "+ user[info]);
  }
}

console.log("-----------------------------");

let count = 5;

//  count가 0이 될 때까지, 해당 값에 10을 곱한 값을 출력하는 코드를
//  while문으로 작성해보세요.

//  예시

while (count > 0) {
  console.log(count * 10);
  count -= 1;
}