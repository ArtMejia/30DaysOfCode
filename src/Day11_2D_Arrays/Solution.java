package Day11_2D_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        bufferedReader.close();

        ArrayList hgArr1= new ArrayList();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sums = arr.get(i).get(j) + arr.get(i).get(j+1) +arr.get
                        (i).get(j+2) + arr.get(i+1).get(j+1) + arr.get(i+2).get
                        (j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                hgArr1.add(sums);

            }
        }
        Collections.sort(hgArr1);
        System.out.println( hgArr1.get(hgArr1.size()-1));
    }
}
