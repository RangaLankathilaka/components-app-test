import org.omg.CORBA.portable.InputStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) throws IOException {

        //1.print 1 to 9
       IntStream.range(1,10).forEach(i-> System.out.println(i));

       //2.print 6 to 9
        IntStream.range(1,10).skip(5).forEach(i-> System.out.println(i));

        //3.sum
        System.out.println(IntStream.range(1,10).sum());

        //4.stream.of,sorted and find first.....sort name
        ArrayList<String> names=new ArrayList<>();
        names.add("Ranga");
        names.add("Sanka");
        names.add("Rangana");
        names.add("Asanka");

        names.stream().sorted().findFirst().ifPresent(i-> System.out.println(i));

        //5.filter
        names.stream().filter(i->i.startsWith("R")).forEach(name-> System.out.println(name));

        //6.filter and split
        String docType="lc,product,issuance,finance";
        String[] split = docType.split(",");
        Arrays.stream(split).forEach(doc-> System.out.println(doc));
        System.out.println(split.length);




        //9.Read file
        java.util.stream.Stream<String> test = Files.lines(Paths.get("test.txt"));
        test.sorted().filter(x->x.length()>13).forEach(read-> System.out.println(read));
        test.close();




        //11.collect to array list
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

        //12.filter empty string
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);



        //13.collector to map
        List<Subject> subjects=new ArrayList<>();
        subjects.add(new Subject("45","Maths,hjkhkjhk"));
        subjects.add(new Subject("55","Science,gkhkj"));
        subjects.add(new Subject("65","Hewjkjl,hkhkjjl"));


/**
 * Array List item add to map manually
 */
//        Map<String,String> subDetails=new HashMap<>();
//        for(Subject subject:subjects){
//            subDetails.put(subject.getSubjectId(),subject.getSubjectName());
//        }
//        System.out.println(subDetails);


        Map<String,String> subDetails=subjects.stream().collect(Collectors.toMap(i->i.getSubjectId(),i->i.getSubjectName()));
        System.out.println(subDetails);


        //14.get value from map

        subDetails.entrySet().stream().forEach(i-> System.out.println(i.getKey()));


        //14.if condition
        subDetails.entrySet().stream().forEach(i->{
            if(Integer.parseInt(i.getKey())>50){
                String[] split2 = i.getValue().split(",");
                Arrays.stream(split2).forEach(name-> System.out.println(name));
                //System.out.println(split);
            }
        });


        //15.nested if condition
        subDetails.entrySet().stream().forEach(i->{
            if(Integer.parseInt(i.getKey())>50){
                String[] split1 = i.getValue().split(",");
                Arrays.stream(split1).forEach(name-> {
                    if(name.equals("Science")){
                        System.out.println("Hi");
                    }
                });
                //System.out.println(split);
            }
        });


        //16 .joining

        String collect = subDetails.entrySet().stream().map(i -> i.getValue()).collect(Collectors.joining(","));
        System.out.println(collect);

        //17 .joining and filter cat as the if condition

        String collect1 = subDetails.entrySet().stream().filter(i->!i.getValue().isEmpty()).map(i -> i.getValue()).collect(Collectors.joining(","));
        System.out.println(collect);
		
		//18.compare neighbour element
		
        Optional<Car> car = persons.stream().reduce((c1, c2)
                -> c1.getPrice() > c2.getPrice() ? c1 : c2);

        car.ifPresent(i-> System.out.println(i));

      //19.add neighbour element
        double total=Stream.of(7.3,4.5,3.2,5,6).reduce(0.0,(Double a,Double b)->a+b);
        System.out.println(total);

    }
}
