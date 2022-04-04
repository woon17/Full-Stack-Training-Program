export { }
var var1 = "Welcome to TypeScript Sessions, typescript rapidly grows in programming community";
console.log(var1 + "\n");
var var1 = "DXC learning";
console.log(var1);
var var1 = "Front-end";
console.log(var1);
var var1 = "Back-end";
console.log(var1);

// let a: string = 10;
let name: String = "shufa";
let number: number = 1234;
let isCorrect: boolean = true;

console.log(name);
console.log(number);
console.log(isCorrect);

let stmt: string = `Hello everyone
        My name is ${name}.`;

console.log(stmt);

let n: null = null;
let m: undefined = undefined;
console.log(n);
console.log(m);
let p: number;
console.log(p);

let array1: number[] = [1, 2, 3, 4, 5, 6];
console.log(array1);
let array2: Array<number> = [1, 2, 3, 4, 5];
console.log(array2);

let emp1: [number, string] = [1, "shufa"];
let emp2: [number, string] = [2, "wen"];
console.log(emp1);
console.log(emp2);

enum Color { Red = 5, Green, Blue, White, Black };
let colorChoice: Color = Color.Blue;
console.log(colorChoice);
console.log(Color[colorChoice]);

let xyz: any = "shufa";
console.log(xyz);

xyz = 20;
console.log(xyz);

xyz = true;
console.log(xyz);

let abc: unknown = 10;

console.log(abc);
// console.log((abc as string).toUpperCase());






