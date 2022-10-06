package Day8_Dictionaries_and_Maps;

import java.io.*;
import java.util.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> contact = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            contact.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (contact.get(s) == null) {
                System.out.println("Not found");
            }
            else {
                System.out.println(s + "=" + contact.get(s));
            }
        }
        in.close();
    }
}
