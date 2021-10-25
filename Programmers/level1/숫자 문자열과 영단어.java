import java.util.Map;
import java.util.HashMap;
import java.util.Set;
class Solution {
    public int solution(String s) {
        Map<Integer,Integer> valueMap = new HashMap<Integer,Integer>();
        String[] numArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String replace = "";
        boolean isFirst = true;
        for(int i = 0; i < numArr.length; i++) {
            int pos = s.indexOf(numArr[i]);
            if(pos != -1) {
                valueMap.put(pos, i);
            }
        }
        if(valueMap.size() == 0) return Integer.parseInt(s);        
        Set<Integer> integers = valueMap.keySet();
        for (Integer integer : integers) {
            int strNum = valueMap.get(integer);
            if (isFirst) {
                replace = s.replace(numArr[strNum], String.valueOf(strNum));
                isFirst = false;
            }
            replace = replace.replace(numArr[strNum], String.valueOf(strNum));
        }
        try {
            return Integer.parseInt(replace);
        }catch(NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }
}