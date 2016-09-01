package hackerrank.counterGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = br.readLine();
		int T = Integer.parseInt(line);
		for (int i = 0; i < T; i++) {
			line = br.readLine();
			Long N = Long.parseLong(line);
			boolean win = true;
			while(N>1){
				if(isPower2(N)){
					N = N>>1;
					win=!win;
				}else{
					N = subtractPower2(N);
					win=!win;
				}
			}
			
		}
	}

	private static Long subtractPower2(Long n) {
		
		return null;
	}

	private static boolean isPower2(long n) {
		int c=0;long m=n;
		while(m>1){
			m = m>>1;
			c++;
		}
		while(c>0){
			m = m<<1;
			c--;
		}
		if(m==n)
			return true;
		return false;
	}
}