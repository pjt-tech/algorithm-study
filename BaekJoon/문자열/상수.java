import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] inputArr = str.split(" ");
        //입력받은 문자열을 공백으로 구분하여 자르고 builder의 reverse()함수를 이용하여 뒤집어서 비교한뒤 더 큰값을 찾는 문제
        StringBuilder sb1 = new StringBuilder(inputArr[0]);
        StringBuilder sb2 = new StringBuilder(inputArr[1]);
        int a = Integer.parseInt(sb1.reverse().toString());
        int b = Integer.parseInt(sb2.reverse().toString());       
        if(a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
        br.close();
    }
}