// 함수를 상수(변수)에 넣기
const addTwoNumber = (one, two) => {
    return one + two;
}

// 함수를 매개변수로 넣기
const wrapperFunction = (func) => {
    const result = func(10,20);
    console.log(result);
}

wrapperFunction(addTwoNumber);

//함수를 반환하기
const returnFunction = () => {
    return addTwoNumber;
}

const result = returnFunction()(15,35);
console.log(result);


