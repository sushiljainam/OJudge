package hackerrank.camelCase;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c = 1;
        for (int i = 0; i < s.length(); i++) {
			if(65<=s.charAt(i)&&s.charAt(i)<=90)
			{
				c++;
				
			}
		}
        System.out.println(c);
    }
}