import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String ascii = br.readLine();
        bw.write((int)ascii.charAt(0)+"");
        
        bw.flush();
        bw.close();        
    }
}