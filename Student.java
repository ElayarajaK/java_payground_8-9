class College{
  final static int c_id=641723467;
  final static String c_name="IIT";


  String s_name;
  int s_marks;

}
public class Student{
    public static void main(String[] args) {
    
        College college1 = new College();

         College college2 = new College();

         College college3=new College();
        
        System.out.println("Student 1 Details");
        college1.s_name="Abdul";
        college1.s_marks=400;
        
        System.out.println("College id : "+ college1.c_id+"College name : "+college1.c_name+" Student name : "+ college1.s_name+"Student Marks : "+college1.s_marks);
        college2.s_name="Ram";
        college2.s_marks=300;
        System.out.println("College id : "+ college2.c_id+"College name : "+college2.c_name+" Student name : "+ college2.s_name+"Student Marks : "+college2.s_marks);
        college3.s_name="Jhon";
        college3.s_marks=200;
        System.out.println("College id : "+ college3.c_id+"College name : "+college3.c_name+" Student name : "+ college3.s_name+"Student Marks : "+college3.s_marks);

    

        





    }

    
}