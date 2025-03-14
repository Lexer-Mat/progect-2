package baseString;

import java.util.Scanner;

public class StringExemples2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + y);
        String a = String.valueOf(x);
        String b = String.valueOf(y);
        System.out.println(a + b);
        Integer i = Integer.parseInt(a);
        Double z = Double.parseDouble(b);
        System.out.println(i + z);
        String e = String.valueOf(true);
        String human = String.valueOf(new StringExamples.Human("Alex"));

        System.out.println(e);
        System.out.println(human);
    }

}
