import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
       
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
 
		System.out.println(sb);
        
        
        //h
        
        // String[] A = new String[3];
        // int test1 = scanner.nextInt();
        // String test2 = scanner.next();
        
        // String b1 = test2.substring(0,1);
        // int c1 = (Integer.parseInt(test2.substring(0,1)));
 
        
        // System.out.println();
        
        // scanner.close();


    }
}
