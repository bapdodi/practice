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
       
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for(int i=1; i<=a; i++){
            b = b+i; 
        }
        System.out.println(b);
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
