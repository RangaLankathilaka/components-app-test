import java.util.List;

public class Student {

    private String studentId;
    private String studentName;
    private List<Subject> subjects;
    private Sport sport;

    public Student() {
    }

    public Student(String studentId, String studentName, List<Subject> subjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public Student(String studentId, String studentName, List<Subject> subjects, Sport sport) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjects = subjects;
        this.sport = sport;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                ", sport=" + sport +
                '}';
    }
}
