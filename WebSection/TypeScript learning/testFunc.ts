export { }
console.log("hello");

function add(num1, num2) {
    return num1 + num2;
}

console.log(add(2, 3));
console.log(add("wen ", "shufa"));

function add1(num1: number, num2: number) {
    return num1 + num2;
}

console.log(add1(2, 2));


function add2(num1: number, num2?: number) {
    if (num1) {
        return num1;
    } else {
        return num1 + num2;

    }
}

console.log(add2(2));

function add3(num1: number, num2: number = 900) {
    return num1 + num2;
}

console.log(add3(2));

console.log("*****************************************");
function disp(person){
console.log(`${person.name} live in ${person.country}`)

}
let p = {
    name: "shufa",
    country: "Singapore"
}

disp(p);