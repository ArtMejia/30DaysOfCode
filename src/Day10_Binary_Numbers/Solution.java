package Day10_Binary_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String nBinary = Integer.toBinaryString(n);
        int aux = 0;
        int result = 0;
        for(int i = 0; i < nBinary.length(); i++){
            if(nBinary.charAt(i) == '1'){
                aux++;
                if(aux > result) result = aux;
            }else{
                aux = 0;
            }
        }
        System.out.println(result);
    }
}
