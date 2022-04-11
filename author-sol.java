import java.io.*;
import java.util.*;

public class Main {
	
	private static FastReader in;
	
	public static void main(String[] args) {
		in = new FastReader();
		int tc = 1;
		tc = in.nextInt();
		for(int t = 0; t < tc; t++) {
			new Solver();
		}
	}
	
	static class Solver {
		Solver() {
			
			//we consider all elements of the array as disjoint subarrays
			//there are two possible cases:
			
			//1. if the subarray element is 0, then the MEX is 1
			//2. if the subarray element is a non-zero element, then the MEX is 0
			
			//let the count of zeroes in the array of length N be X
			//thus, the total number of disjoint subarrays with MEX equal to 1 is X
			//similarly, the total of disjoint subarrays with MEX equal to 0 is (N - X)
			
			//our answer is max(X, N - X)
			
			int n = in.nextInt();
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int zeroes = 0;
			for(int i = 0; i < n; i++) {
				if(a[i] == 0) {
					zeroes++;
				}
			}
			System.out.println(Math.max(zeroes, n - zeroes));
		}
	}
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
