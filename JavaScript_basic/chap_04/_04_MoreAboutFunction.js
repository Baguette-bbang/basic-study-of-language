console.log("-----------------------------");

function outer () {
  const name = '바깥쪽'
  console.log(name, '함수');

  function inner () {
    const name = '안쪽'
    console.log(name, '함수');
  }
  inner();
}

outer();

console.log("-----------------------------");

function addMulSub (x, y) {
  const add = (a, b) => a + b;
  const sub = (a, b) => a - b;
  const mul = (a, b) => a * b;

  return sub(mul(add(x, y), y), y);
}

console.log(addMulSub(8, 3));

console.log("-----------------------------");

function upto5 (x) {
  console.log(x);
  if (x < 5) {
    upto5(x + 1);
  } else {
    console.log('- - -');
  };
}

upto5(1);
upto5(3);
upto5(7);

console.log("-----------------------------");

function fact(x) {
  return x === 0 ? 1 : x * fact(x - 1);
}

console.log(
  fact(1),
  fact(2),
  fact(3),
  fact(4)
)