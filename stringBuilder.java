/*StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters. */

import java.util.*;

public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Macbook");

        System.out.println(sb);

        // charAt index 0
        System.out.println(sb.charAt(0));

        // setcharAt index 0
        sb.setCharAt(0, 'T');
        System.out.println(sb);

        // insert char or str
        sb.insert(0, "Apple");
        System.out.println(sb);

        // delete char or substring (ending index non-inclusive)
        sb.delete(5, 8);
        System.out.println(sb);

        // append
        sb.append('M');
        sb.append('1');
        System.out.println(sb);
        System.out.println(sb.length());

    }
}