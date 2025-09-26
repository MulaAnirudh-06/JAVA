class Abstraction{
    public static void main(String args[]){
        Pig a=new Pig();
        a.animalSound();
        a.sleep();
    }
}
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzz");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("wee wee");
    }
}
