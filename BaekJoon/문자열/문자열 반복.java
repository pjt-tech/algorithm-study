import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean loop = true;
        int n = Integer.parseInt(br.readLine());
        List<String> inputList = new ArrayList<String>();
        String result = "";
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] inputArr = input.split(" ");
            Collections.addAll(inputList, inputArr);
        }
        while(loop) {
            if(!inputList.isEmpty()) {
                int count = Integer.parseInt(inputList.get(0));
                String[] strArr = inputList.get(1).split("");
                for(String str : strArr) {
                    for(int i = 0; i < count; i++) {
                        result+=str;
                    }
                }
                inputList.remove(0);
                inputList.remove(0);
                bw.write(result + "\n");
                result = "";
            } else {
                loop = false;
            }
        }
        bw.flush();
        bw.close();
    }
}