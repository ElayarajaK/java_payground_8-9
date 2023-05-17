class A{
    static{
        System.out.println("A SIB");
    }

    {
        System.out.println("instance..");
    }
}
public class Manager2 {

    public static void main(String[] args) {
        new A();
        new A();
        new A();
        System.out.println("from main");
    }
    
}
