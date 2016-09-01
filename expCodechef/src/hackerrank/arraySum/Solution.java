package hackerrank.arraySum;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String args[] ) throws Exception {
        int N,K;String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        line = br.readLine();
        N = Integer.parseInt(line);
        line = br.readLine();
        String[] strs = line.trim().split("\\s+");
        int sum=0;
        for(int i=0; i<N; i++){
        	sum+=Integer.parseInt(strs[i]);
        }
        System.out.println(sum);
    }
}