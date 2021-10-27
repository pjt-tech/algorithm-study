import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dial= {null,null,"1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        String[] inputArr = br.readLine().trim().split("");
        int time = 0;
        for(String str : inputArr) {
            for(int i = 0; i < dial.length; i++) {
               if(dial[i] != null && dial[i].contains(str)) {
                   time += i;
               } 
            }   
        }
        System.out.println(time);
        br.close();
    }
}