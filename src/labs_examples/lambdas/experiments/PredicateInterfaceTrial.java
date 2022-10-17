package labs_examples.lambdas.experiments;
import java.util.*;
import java.util.function.Predicate;

public class PredicateInterfaceTrial {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
        Predicate<String> p = (s)->s.startsWith("G");
        for (String st:names) {
            if (p.test(st))
             System.out.println(st);
        }
    }
}
