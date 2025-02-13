package Poly;

interface Animal{
    void makeSound();
}

class Cat implements Animal{
    @Override
    public void makeSound()
    {
        System.out.println("meo meo");

    }
}

class Dog implements Animal{
    @Override
    public void makeSound()
    {
        System.out.println("gau gau");
    }
}

public class Main {
    public static void main(String[] arg){
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myCat.makeSound();
        myDog.makeSound();
    }

}
