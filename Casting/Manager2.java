/*var args */
public class Manager2 {

    


    public static void main(String[] param) {


        System.out.println(param.length);
      //            1 2  3  4    length
        int []arr={10,20,30,40};
     //             0  1  2  3

     String[] arr1={"a","b","c"};

     method2(arr1);
     
     
     System.out.println(arr[0]);

     System.out.println(arr[3]);
        int index=0;
     for(;index < arr.length;index++)
     {
        System.out.println("Hello for ...."+arr[index]);
     }

      //  System.out.println(arr.length);
        

/*     method(100);
        method(100,200);
        method(100,200,300);
        method(100,200,300,400);
   */    
    }
//var-arg
    public static void method2(String[] args){

    }

    public static void method(int ...args1){
        for(int index=0;index < args1.length;index++){
            System.out.print(args1[index]);
        }
        System.out.println("");
    }
}
