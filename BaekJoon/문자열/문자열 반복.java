import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean loop = true;
        int n = Integer.parseInt(br.readLine()); //입력받을 문자열의 갯수 N
        List<String> inputList = new ArrayList<String>(); //문자하나당 반복할 갯수와 + 문자열을 입력받아 저장할 List 
        String result = ""; 
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] inputArr = input.split(" ");
            Collections.addAll(inputList, inputArr); // 입력받은 문자열을 공백으로 구분하여 자른 배열을 List에 복사하여 저장
        }
        while(loop) {
            if(!inputList.isEmpty()) {
                int count = Integer.parseInt(inputList.get(0)); //문자하나당 반복할 갯수
                String[] strArr = inputList.get(1).split(""); 
                for(String str : strArr) {
                    for(int i = 0; i < count; i++) {
                        result+=str; //입력받은 문자열을 잘라서 반복하고 새로운 문자열 생성
                    }
                }
                inputList.remove(0);
                inputList.remove(0); //2개가 한세트 이므로 처리한 한쌍은 List에서 삭제해준다. 앞에서부터 삭제하면 앞으로 당겨지는 List의특징을 활용
                bw.write(result + "\n");
                result = ""; //출력 후 다시 초기화
            } else {
                loop = false; //list가 비어있으면 반복을 종료한다.
            }
        }
        bw.flush();
        bw.close();
    }
}