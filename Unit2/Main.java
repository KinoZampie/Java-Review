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