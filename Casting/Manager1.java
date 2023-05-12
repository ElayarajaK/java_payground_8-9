public class Manager1 {
    
    public static void main(String[]arg){
        //auto upcsting
        //byte --> short --> int -->long --> float --> double
       
        //byte <-- short <-- int <--long <-- float <-- double
        // expilicit downcasting 
                      
                 //char

            int marks1 =(int)46;

            System.out.println(marks1);

            int marks2 =(int)  marks1;

            System.out.println(marks2);

            int marks5 = 100;

            long marks6 =(long)marks5;


            System.out.println(marks5);
            System.out.println(marks6);
            float avg = marks5;

            System.out.println(avg);

            byte marks7 = (byte)marks5;

            double range = 4000.500;

            float ranges = (float) range;
            System.out.println(ranges);


           
            //https://github.com/ElayarajaK/java_payground_8-9
        method1(10);

        method1(100, "Apj");

        method1(2000,"Ramanujam", false);
        }


//
    public static void method1(int args1){
        System.out.println("From method : "+args1);
    }
    public static void method1(int args1,String name){
        System.out.println("From method : "+args1+", "+name);
    }
    public static void method1(int args1,String name,boolean isAmin){
        System.out.println("From method : "+args1+", "+name + "," +isAmin);
    }
}
