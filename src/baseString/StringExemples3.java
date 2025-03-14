package baseString;

import java.util.Arrays;
import java.util.List;

public class StringExemples3 {
    public static void main(String[] args) {
        List<String> people = Arrays.asList(
                "Philip J. Fry",
                "Turanga Leela",
                "Bender Bending Rodriguez",
                "Hubert Farnsworth",
                "Hermes Conrad",
                "John D. Zoidberg",
                "Amy Wong"
        );
        String peopleString = String.join("; ", people);
        System.out.println(peopleString);

        String[] peopleArray = peopleString.split("; ");
        int i = 1;
        for (String human: peopleArray) {
            System.out.println("Строка " + i + ": " + human);
            System.out.println(human.indexOf('i'));
            i++;
        }

    }
}
