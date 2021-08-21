import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textCount = sc.nextInt();
        int[] arr = new int[textCount];
        
        for(int i = 0; i < textCount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a+b;
        }
        
        for(int c : arr) {
            System.out.println(c);
        }
    }
}