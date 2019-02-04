import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        List<Subject> subjects=new ArrayList<>();
        List<Sport> sport=new ArrayList<>();


        subjects.add(new Subject("sub001","Maths"));
        subjects.add(new Subject("sub002","Science"));

        sport.add(new Sport("sport011","chess"));
        sport.add(new Sport("sport012","cricket"));
        sport.add(new Sport("sport013","foot ball"));



        students.add(new Student("s001","Ranga",subjects));
        students.add(new Student("s002","Sanka",subjects));
        students.get(0).setSport(sport.get(0));
       students.get(1).setSport(sport.get(1));



        HashMap<String,String> map=new HashMap<>();
        map.put("111","bjkj");
        map.put("222","llll");
        map.put("32","gguusa");

        System.out.println(students);
        System.out.println(map.get("32"));
        System.out.println(map);

        students.forEach(i -> System.out.println(i));

    }
}
