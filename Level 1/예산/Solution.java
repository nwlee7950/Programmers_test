import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int i;
        int length = d.length;
        Arrays.sort(d);
        
        for(i = 0; i < length; i++)
        {
            if(budget >= d[i])
            {
                budget = budget - d[i];
                answer = answer + 1;
            }
        }
        
        return answer;
    }
}