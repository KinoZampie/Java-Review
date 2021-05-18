# Learning Java 2 Days before the AP Test

### [Java Quick Reference](https://apstudents.collegeboard.org/ap/pdf/ap-computer-science-a-java-quick-reference_0.pdf)

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
// Using Objects
class Main{
    public static void main(String[] args){
        // Working with Objects
        Cat cat1 = new Cat("James",3);
        System.out.println(cat1.feed()); //Calling a non void method
        System.out.println(cat1.getAge());
        cat1.birthday(); //Calling a void method
        System.out.println(cat1.getAge()); //Age is incremented

        // Working with String Objects
        // Concatenation, literals, more
        String statement1 = "Hi";
        String statement2 = "There";
        System.out.println(statement1+" "+statement2); //Concatination
    }
}
```
```java
class Cat{
    String name;
    private int age;
    public Cat(String name,int age){
        this.name = name; 
        this.age = age;
    }

    public String feed(){
        return "You fed "+this.name;
    }

    public void birthday(){
        this.age++;
    }
    public int getAge(){
        return this.age;
    }
}
```
Output:
```
You fed James
3
4
Hi There
```

## Unit 3 - Booleans and if statements

Lets not waste any time

```java
int a = 10;
int b = 20;
// All boolean expressions
a <= b;
a == b;
!(a == b);

if (a != b){
    return "This ain't it chief"
}
```

## Unit 4 - Iteration

I know while and for loops..

Devloping Algorithms using Strings

The three string methods available on the test are:
```java
String.substring();
String.equals();
String.length();
```

In terms of "algorithms" may be asked to reimplement the String.contains() methods or something similar using the above methods and for loops.

Nested iteration, i gots that

Informal Code Analysis,, what's what??

^ Ohh, it's just knowing how many times a line of code is going to be run. ie.
```java
for (int i=0;i<10;i++){
    System.out.println(i); //This line will run 10 times
}
```

## Unit 5 - Writing Classes

Mostly completed with Unit 2

The `toString()` method
```java
public String toString(){
    return "Cat "+this.name+" is "+this.age+" years old";
}
```

The `equals()` method
```java
public boolean equals(Object o){
    if (this == o){
        return true; //Check if the object is the same
    }
    else if (!(o instanceOf User)){
        return false //Check if the object is of the same class
    }
    else{
        Cat otherCat = (Cat) o;
        return this.name.equals(otherCat.name) // In this case, objects are equal if the cats have the same name
    }
}
```

The `compareTo()` method
```java
public int compareTo(Cat otherCat){
    if (this.getAge() < otherCat.getAge()){
        return -1
    }
    else if (this.getAge() > otherCat.getAge()){
        return -1
    }
    else{
        return 0;
    }
}
```

## Unit 6 - Arrays

Cowabunga here's how you write arrays

```java
//No need to define length this way
Stirng[] colors = {"red","orange","yellow","green","blue","indigo","violet"};

// Otherwise define length if going to populate later
String[] colors = new String[5]

colors[2] // Select array item

// The for each loop
for (String color : colors){
    System.out.println(color);
}

colors.length //Length of an array
```

Sanity check, arrays other than strings

```java
int[] favNums = {0,2,12,42,420};

int[] newNums = new int[20];

double[] favFloats = {2.71,3.14,6.28};
```

## Unit 7 ArrayList

but,, wat if we don't no how big our array is gon be?

The bois at oracle already thought of that, allow me to introduce to you the ArrayList

```java
import Java.util.ArrayList;

ArrayList<Type> name = new ArrayList<Type>();

// The add set and remove methods

ArrayList<Student> roster = new ArrayList<Student>();
roster.add(new Student("Sora"));
roster.add(new Student("Sora"));
roster.set(0, new Student("Sora"));
roster.remove(1);
```

## Unit 8 2D arrays
10 minutes till test!! forogt about this!!

```java
// Defining a 2d array
int[][] board = {{1,2,3},{4,5,6},{7,8,9}}

// Traversing a 2d array
for (int row=0; row<3;row++){
    for (int col=0; col<3;col++){
        System.out.print(board[row][col]);
    }
    System.out.println("");
}
```

i pray


## Unit 9 - Inheritance

```java
public class Tiger extends Cat{
    private boolean big;
    public Tiger(name,age){
        super(name,age)
        this.big = true;
    }
// Overriding
    public getName(){
        return name+" aka big boi";
    }
}
```


^ I think this is right but outta time..

## Unit 10 - Recursion

Just running the same function in a function. i shall survive this.