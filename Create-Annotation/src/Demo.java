import java.lang.annotation.Annotation;

@MyAnnotation(name = "Ranga",age = 26,value = {"ihioo","jhhkl"})
public class Demo {
    public static void main(String[] args) {
        Annotation[] annotations = Demo.class.getAnnotations();
        for (Annotation annotation:annotations
             ) {
            System.out.println(annotation);
        }
        MyAnnotation annotation1 = (MyAnnotation) annotations[0];
        System.out.println(annotation1.name());
        System.out.println(annotation1.value());
        System.out.println(annotation1.value()[0]);


    }

}
