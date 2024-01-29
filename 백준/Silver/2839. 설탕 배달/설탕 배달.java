import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int N = Integer.parseInt(br.readLine());
			
			for(int b=0; b<5; b++) {
				int a = 0;
				int n = N-b*3;
				int result = 0;
				if(n%5 == 0) {
					a = n/5;
					if(a == -1) {
						result = a;
					} else {
						result = a+b;
					}
					bw.write(result+"");
				}
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}