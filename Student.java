
public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private int startYear;
    private int graduationYear;
    private double bachelorCredits;
    private double masterCredits;
    private String titleOfBachelorThesis;
    private String titleOfMastersThesis;

    // constructor with no parameters
    public Student() {
        firstName = "";
        lastName = "";
        studentID = 0;
        startYear = 0;
        graduationYear = 0;
        bachelorCredits = 0;
        masterCredits = 0;
        titleOfBachelorThesis = "No title";
        titleOfMastersThesis = "No title";
    }

    // constructor with last name and first name
    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        studentID = 0;
        startYear = 0;
        graduationYear = 0;
        bachelorCredits = 0;
        masterCredits = 0;
        titleOfBachelorThesis = "No title";
        titleOfMastersThesis = "No title";
    }

    // getter and setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setBachelorCredits(double bachelorCredits) {
        this.bachelorCredits = bachelorCredits;
    }

    public double getBachelorCredits() {
        return bachelorCredits;
    }

    public void setMasterCredits(double masterCredits) {
        this.masterCredits = masterCredits;
    }

    public double getMasterCredits() {
        return masterCredits;
    }

    public void setTitleOfBachelorThesis(String titleOfBachelorThesis) {
        this.titleOfBachelorThesis = titleOfBachelorThesis;
    }

    public String getTitleOfBachelorThesis() {
        return titleOfBachelorThesis;
    }

    public void setTitleOfMastersThesis(String titleOfMastersThesis) {
        this.titleOfMastersThesis = titleOfMastersThesis;
    }

    public String getTitleOfMastersThesis() {
        return titleOfMastersThesis;
    }

    // calculate years of study
    public int yearsOfStudy() {
        return graduationYear - startYear;
    }

    // check if the student has graduated
    public boolean hasGraduated() {
        if (graduationYear == 0) {
            return false;
        } else {
            return true;
        }
    }

    // toString method
    public String toString() {
        String status = "";
        if (hasGraduated()) {
            status = "The student has graduated.";
        } else {
            status = "The student has not graduated, yet.";
        }

String result = "Student id: " + studentID + "\n"+ "FirstName: " + firstName + ", LastName: " + lastName + "\n" + "Status: " + status + "\n"+ "Start Year: " + startYear + " (studies have lasted for " + yearsOfStudy() + " years)\n"+ "BachelorCredits: " + bachelorCredits + "\n"+ "MasterCredits: "+ masterCredits + " TitleOfMasters Thesis: " +titleOfMastersThesis + "\n"+ "TitleOfBachelorThesis: " + titleOfBachelorThesis + "\n";
    return result;
}
}

