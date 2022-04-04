"use strict";
exports.__esModule = true;
console.log("hello");
function add(num1, num2) {
    return num1 + num2;
}
console.log(add(2, 3));
console.log(add("wen ", "shufa"));
function add1(num1, num2) {
    return num1 + num2;
}
console.log(add1(2, 2));
function add2(num1, num2) {
    if (num1) {
        return num1;
    }
    else {
        return num1 + num2;
    }
}
console.log(add2(2));
function add3(num1, num2) {
    if (num2 === void 0) { num2 = 900; }
    return num1 + num2;
}
console.log(add3(2));
console.log("*****************************************");
function disp(person) {
    console.log("".concat(person.name, " live in ").concat(person.country));
}
var p = {
    name: "shufa",
    country: "Singapore"
};
disp(p);
console.log("*****************************************");
var p1 = {
    name: "shufa"
};
function disp1(person) {
    console.log("".concat(person.name, " live in ").concat(person.country));
}
disp1(p1);
console.log("*****************************************");
function createSquare(config) {
    var newSquare = { color: "white", area: 100 };
    if (config.color) {
        newSquare.color = config.color;
    }
    if (config.width) {
        newSquare.area = config.width * config.width;
    }
    return newSquare;
}
var mySquare = createSquare({ color: "black" });
console.log(mySquare);
