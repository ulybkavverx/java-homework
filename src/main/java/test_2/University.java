package test_2;

public class University {
    static String universityName;

    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }
    String getStudentName() {
        return this.studentName;
    }
    void printStudentInfo() {
        System.out.println("Имя студента: " + this.studentName + ", ID: " + this.studentID + ", университет: " + universityName);
    }
}
