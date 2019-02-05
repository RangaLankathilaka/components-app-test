import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentId;
    private String studentName;
    private List<Subject> subjectList=new ArrayList<>();


    public Student() {
    }

    public Student(String studentId, String studentName, List<Subject> subjectList) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjectList = subjectList;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
