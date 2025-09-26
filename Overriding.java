class Overriding{
    public static void main(String args[]){
        Animal d=new Dog();
        Animal c=new Cat();
        Animal a=new Animal();
        
        d.sound();
        c.sound();
        a.sound();
    }
}
public class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal{
    public void sound(){
        System.out.println("Bhow Bhow");
    }
}
