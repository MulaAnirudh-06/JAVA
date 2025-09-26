class Overloading{
    public static void main(String args[]){
        Addition ad=new Addition();
        System.out.println(ad.add(5,8));
        System.out.println(ad.add(5,8.9));
        System.out.println(ad.add(3.2,4.8));
    }
}
public class Addition{
    public int add(int a,int b){
        return a+b;
    }
    public double add(int a, double b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
}
