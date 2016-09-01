package hackerrank.prob;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        int N,K;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String line1 = br.readLine();
            String[] strs = line1.trim().split("\\s+");
            N = Integer.parseInt(strs[0]);
            K = Integer.parseInt(strs[1]);
            String line2 = br.readLine();
            int favor = 0;
            for (int j =0; j < N; j++) {
            	//System.out.print(j+" ");
                if(line2.charAt(j) == '1'){
                	//System.out.println(line2.charAt(j));
                	for (int k = j; (k-j) <= K && k < N; k++){
                		if (line2.charAt(k)== '1') {
							if (j==k) {
								favor+=1;
							}else{
								favor+=2;
							}
						}
                	}
                }
            }
            System.out.println(toIrreducableFrac(favor,N*N));
        }
    }
    public static int gcm(int a, int b) {
	    return b == 0 ? a : gcm(b, a % b); // Not bad for one line of code :)
	}
	private static String toIrreducableFrac(int n, int d) {
		    int gcm = gcm(n, d);
		    return (n / gcm) + "/" + (d / gcm);
	}
}