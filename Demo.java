class Animal{
    String name;
    int age;
    public Animal(String name){
        this.name=name;
        System.out.println("Animal constructor with name");
    }
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Animal constructor with name and age");
    }
}
class Dog extends Animal{
    String breed;
    
    public Dog(String name, String breed) {
      super(name);
      this.breed = breed;
      System.out.println("Dog constructor with name and breed"); 
    }
    public Dog(String name, int age, String breed) {
      super(name, age);
      this.breed = breed;
      System.out.println("Dog constructor with name, age, and breed");
    }
    public Dog(String name, String breed, int age){
      this (name, breed);
        System.out.println("Dog constructor with name, breed, and age"); 
    }
        
        }
class Demo{
    public static void main(String[] args){
    Dog d=new Dog("Charlie","Rottie");
        }
    }