import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Version {

    public static int maxVersion(String v1,String v2){

        String[] splitV1 = v1.split("\\.");
        String[] splitV2 = v2.split("\\.");
        System.out.println(splitV1.length);

        //concat strings
        Optional<String> reduceV1 = Arrays.stream(splitV1).reduce((a, b) -> a + b);
        Optional<String> reduceV2 = Arrays.stream(splitV2).reduce((c, d) -> c + d);

        //optional to string and string to int
        int ver1 = Integer.parseInt(String.valueOf(reduceV1.get()));

        int ver2 = Integer.parseInt(String.valueOf(reduceV2.get()));
        if(ver1>ver2){
            return ver1;
        }
        else {
            return ver2;
        }

    }

    public static void main(String[] args) {
        System.out.println(maxVersion("2.3.4","4.3.2"));
    }
}
