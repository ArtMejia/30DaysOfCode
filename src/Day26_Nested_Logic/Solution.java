package Day26_Nested_Logic;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int retDate[] = new int[3];
        for (int i = 0; i < 3; i++){
            retDate[i] = sc.nextInt();
        }

        int dueDate[] = new int[3];
        for(int i = 0; i < 3; i++){
            dueDate[i] = sc.nextInt();
        }

        if (retDate[2] > dueDate[2]){
            System.out.println("10000");
        }
        else if (retDate[2] == dueDate[2] && retDate[1] > dueDate[1]){
            System.out.println(500*(retDate[1] - dueDate[1]));
        }
        else if (retDate[2] == dueDate[2] && retDate[1] == dueDate[1] && retDate[0] > dueDate[0]){
            System.out.println(15*(retDate[0] - dueDate[0]));
        }
        else {
            System.out.println("0");
        }

        sc.close();
    }
}
