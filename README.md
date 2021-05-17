# Learning Java 2 Days before the AP Test

## Unit 1 - Primitive Types

Java has 8 primitive datatypes
```java
// Ints
byte //1 byte
short // 2 bytes
int //4 bytes
long //8 bytes

// Floating point nums
float //4 bytes
double //8 bytes

//Other
char //2 bytes, can rep all characters
boolean //true or false

```
Expressions are just * / + - %

Variables are just containers for primitives and objects

Assignment is applying a value to a variable
```java
int num; //declaring an int varable called num
num = 3; //Assigning
double otherNum = 4.0; //declaring and assigning
double sum = otherNum + num;
System.out.println("The sum is: "+ sum);
```

## Unit 2 - Introduction to OOP; Using Objects
Classes are blueprints

Objects are instances of classes.

Creating and storing objects is known as instantiation

```java
// Using Objects
class Main{
    public static void main(String[] args){
        Cat cat1 = new Cat("James");
        System.out.println(cat1.feed());
    }
}
```
```java
class Cat{
    String name;
    public Cat(String name){
        this.name = name;
    }

    public String feed(){
        return "You fed "+this.name;
    }
}
```
Output:
`You Fed James`

