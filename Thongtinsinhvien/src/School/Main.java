package School;
public class Main {
    public static void main(String[] args) {
        Teacher objTeacher = new Teacher();
        objTeacher.setTeacherInfo();
        Student objStudent = new Student();
        objStudent.setStudentDetails();
        objStudent.assignTeacher(objTeacher.getName(),objTeacher.getCode());
        objStudent.getStudentDetails();
    }
}
