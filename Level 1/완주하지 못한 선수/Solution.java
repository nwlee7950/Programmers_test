import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";
        int i = 0;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        while(i < completion.length) 
        {
            if(!completion[i].equals(participant[i]))
            {
                temp = participant[i];
                break;
            }
            else 
            {
                i++;
            }
        }
        if(temp == "")
            answer = participant[participant.length-1];
        else
            answer = temp;
        return answer;
    }
}