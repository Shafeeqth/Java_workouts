package Arrays;

class Student {
    String name;
    int mark;
    int rollNo;

}

public class Demo {
    public static void main(String[] args) {
    
    Student students[] = new Student[3];

    Student stud1 = new Student();
    Student stud2 = new Student();
    Student stud3 = new Student();

    stud1.name = "Shafeeque";
    stud1.mark = 44;
    stud1.rollNo = 1;
    
    stud2.name = "Dilu";
    stud2.mark = 48;
    stud2.rollNo = 2;

    stud3.name = "Shihab";
    stud3.mark = 40;
    stud3.rollNo = 3;
    
    students[0] = stud1;
    students[1] = stud2;
    students[2] = stud3;

    for (Student student : students) {
        System.out.println(student.name + " : " + student.mark);
        
    }

    }
    
}
