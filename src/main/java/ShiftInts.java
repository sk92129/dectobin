import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */

public class ShiftInts {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> data = new ArrayList<Integer>();
//        int a[] = new int[n];
        int position=0;
        for(int i=0; i < n; i++){
            if (k > 0){
                k--;
                data.add((data.size()), in.nextInt());
            } else {
                data.add(position, in.nextInt());
                position++;
            }
        }
        for (int j=0; j< data.size(); j++){
            System.out.print(data.get(j) + " ");
        }
    }
}
