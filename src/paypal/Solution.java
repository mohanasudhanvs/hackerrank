package paypal;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'modifyQueue' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY input
     *  2. INTEGER k
     */

    public static String modifyQueue(String input, int k) {
        String[] s = input.split(" ");
        String ans = ""; 
        for (int i = k-1; i >= 0; i--) { 
            ans += s[i] + " "; 
        } 
        for (int i = k; i < s.length; i++) {
            ans += s[i] + " "; 
        }
        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());
        
        String input = bufferedReader.readLine().trim();

        String result = Result.modifyQueue(input, k);

        bufferedWriter.write(result);

        bufferedReader.close();
        bufferedWriter.close();
    }
}
