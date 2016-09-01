package hackerrank.aloneInt;

import java.util.Scanner;

public class Solution {
     private static int lonelyInteger(int[] a) {
    	a = sort(a);
    	for (int i = 0; i < a.length-1; i+=2) {
			if(a[i]!=a[i+1]){
				return a[i];
			}
		}
        return a[a.length-1];
    }
    private static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					int t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}