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