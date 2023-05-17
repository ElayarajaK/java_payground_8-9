class A{
    static{
        System.out.println("static ..");
    }
    A(){
        System.out.println("no-args cons");
    }

    {
        System.out.println("Instance .. ");
    }

}

public class Manager1 {

    public static void main(String[] args) {

    A obj=    new A();
    A obj1=    new A();
    A obj2=    new A();
    

    
    /*A obj=    new A();
    A obj1=   obj;
    A obj2=   obj;
    int i=10;
    int j =i;*/
    }
}
