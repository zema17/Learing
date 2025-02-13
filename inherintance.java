package inheritance;

class Animal{
    void makeSound(){
        System.out.println("...!!!");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("gau gau");
    }
}

public class Main {
 public static void main(String[] arg){
    Dog Dogtan = new Dog();

    Dogtan.makeSound();
    Dogtan.bark();
 }   
}
