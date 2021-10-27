import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String title = br.readLine();
        String result = "";
                   
        for(char i='a'; i<='z'; i++) {
            if(title.indexOf(Character.toString(i)) > -1) {
                result+=title.indexOf(Character.toString(i));
            } else {
                result+="-1";
            }
            result+=" ";
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
    }
}