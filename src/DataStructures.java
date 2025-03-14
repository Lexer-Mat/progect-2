import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DataStructures {

    public static void main(String[] args) {
        String name = "Alex";
        String[] names = new String[5];
        names[0] = "Alex";
        names[1] = "Maina";
        String result = Arrays.toString(names);
        System.out.println(result);

        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Alix");
        listOfNames.add("Miamy");

        HashMap<String, Integer> namesToAge = new HashMap<>();
        namesToAge.put("Alex", 36);
    }
}
