import java.util.Scanner;

class Student
{
    public void printDetails(){
        System.out.println("return type vaid");
    }
    
    public int sumOfMarks(int sub1,int sub2,int sub3){
         int sum = sub1+sub2+sub3;
        return sum;
    }

    public float Avg(int sum,int subs){
        float avg = sum/subs;
       return avg;
   }

   public String printDet(String name,int sum,float avg){
    String detais = "Student name : "+name+", total marks : "+sum+", avg is : "+avg;
    return detais;
   }

}
public class Manager1 {
       static String name="Raja";
  

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter the student marks 1");
         int marks1=input.nextInt();
         System.out.println("Enter the student marks 2");
            int marks2=input.nextInt();
            System.out.println("Enter the student marks 3");
            int marks3=input.nextInt();;
        
        Student obj = new Student();       
        
       int sum =  obj.sumOfMarks(marks1, marks2, marks3);

    float avgmarks = obj.Avg(sum, 3);

    String printDatas= obj.printDet(name, sum, avgmarks);

    System.out.println(printDatas);

       
    }
}
