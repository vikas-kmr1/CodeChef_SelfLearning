/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
public static void main(String[] args) {
	    Map<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

		String s;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			s = sc.next();
			char ch[] = s.toCharArray();
			Arrays.sort(ch);
			int code = (new String(ch)).hashCode();
			map.put(code, map.getOrDefault(code, 0) + 1);
			if (map.get(code) > max) {
				max = map.get(code);
			}
		}
		System.out.println(max);
	}
}
