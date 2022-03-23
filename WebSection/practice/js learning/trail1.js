document.write(add(10, 20));
document.write("<br>");
var a = 50;
var b = 100;
document.write(add(a, b) + "<br>");

function add(x, y) {
    return x + y;
}

var a = 100;

square(a);

function square(a) {
    var res = a * a
    document.write(res + "<br>");
    return res;
}