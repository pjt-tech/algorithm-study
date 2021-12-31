package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2920 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();
        int count = Integer.parseInt(arr[0]);
        if(count == 1) {
            boolean asc = true;
            for (String s : arr) {
                if (count != Integer.parseInt(s)) {
                    asc = false;
                    System.out.println("mixed");
                    break;
                }
                count++;
            }
            if(asc) System.out.println("ascending");
        } else if(count == 8) {
            boolean des = true;
            for(String s : arr) {
                if(count != Integer.parseInt(s)) {
                    des = false;
                    System.out.println("mixed");
                    break;
                }
                count--;
            }
            if(des) System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
