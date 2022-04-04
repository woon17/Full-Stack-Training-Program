"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Trainee = /** @class */ (function () {
    function Trainee(name) {
        this.traineeName = name;
    }
    Trainee.prototype.display = function () {
        return this.traineeName;
    };
    return Trainee;
}());
var JrTrainee = /** @class */ (function (_super) {
    __extends(JrTrainee, _super);
    function JrTrainee(jrName) {
        return _super.call(this, jrName) || this;
    }
    // override the parent display method
    JrTrainee.prototype.display = function () {
        return "Hello jr, ".concat(this.traineeName);
    };
    JrTrainee.prototype.receiveKt = function () {
        console.log("KT is in progress");
    };
    return JrTrainee;
}(Trainee));
var trainee = new Trainee("shufa");
console.log(trainee.display());
console.log(trainee.traineeName);
var jsTrainee = new JrTrainee("wen");
console.log(jsTrainee.display());
console.log(jsTrainee.traineeName);
jsTrainee.receiveKt();
