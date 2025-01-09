package coder25.problemSolving1.mphasis.dec16;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> empl = new ArrayList<>();
        empl.add("Ayu");
        empl.add("yu");
        empl.add("hAu");
        empl.add("hAyu");
        empl.add("Ayu");
        empl.add("Ayhu");
        empl.add("htyrAyu");
        empl.stream().filter(a -> a.startsWith("A")).forEach(System.out::println);
    }
}
