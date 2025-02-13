package Recapsolution;

class Person 
{
    private String name;
    
    public void setName (String newName) 
    {
        this.name = newName;
    }

public String getName()
{
    return name;
}
}
public class oop01 
{
    public static void main(String[] args){
        Person person = new Person();
        person.setName ("Mason");
        System.out.println(person.getName());
    }
}
