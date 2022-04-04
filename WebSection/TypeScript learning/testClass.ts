export { }

class Trainee {
    // protected traineeName: string;
    // private traineeName: string;
    public traineeName: string;
    constructor(name: string) {
        this.traineeName = name;
    }

    display() {
        return this.traineeName;
    }
}


class JrTrainee extends Trainee {
    constructor(jrName: string) {
        super(jrName);
    }

    // override the parent display method
    display() {
        return `Hello jr, ${this.traineeName}`;
    }

    receiveKt() {
        console.log("KT is in progress");
    }
}

let trainee = new Trainee("shufa");
console.log(trainee.display());
console.log(trainee.traineeName);

let jsTrainee = new JrTrainee("wen");
console.log(jsTrainee.display());
console.log(jsTrainee.traineeName);
jsTrainee.receiveKt();


