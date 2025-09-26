public class Encapsulation{
    public static void main(String args[]){
        Student s=new Student();
        
        s.setAge(19);
        System.out.println("Age="+s.getAge());
    }
}
class Student{
    private int age;
    
    //getter
    public int getAge(){
        return age;
    }
    
    //setter
    public void setAge(int age){
        this.age=age;
    }
}

