import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //�Է¹��� �ܾ��� ����                  
        int count = 0;
        for(int i = 0; i < n; i++) {
           if(check(br)) { 
               count++;
           }   
        }
        System.out.println(count);
    }
    public static boolean check(BufferedReader br) throws IOException {       
        boolean[] isEquals = new boolean[26]; //���ĺ���ŭ boolean �迭����
        String str = br.readLine().trim();
        int prev = 0; //���� ����
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != prev) { //�������ڿ� ���� ���Ϸ��¹��ڰ� ���ٸ� continue, �ٸ��ٸ� ���ǹ����� ����.
                if(isEquals[str.charAt(i) - 'a'] == false) { //�迭�� �ε����� false��� ó���ΰŴ�.
                    isEquals[str.charAt(i) - 'a'] = true; 
                    prev = str.charAt(i); //�迭�� �ε����� true�� �ٲٰ� ���� ���ڸ� ��Ƽ� �����Ѵ�.
                } else {
                    return false; //�迭�� �ε����� true�� �ٲٴ� ������ �ѹ� �ǳʶٰ� �� ��������� �׹��ڿ��� �׷� �ܾ �ƴϰ� �ȴ�. �׷� ��� false�� return�Ѵ�.
                }
            }
        }
        return true;
    }
}