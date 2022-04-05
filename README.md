# Full-Stack-Training-Program 
Spring Boot / Angular / Java / Html / CSS
### Duration: 7 weeks 

### Editors: 
<!-- TODO: add links to download -->
- Visual Studio Code: used for web development
- Eclipse IDE for Java Developer: used for Java learning

How to preview github HTML files:
```
add: https://htmlpreview.github.io/?
```

Practice for Java Section:
- [Practice code for Java](https://github.com/woon17/Full-Stack-Training-Program/tree/main/JavaSection/testproject/src/testproject)
- [Practice problem 1](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/Problem1.java)
- [Practice problem 2](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/Problem2.java)
- [Practice problem 3](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchArrayList.java)
- Other practice: [26 letters](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/letters.java)
- [TicTacToe Game (Play1 & Computer)](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/TicTacToe/src/Games/LaunchGamesOnePlayer.java)     
- [TicTacToe Game (Play1 & Play2)](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/TicTacToe/src/Games/LaunchGamesTwoPlayers.java)    
- [Hotel Bill Management](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/HotelManagement/src/hotelManagement/HotelManagement.java) 
- [School Management System](https://github.com/woon17/Full-Stack-Training-Program/tree/main/JavaSection/SchoolManagementSystem/src/schoolmanagementsystem)
- [Guess Game](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/HotelManagement/src/hotelManagement/HotelManagement.java) 
- [Java simple Web Application with database](https://github.com/woon17/Full-Stack-Training-Program/tree/main/Result1)


Practice for Web Section:
- [Practice code for Web Section](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice)
- [Sports activities website](https://github.com/woon17/sports-activities-system)
<!-- - [Sports activities website by HTML only](https://github.com/woon17/Full-Stack-Training-Program/tree/HtmlOnly/WebSection/sportsActivities)
- [Sports activities website with CSS](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/sportsActivities) -->
- [board.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/ChessBoard/board.html) · 
- [chessboard.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/ChessBoard/chessboard.html) 
<!-- TODO: need to start to add different version of porfolio and deploy by github.io -->
- [Portfolio](https://github.com/woon17/portfolio)
- [Resume](https://github.com/woon17/Full-Stack-Training-Program/tree/main/JavaSection/MiniProject/src/MiniProject)

Practice for JavaScript section:
- [Practice code for JavaScript](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/js%20learning)

***

### Week 5
- <strong><em>Day 1</em></strong>:
    | Section        | topic                                                                                                                                                                         | task                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
    | -------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Servlet · JSP · Session`                                                                                                                                                     | [ResultWithVerification](https://github.com/woon17/Full-Stack-Training-Program/tree/main/ResultWithVerification)   ·  [Result1](https://github.com/woon17/Full-Stack-Training-Program/tree/main/Result1) ·  [ResultWithVerificationWithSession](https://github.com/woon17/Full-Stack-Training-Program/tree/main/ResultWithVerificationWithSession) ·  [InsertionToDatabase](https://github.com/woon17/Full-Stack-Training-Program/tree/main/InsertionToDatabase) |
    | *Web Section*  | ` TypeScript Interface · TypeScript optional field · TypeScript inheritance · TypeScript method overriding · TypeScript access modifier · TypeScript extends class · Angular` | [testClass.ts](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/hotelManagement.html) · [testFunc.ts ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/TypeScript%20learning/testFunc.ts) · [Angular demo-proj ](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/Angular/demo-proj)                                                                       |

1. 	Interface example:
	```
    interface LabeledValue {
	  label: string;
	}
	 
	function printLabel(labeledObj: LabeledValue) {
	  console.log(labeledObj.label);
	}
	 
	let myObj = { size: 10, label: "Size 10 Object" };
    printLabel(myObj);
    ``` 
2.  Use the extends keyword to allow a class to inherit from another class. Use super() in the constructor of the child class to call the constructor of the parent class. Also, use the super.methodInParentClass() syntax to invoke the methodInParentClass() in the method of the child class.

3. Access modifier: 	
    - private : The private modifier limits the visibility to the same-class only.
	- public： The public modifier allows class properties and methods to be accessible from all locations.
    - protected: The protected modifier allows properties and methods of a class to be accessible within same class and within subclasses.

4. Angula:
    1. Modular approach - Modular approach for angular project: every feature is treated as a separate/individual modular
    2. Re-usable code - Angular is famous as it is re-usable code
    3. Quick and easy development - Less time to develop and easier to develop 
    4. Unit testable - unit level test
    5. If ur application is depends on more on js, it is a good  choice to use angular framework
    6. Angular will help website to load fast. Like only load necessary data. 

5. Prerequisites: HTML, CSS, JS
	1. [Node.js](https://nodejs.org/en/download/)
	2. Npm - npm install -g @angular/cli
	3. Angular cli
	4. Vs cide
6. Command used:
	1. ng -v
	2. Ng new projectName
    3. Ng serve

- <strong><em>Day 2</em></strong>:
    | Section        | topic                                                                                            | task                                                                                                                                                                                                                                                 |
    | -------------- | ------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Web.xml for v2.4 · MVC`                                                                         | [InsertionAndSelection](https://github.com/woon17/Full-Stack-Training-Program/tree/main/InsertionAndSelection/src/main)   ·  [InsertionSelectionMVC](https://github.com/woon17/Full-Stack-Training-Program/tree/main/InsertionSelectionMVC/src/main) |
    | *Web Section*  | ` Angular modules · Angular components · Angular Selector · Angular templates  · Angular styles` | [demo-proj](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/Angular/demo-proj) · [Test ](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/Angular/Test)                                         |

1. MVC example:
    - Client<-->view: Client visit index.html, index.html shows the form 
    - View -> controller: once submit, input.java(sevlet controller) collect data from view
    - Controller -> model: give value to model.java though setter (use getter to get information from model)
    - Model -> controller: give 0, 1 to controller by call model.java getter 
2. only view interact with client; only model interact with database; only use controller to talk with view and model, no direct access from model to view
3. An angular application is a collection of individual modules
4. Modules Is a feature in Angular application. It is a collection of one (or more) components and services
5. Component - consist of HTML template, class
6. Selector options: [app.component.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/Angular/demo-proj/src/app/app.component.html)
    - Custom tag: [demo123.component.ts ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/Angular/demo-proj/src/app/demo123/demo123.component.ts) -> app-demo123
    - Class selector: [test.component.ts](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/Angular/demo-proj/src/app/test/test.component.ts) -> .app-test
    - Enclose it in [ ] as attribute: [demo.component.ts](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/Angular/demo-proj/src/app/demo/demo.component.ts) -> app-demo
7. [component & module](https://stackoverflow.com/questions/40073941/whats-the-difference-between-an-angular-component-and-module)
8. Create test component: `ng g c test`
9. start application: `ng serve`
### Week 4
Practice for Java:
- [Hotel Bill Management](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/HotelManagement/src/hotelManagement/HotelManagement.java) 
- [School Management System](https://github.com/woon17/Full-Stack-Training-Program/tree/main/JavaSection/SchoolManagementSystem/src/schoolmanagementsystem)

- <strong><em>Day 1</em></strong>:
    | Section        | topic                                                                                                            | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
    | -------------- | ---------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Multiple Thread · runnable interface · Producer and consumer problem`                                           | [LaunchBathroomWithoutLock.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchBathroomWithoutLock.java)   ·  [LaunchBathroomWithLock.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchBathroomWithLock.java) ·  [LaunchLockThreeResources.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchLockThreeResources.java) ·  [LaunchProducerConsumer.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchProducerConsumer.java)              |
    | *Web Section*  | ` JavaScript Date object· JavaScript String object · JavaScript Maths object · JavaScript regularExpression ·  ` | [hotelManagement.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/hotelManagement.html) · [regularExpression.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/regularExpression.html) · [jsDemo3.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsDemo3.html) · [mathObj.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/mathObj.html) · [sringObj.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/sringObj.html) |

1. Dead lock: a condition when two or more threads try to access the same resources at the same time
2. Regular expression: (https://regex101.com/)


- <strong><em>Day 2</em></strong>:
    | Section        | topic                                                                                                                                              | task                                                                                                                                                                                                                                                                                                         |
    | -------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
    | *Java Section* | `File handling · Serialisation · deserialization`                                                                                                  | [LaunchFileHandling.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchFileHandling.java)   ·  [LaunchActor.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchActor.java) |
    | *Web Section*  | ` JavaScript Regular expression · Regular expression MetaCharacters · Regular expression Quantifiers · JavaScript Object oriented programming ·  ` | [regularExpression.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/regularExpression.html) · [classOOP.html.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/classOOP.html)                 |

1. MetaCharacters
	- w -> will only look for words in the given string (without special symbols)
	- W -> it will only look for characters apart from words/alphabets (choose digits, special symbols)
	- d -> will only find numbers in the string
	- D -> will find everything apart from digits in a string
	- s -> will find the white space in a string 
	- S -> will find everything apart from whitespace
	- b -> find matches that have beginning/end of the word 
	- B -> find matches that do not have the beginning/end of a word
	- f -> find the form feed character
	- r -> find a carriage return character.
	- t -> find a tab character
2. Quantifiers:(n can be any character)
	- n+  -> any string that contains at least one n
	- n* -> string a with zero or more occurrence of n  
	- n? -> string with zero or more occurrence of n
	- n{X} -> sequence of x no of n's
	- n(x,y) -> x-y n's
	- n{x, } -> minimum x no of n's 
n$ -> a word that has n in the end
3. Object oriented programming:
	- Encapsulation: 
	- Polymorphism
	- Inheritance: 
	    - ingle inheritance
		- Multi-level inheritance
		- Hierarchal inheritance
		- Not support multiple inheritance 
	- Overriding
	- abstraction

- <strong><em>Day 3</em></strong>:
    | Section        | topic                                                                                                      | task                                                                                                                                                                                                                                                                                                                                                                                                                     |
    | -------------- | ---------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
    | *Java Section* | `Framework · collection  · Wrapper class · bubble sorts`                                                   | [LaunchArrayList.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchArrayList.java)                                                                                                                                                                                                                                                                     |
    | *Web Section*  | ` JavaScript Call back · JavaScript Template literals  · JavaScript promise ·  JavaScript form validation` | [callBack.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/callBack.html) · [promiseCar.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/promiseCar.html) · [form.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/learn%20validation/form.html) |

1. Diadvantage: aList.add(1, "index1"), all index >1, need to shift to right one index. If there are 10000 element, means 10000 need to shift, time consumer. That is why we use collection linkedlist
2. linkedList and priorityQueue is good for insetion and deletion, but not good at seaching
TreeSet is good for searching.
3. Promise: resolve, .then, rejected, .catch

- <strong><em>Day 4</em></strong>:
    | Section        | topic                                                                                                                                                | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
    | -------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Jdbc`                                                                                                                                               | [MyFirstJDBC.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/jdbc/src/jdbc/MyFirstJDBC.java)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
    | *Web Section*  | ` JavaScript Async & await  · JavaScript Local and global variable · JavaScript scope chaining  · JavaScript Closures  ·  JavaScript Event handling` | [asyncAwaitForPromiseCar.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/asyncAwaitForPromiseCar.html) · [asyncAwaitForPromise.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/asyncAwaitForPromise.html) · [eventHandling.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/eventHandling.html) · [scopeTesting.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/scopeTesting.html) |

1. Async can be used in order to create a promise.
Await can be used whenever we use .then 
2. Async format:
    ```
    Async function order(){
        Try{
            Await xyz; 
        
        } catch(error){
            document.write("xyz does not exist <br>")
        } finally{
            document.write("This block will execute <br>");
        }
    }
    Order() ; 
    ```
3. Promise learning resources: [Resource1](https://ponyfoo.com/articles/es6-promises-in-depth) [Resource2](http://bevacqua.github.io/promisees/)
4. Closures in JavaScript: A function is declared with in another function
    ```
    function a(){
        function b(){
        }
        return b();
    }
    ```
5. Event handling in JS:
   - click
   - Mouse over
   - mouseout
   - mousedown
   - mouseup
   - mousemove
   - Keydown/keyup
   - focus
   - submit
   - change

- <strong><em>Day 5</em></strong>:
    | Section        | topic                                                                | task                                                                                                                                                                                                                                                                                                                                                                              |
    | -------------- | -------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Batch  · Rollback `                                                 | [FirstProject](https://github.com/woon17/Full-Stack-Training-Program/tree/main/FirstProject)  · [SecondProject](https://github.com/woon17/Full-Stack-Training-Program/tree/main/SecondProject)· [ThirdProject](https://github.com/woon17/Full-Stack-Training-Program/tree/main/ThirdProject) · [Result1](https://github.com/woon17/Full-Stack-Training-Program/tree/main/Result1) |
    | *Web Section*  | ` TypeScript  · TypeScript Global scope · TypeScript function scope` | [test.ts ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/TypeScript%20learning/test.ts) · [testFunc.ts ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/TypeScript%20learning/testFunc.ts)                                                                                                                               |

1. Different projects for simple practice:
   - [FirstProject](https://github.com/woon17/Full-Stack-Training-Program/tree/main/FirstProject): Request to connect to server by HTML(only using hello.html)
   - [SecondProject](https://github.com/woon17/Full-Stack-Training-Program/tree/main/SecondProject): Request to connect to server (uDemo.java -> hello.html)
   - [ThirdProject](https://github.com/woon17/Full-Stack-Training-Program/tree/main/ThirdProject): Request to connect to server by Servlet(only using Display.java)
   - [Result1](https://github.com/woon17/Full-Stack-Training-Program/tree/main/Result1): Request to connect to server with jdbc(getDisplay.java -> display.html)
2. Run file.ts:
	1. Compile: `tsc file.ts` or `tsc.cmd test.ts`  ---> get file.js
	2. Execute: `node file.js`
    3. `tsc file --watch`
3. Typescript:
   - Global scope and function scope
   - No block scope for type script

### Week 3
Practice for Java:
- [Hotel Bill Management](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/HotelManagement/src/hotelManagement/HotelManagement.java) 
- [School Management System](https://github.com/woon17/Full-Stack-Training-Program/tree/main/JavaSection/SchoolManagementSystem/src/schoolmanagementsystem)

Practice for Web:



- <strong><em>Day 1</em></strong>:
    | Section        | topic                                   | task                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
    | -------------- | --------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Overriding`                            | [LaunchParent.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchParent.java)   ·  [LaunchDemo1.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDemo1.java) · [Hotel Bill Management](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/HotelManagement/src/hotelManagement/HotelManagement.java) |
    | *Web Section*  | ` JavaScript · Navigation bar ·  · ·  ` | [SimpleNavigationBar ](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index2.html) · [index1.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index1.html) · [inputTypes.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/inputTypes.html)                                                                  |

1. Rules for overriding:
	1. Cannot reduce the visibility of the inherited method from Exmp1; public(parent) reduced to default(child), which is not allowed.
    1. Cannot change the return type of the override method, but if the return types are parent-child relationship and obey rule1 (not reduce the visibility), then it is allowed (Covariant return type).
2. Covariant return type for overriding: Animal(for parent) - Tiger(for child) return type
3. Accessibility: follow the order. Need to consider when overriding occurs
	1. Public: most
	2. Protected 
	3. Default
    4. Private: least

<!-- TODO: need to update the day2 links -->
- <strong><em>Day 2</em></strong>:
    | Section        | topic                                                                                     | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
    | -------------- | ----------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Inheritance · Abstraction · Static method override · Final · Abstract class`             | [LaunchArea.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchArea.java)   ·  [LaunchBird.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchBird.java) · [LaunchDemo3.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDemo3.java) · [LaunchDemo4.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDemo4.java) · [LaunchPlane.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchPlane.java) · [LaunchPlaneAbstrac.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchPlaneAbstrac.java) |
    | *Web Section*  | ` JavaScript Datatype  · JavaScript Operators · JavaScript control stmt · Type operator ` | [jsDemo1.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsDemo1.html) · [trail.js](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/trail.js)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |

1. For static inheritance, if parent method is static, child must be static.
2. If parent method is not static, child method must not be static
3. method hiding: override static method. (LaunchDemo3.java)
4. Final class: no one can inheritance the final class
5. Final method: can inheritance the final method, but cannot override/modify the final method
6. Abstract class: like an incomplete class, so we cannot create instance for abstract class(cannot 
    instantiation). But we can create reference of the abstract class. 
7. There is constructor in abstract class as its child has constructor and the first line is super(). It means there is constructor in abstract class
8. Rules for abstract class:
	1. Final and abstract cannot used together.  "final abstract" is contradiction. Final means no body can modify. Abstract means need to implement the method body 
	2. It is okay if abstract class contains only concrete methods. 
	3. All abstract methods in the abstract class must be implements by its children
9. Losse coupling/flexible: parent reference = child object; tight coupling: child type 1 = child type 2(it is not allowed).


- <strong><em>Day 3</em></strong>:
    | Section        | topic                                                                                                                                           | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
    | -------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Interface · Exception handling · User defined exception handling`                                                                              | [LaunchInterface.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchInterface.java)   ·  [LaunchInterface2.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchInterface2.java) · [LaunchInterface3.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchInterface3.java) |
    | *Web Section*  | ` JavaScript For-in and for-of  · JavaScript Pop-up boxes · JavaScript No Script tag · JavaScript Exception handler · JavaScript in-built func` | [jsDemo1.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsDemo1.html) · [trail.js](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/trail.js)                                                                                                                                                                                                                  |

1. Create the reference of interface is allowed          
2. Rule:
	1. Any number method in interface
	2. Cannot create object for interface
	3. Can use interface reference
	4. All method in interface, must be implement in implement class. Or some methods is not implement in implement class. Then the implement class must be abstract class.
	5. For class, no diamond shape extends. But it is okay for interface (one class can implements multiple interface)                                    
3. Error and exception: Compile time mistake is compile time errors. Runtime mistake is exception, only can detect when we execute program. Exception not occurred in compile time, occur in runtime. Eg. java.lang.ArrayIndexOutOfBoundsException
4. Pop-up in JS:
	1. Alert Box
	2. Confirmation Box
	3. Prompt Box
5. No Script tag: similar to java exception handling
    ```
    <script> and <noscript> only execute one of them.
        • Using <noscript> in body if we use <script> in html
            <noscript>
                Please enable JavaScript in the setting
            </noscript>
    ```

- <strong><em>Day 4</em></strong>:
    | Section        | topic                                                           | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
    | -------------- | --------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Exception handling · User defined exception handling · throws` | [LaunchExceptionHandling1.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchExceptionHandling1.java)   ·  [LaunchExceptionHandling2.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchExceptionHandling2.java) · [ATMSystem.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/ATMSystem.java) · [LaunchTP.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchTP.java) |
    | *Web Section*  | `JavaScript in-built func`                                      | [jsDemo1.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsDemo1.html) · [jsDemo2.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsDemo2.html)                                                                                                                                                                                                                                                                                                                                                                      |
1. Create custom exception, two things need to consider:
	1. What type of exception we want to create: it is a child of exception (extends Exception)
	2. Override getMessage();


- <strong><em>Day 5</em></strong>:
    | Section        | topic                                                                    | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
    | -------------- | ------------------------------------------------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | ` extends Thread · use Runnable interface · thread name`                 | [LaunchActivityMutiThreadByThreadName.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchActivityMutiThreadByThreadName.java)   ·  [LaunchActivityMultiThreadByRunnable.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchActivityMultiThreadByRunnable.java) · [LaunchActivityMutiThreadByThreadNames.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchActivityMutiThreadByThreadNames.java) |
    | *Web Section*  | `JavaScript Object creation · JavaScript Arrow function · Number Object` | [jsDemo2.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsDemo2.html) · [jsDemo3.html ](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsDemo3.html) · [jsObject.js](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/js%20learning/jsObject.js)                                                                                                                                                                                                    |
1. Single thread: have the dependency, need to do one subtask one by one. 
2. Sub class of Thread class, override run(). Call subclass with start(), then thread scheduler will arrange different threads to execute.
3. Using threadNames to do multiThread
### Week 2

Practice for Java:
- [TicTacToe Game (Play1 & Computer)](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/TicTacToe/src/Games/LaunchGamesOnePlayer.java)     
- [TicTacToe Game (Play1 & Play2)](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/TicTacToe/src/Games/LaunchGamesTwoPlayers.java)   


Practice for Web:
- [Board](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/ChessBoard/board.html)
- [Chessboard](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/ChessBoard/chessboard.html) 

- <strong><em>Day 1</em></strong>:
    | Section        | topic                                                                    | task                                                                                                                                                                                                                                                                                                                                                                                   |
    | -------------- | ------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Variables · anonymous object`                                           | [LaunchDog.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDog.java)                                                                                                                                                                                                                                               |
    | *Web Section*  | `HTML · clickable image · Iframe · HTML Input type· Single page website` | [index2.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index2.html) · [index1.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index1.html) · [inputTypes.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/inputTypes.html) |

1. Instance variable can choose not to initialise.
But for local variables, must initialise it
2. anonymous object: If you have to use an object only once, an anonymous object is a good approach.

- <strong><em>Day 2</em></strong>: 
    | Section        | topic                                                                                    | task                                                                                                                                                                                                                                                                                                        |
    | -------------- | ---------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `encapsulation · polymorphism · Inheritance · Abstraction · constructor · For each loop` | [LaunchForEach.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchForEach.java) [LaunchSubstraction.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchSubstraction.java) |
    | *Web Section*  | `HTML · legend tag for forms · CSS`                                                      | [forml.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/exercises/forml.html) · [cssPractice.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/exercises/cssPractice.html)                                                 |

1. CSS: style the webpage 

2. Style ways:
	- Inline style attribute (html):
        ```
        <body>
            <p style="color:blue">Hello world</p>
        </body>
        ```
	- Internal stylesheet
        ```
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <style>
                p{
                    color: blue;
                }
            </style>
        </head>
        ```
	- External stylesheet

        ``` 
        external.css: 
        p{
            color:blue;
            background-color: pink;
            font-size: 50px;
            font-family: monospace;
            border: 2px solid rgb(123, 255, 0);
        }
        ```

3. CSS: cascading style sheets
	- It is a style sheet language which is used to give or describe the look and feel of the websites - which is written in markup language

- <strong><em>Day 3</em></strong>: 
    | Section        | topic                                                                                         | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
    | -------------- | --------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Static variable · Static block · Static method · String`                                     | [LaunchSimpleIntererst.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchSimpleInterest.java) · [LaunchObjectsCount.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchObjectsCount.java) · [LaunchStaticPractice.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchStaticPractice.java) · [StringPractice.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/StringPractice.java) |
    | *Web Section*  | `CSS · precedence of the style rules · Different font online · background images · Selectors` | [index4.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/exercises/index4.html) · [hello.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/exercises/hello.html)  · [my profile home page](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/practice/myProfile/home.html)                                                                                                                                                                                                                                                               |
1. Order of the style/precedence of the style rules:    
    - inline style (highest priority)
    - Internal style
    - External style
    - Browser default style
  
2. Types of Selectors
    - Tag selectors:
        ```
        HTML file:
        <tagname></tagname>
        
        CSS file:
        tagname{
            ...
        }
        ```

	- Id selectors:
        ```
        HTML file: 
        <tagname id="idatvalue"></tagname>

        CSS file:
		#idatvalue{
        .. }
        ```
        
	- Class selectors:

        ```
        HTML file:
        <tagname class="classname"></tagname>
        
        CSS file:
        .classname{
            Declaration List 
        }

        OR

        tagname.classname{
            Declaration List 
        }

        ```

	- Group selectors:
  
        ```
        HTML file:
        <tagname1></tagname1>
        <tagname2></tagname2>
        <tagname3></tagname3>
        <tagname4></tagname4>
        
        CSS file:
        tagname1, tagname2, tagname3, tagname4{
            Declaration List 
        }
        ```

	- Combination selectors
	- Contextual selectors 
	- Attribute selectors
	- Pseudo class selectors
	- Pseudo element selectors
Universal selectors

- <strong><em>Day 4</em></strong>:
    | Section        | topic                                 | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
    | -------------- | ------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
    | *Java Section* | `Inheritance · constructor ·  `       | [LaunchDemo.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDemo.java) · [LaunchDog.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDog.java) · [TicTacToe One Player](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/TicTacToe/src/Games/LaunchGamesOnePlayers.java)                                                                                                                                                                                                             |
    | *Web Section*  | `Selectors · link states · selectors` | [index7.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index7.html) · [index6.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index6.html) · [link.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/link.html) · [index7Style.css](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index7Style.html) · [externalStyle.css](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/externalStyle.html) |

1. The purpose of inheritance: 
   The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

2. extends: The extends keyword indicates that you are making a new class that derives from an existing class. The 
   meaning of "extends" is to increase the functionality.

3. this() - local chaining; super() - constructor chaining

4. Cyclic inheritance is not permit; Multiple inheritance is not permit; Multi-level inheritance is allowed

5. Types of Selectors: 
    - Tag selectors
	- Id selectors
    - Class selectors
	- Group selectors
	- Descendant Selector: Indicated with blank space
        ```
        Selector1 Seclector2
        {
            declaration list;
        }
        ```
	- Combination selectors：Witout any space
        ```
        div#innerDiv p
        {
            declaration list
        }
        ```
    - Direct child selector: (>)
        ```
        Selector1>Seclector2
        {
            declaration list;
        }
        ```
    - Adjancent Sibling Selectir/Next Sibling Selector: (+):
        ```
        Selector1+Seclector2
        {
            declaration list;
        }
        ```
    - General Sibling Selector: (~)
        ```
        Selector1~Seclector2
        {
            declaration list;
        }
        ```
    - Attribute selectors: [index7Style.css](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index7Style.html)
	- Contextual selectors 
	- Pseudo class selectors
	- Pseudo element selectors


6. states of a link: (must keep the order)
	1. Link: normal state or unvisited state 
	2. Visited: when user opens a link
	3. Hover: move the cursor over the link
	4. Active: currently opened link
    ```
	• a:link - a normal, unvisited link
	• a:visited - a link the user has visited
	• a:hover - a link when the user mouses over it
    • a:active - a link the moment it is clicked
    ```
7. - Siblings: children who have the same parent
   - Adjacent Siblings: same parent and adjacent to each other
<hr>

- <strong><em>Day 5</em></strong>:
    | Section        | topic                                       | task                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
    | -------------- | ------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Inheritance · constructor · polymorphism ` | [LaunchDemo2.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDemo2.java) · [LaunchPlane.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchPlane.java) · [LaunchAnimal.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchAnimal.java) ·       · [TicTacToe Two Player](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/TicTacToe/src/Games/LaunchGamesTwoPlayers.java)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
    | *Web Section*  | `Selectors · link states`                   | [index8.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index8.html) · [linkStyle.css](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/linkStyle.html) · [detailsForm.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/detailsForm.html) · [boxMod.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/css/boxMod.html) · [board.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/ChessBoard/board.html) · [chessboard.html](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/ChessBoard/chessboard.html) · [pseudoclass.css](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/css/pseudoclass.css) · [form.css](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/css/form.css) · [boxMod.css](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/css/boxMod.css) · [.css](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/ChessBoard/css/chessboard.css) · [board.css](https://github.com/woon17/Full-Stack-Training-Program/blob/main/WebSection/ChessBoard/css/board.css) |

1. polymorphism
   - true polymophrism (run time): Parent type reference point to child object (override)
   - Virtual polymophrism (compile time): overload method in same class (overload)
  
2. Down casting for inheritance (instanceof)
   ```
    Plane p = new Plane();
    p = new PassengerPlane();
    if (p instanceof PassengerPlane){
        ((PassengerPlane) p).carryPassenger();
    }
   ```
3. Types of Selectors: 
    - Tag selectors
	- Id selectors
    - Class selectors
	- Group selectors
	- Descendant Selector
	- Combination selectors
    - Direct child selector
    - Adjancent Sibling Selectir/Next Sibling Selector
    - General Sibling Selector
    - Attribute selectors
	- Contextual selectors 
	- Pseudo class selectors:
    ```
 	Selector1:Pseudocclassselectors
    {
    }
	Tagname:target
    {
    }
    ```
	- Pseudo element selectors
  
4. Inheritance in css:
	- Tag inheritance from parent tags 
	- Child tag can have a specific style

5. Font style: (default or internet)
	- Font-family
	- Font-size
	- Font-weight
	- line-height
	- text-align: left, right, center, justy
    - Text-decoration: line, line-through, overline, underline

6. Box model Diagram: (for all content) From outer to inner:
    - Margin
    - Border
    - Padding 


<hr>

### Week 1

Practice for Java:
- [Practice problem 1](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/Problem1.java)
- [Practice problem 2](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/Problem2.java)
- Other practice: [26 letters](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/letters.java)
  
Practice for HTML:
- [Sports activities website by HTML only](https://github.com/woon17/Full-Stack-Training-Program/tree/HtmlOnly/WebSection/sportsActivities)
<hr>

### Some important notes:
<p>Compiler: can compile the class even if no main method. (check sytax)</p>
<p>JVM: excute the class file only if the main method is defined in the specific class, otherwise return error.</p>
<p>Java are both compile (compiler) and interpret (JVM) language.</p>
<p>Identifiers:</p>

-  cannot start with number, 
-  only $ and _ are acceptable, cannot use keywords

token:
<ol>
    <li>Keywords</li>
    <li>Identifiers</li>
    <li>Literals</li>
    <li>Operators</li>
    <li>Separators</li>
    <li>Comments</li>
</ol>

tags:
<ol>
    <li>List tags</li>
    <li>Attributes tags</li>
    <li>Formating tags</li>
    <li>Quotation and citation tags</li>
    <li>Paired tag</li>
    <li>Unpaired tag</li>
</ol>

<p>Using different tags due to search engine optimization</p>
<hr>

- <strong><em>Day 1</em></strong>: 

    | Section        | topic                                                                   |
    | -------------- | ----------------------------------------------------------------------- |
    | *Java Section* | `Orientation · Introduction To Java · Java History · Why Java · JVM · ` |
    | *Web Section*  | `Introduction To Fullstack Technologies`                                |


- <strong><em>Day 2</em></strong>
    | Section        | topic                                         |
    | -------------- | --------------------------------------------- |
    | *Java Section* | `Class, Keyword, return type, Objects, token` |
    | *Web Section*  | `Introduction To Fullstack Technologies`      |

- <strong><em>Day 3</em></strong>: 
    | Section        | topic                                   |
    | -------------- | --------------------------------------- |
    | *Java Section* | `Data Types · Variables · Type Casting` |
    | *Web Section*  | `HTML`                                  |

- <strong><em>Day 4</em></strong>
    | Section        | topic                                   |
    | -------------- | --------------------------------------- |
    | *Java Section* | `Flow Statement: for, while, do..while` |
    | *Web Section*  | `HTML`                                  |

- <strong><em>Day 5</em></strong>:
    | Section        | topic                                |
    | -------------- | ------------------------------------ |
    | *Java Section* | `Scanner Class · Arrays`             |
    | *Web Section*  | `HTML · forms · responsive web page` |


***


<hr>

    1. update resume related description
    2. update portfolio related description
