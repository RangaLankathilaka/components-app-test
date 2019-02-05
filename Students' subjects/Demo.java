import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        List<Subject> selectedSubject1=new ArrayList<>();
        List<Subject> selectedSubject2=new ArrayList<>();

        List<Subject> subjects=new ArrayList<>();
        subjects.add(new Subject("sub001","Maths"));
        subjects.add(new Subject("sub002","Science"));
        subjects.add(new Subject("sub003","Physics"));
        subjects.add(new Subject("sub004","Chemistry"));
        subjects.add(new Subject("sub005","Bio"));


        Map<String,Subject> subjectMap=subjects.stream().collect(Collectors.toMap(subject->subject.getSubjectId(), subject->subject));


        selectedSubject1.add(subjectMap.get("sub001"));
        selectedSubject1.add(subjectMap.get("sub004"));



        students.add(new Student("s001","Ranga",selectedSubject1));



        selectedSubject2.add(subjectMap.get("sub003"));

        students.add(new Student("s002","Sanka",selectedSubject2));

        System.out.println(students);


    }
}
