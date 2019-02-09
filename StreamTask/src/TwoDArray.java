import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TwoDArray {

    public static void main(String[] args) {

        int A[][]={{9,4,2},{4,3,1},{4,5,3}};


       //return a+b value
        Stream<Integer> integerStream = Arrays.stream(A).map(i -> {
            int reduce = Arrays.stream(i).reduce(0, (a, b) -> a + b);

            return reduce;
        });

        //sort and get last element
        Optional<Integer> max = integerStream.sorted().reduce((first, second) -> second);
        Integer integer = Integer.valueOf(max.get());
        System.out.println(integer);

    }
}
