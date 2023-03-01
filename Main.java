public class Main{
public static void main(String[] args) {
// create first student using constructor with no parameters
Student student1 = new Student();
// create second student using constructor with last name and first name
Student student2 = new Student("Mouse", "Mickey");
    // set attributes for student1
    student1.setFirstName("Donald");
    student1.setLastName("Duck");
    student1.setStudentID(67);
    student1.setBachelorCredits(55);
    student1.setMasterCredits(14);
    student1.setTitleOfBachelorThesis("Bachelor thesis title");
    student1.setStartYear(2020);
    student1.setGraduationYear(2021);

    // set attributes for student2
    student2.setBachelorCredits(5);
    student2.setStudentID(4);
    student2.setTitleOfBachelorThesis(null);

    // print details of both students
    System.out.println(student1.toString());
    System.out.println(student2.toString());
}
}