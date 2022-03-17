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
- Other practice: [26 letters](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/letters.java)
  
Practice for Web Section:
- [Practice code for Web Section](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice)
- [Sports activities website by HTML only](https://github.com/woon17/Full-Stack-Training-Program/tree/HtmlOnly/WebSection/sportsActivities)
- [Sports activities website with CSS](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/sportsActivities)
<!-- TODO: need to start to add different version of porfolio and deploy by github.io -->
- [Portfolio with html only]()
- [live Portfolio with html only]()
- [Portfolio by using CSS]()
- [live Portfolio by using CSS]()
***

### Week 2

Practice for Web:
- [Sports activities website with CSS](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/sportsActivities)

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
    | Section        | topic                                                                    | task                                                                                                                                                                                                                                                                                                                                                                                   |
    | -------------- | ------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | *Java Section* | `Variables · anonymous object`                                           | [LaunchDog.java](https://github.com/woon17/Full-Stack-Training-Program/blob/main/JavaSection/testproject/src/testproject/LaunchDog.java)                                                                                                                                                                                                                                               |
    | *Web Section*  | `Selectors · link states · selectors` | [index2.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index2.html) · [index1.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/index1.html) · [inputTypes.html](https://github.com/woon17/Full-Stack-Training-Program/tree/main/WebSection/practice/exercises/inputTypes.html) |




1. Types of Selectors
    - Tag selectors
	- Id selectors
    - Class selectors
	- Group selectors
	- Combination selectors：
        ```
        
        ```
	- Contextual selectors 
	- Attribute selectors
	- Pseudo class selectors
	- Pseudo element selectors
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

    1. add image per day
    2. add code per day for weeek 1 and 2
