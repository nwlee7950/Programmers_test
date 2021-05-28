import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer1 = {};
        int i;
        Arrays.sort(arr);
        int arr_len = arr.length;
        
        answer1 = new int[arr_len];
        
        int answer_point = 0;
        for(i = 0; i < arr_len; i++)
        {
            if(arr[i] % divisor == 0)
            {
                answer1[answer_point] = arr[i];
                answer_point++;
            }
        }
        int[] answer = {};
        if(answer_point == 0)
        {
            answer = new int[1];
            answer[0] = -1;
        }
        else
        {
            answer = new int[answer_point];
            for(i = 0; i < answer_point; i++)
            {
                answer[i] = answer1[i];
            }
        }
        
        return answer;
    }
}