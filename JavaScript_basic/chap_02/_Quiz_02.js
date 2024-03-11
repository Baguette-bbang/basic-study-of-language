const a = 5;
const b = "3";

const c = a + b; 

console.log(c);

//  어떤 값이 출력될까요? "53"

const hour = 2;
const minute = 30;

const sentence = `총 경과 시간은 ${hour* 60 + minute}분 입니다.`
console.log(sentence)
//  '총 경과시간은 ~분입니다.'와 같은 문자열이 되도록
//  템플릿 리터럴을 사용해서 작성해보세요.

console.log(
  1 == '1',
  1 === '1',
  1 != '1',
  1 !== '1'
);

// 어떤 값이 출력될까요? true false false true

let x = 3;

console.log(x++, ++x, x--, --x);

// 어떤 값이 출력될까요? 3 5 5 3

let x1 = 5;
let y = 10;
let z = x1 > y && y++;

console.log(y, z);

//  어떤 값이 출력될까요? 10 false

// ‘커피를 마시는 새’라는 책이 있습니다. 페이지수는 500, 품절은 되지 않은 상태고 장르는 판타지, SF, 스릴러입니다. 이 책의 정보를 객체와 배열을 사용하여 표현해보세요.

const book = {
  title : "커피를 마시는 새",
  pages : 500,
  soldOut : false,
  genre : ["Fantasy", "SF", "Thriller"]
};
console.log(book)

let a1 = 10;
let b1 = a1;
a1 = 20;

let c1 = { value: 10 };
let d1 = c1;
c1.value = 20;

console.log(a1, b1, c1.value, d1.value);

//  어떤 값이 출력될까요? 20 10 20 20

