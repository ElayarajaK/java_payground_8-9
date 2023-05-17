class Student{
    int id;
    Student(int id){
       this.id=id;
    }
}

public class Manager2 {

    public static void main(String[] args) {

        Student student = new Student(201100);
        Student student1 = new Student(656565);
        Student student2 = new Student(676767);
        Student student3 = new Student(1212121);
        Student student4 = new Student(44434);

        System.out.println(student.id);
        System.out.println(student1.id);
        System.out.println(student2.id);
        System.out.println(student3.id);
        System.out.println(student4.id);


    }
}
