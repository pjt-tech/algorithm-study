class Solution {
    private static final int COUNT = 6;

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int sameCnt = 0;
        int hiddenCnt = 0;
        for(int i = 0; i < COUNT; i++) {
            if(lottos[i] == 0) {
                    hiddenCnt++;
                }
            for(int j = 0; j < COUNT; j++) {                 
                if(lottos[i] == win_nums[j]) {
                    sameCnt++;
                }                
            }
        }  
        return result(answer,sameCnt,hiddenCnt);
    }

    private int[] result(int[] answer, int sameCnt, int hiddenCnt) {
        switch(sameCnt) {
            case 0 :  
                answer[0] = 6;
                answer[1] = 6;
                if(hiddenCnt != 0) {
                    answer[0] = calculateFirstNum(hiddenCnt, 7);
                }
                break;
            case 1 : 
                answer[0] = calculateFirstNum(hiddenCnt, 6);
                answer[1] = 6;
                break;
            case 2 : 
                answer[0] = calculateFirstNum(hiddenCnt, 5);
                answer[1] = 5;
                break;
            case 3 : 
                answer[0] = calculateFirstNum(hiddenCnt, 4);
                answer[1] = 4;
                break;
            case 4 : 
                answer[0] = calculateFirstNum(hiddenCnt, 3);
                answer[1] = 3;
                break;
            case 5 : 
                answer[0] = calculateFirstNum(hiddenCnt, 2);
                answer[1] = 2;
                break;
            case 6 : 
                answer[0] = 1;
                answer[1] = 1;
                break;
            default : break;
        }
        return answer;
    }

    private int calculateFirstNum(int hiddenCnt, int firstNum) {
        if(hiddenCnt != 0) {
            for(int i = 0; i < hiddenCnt; i++) {
                firstNum--;
            }                    
        }
        return firstNum;
    }
}