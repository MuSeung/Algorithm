package Algorithm.ProgrammersLv0.Day03;

public class Ex09 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int count = 0;

        for(int i=num1; i<=num2; i++){
            answer[count++]=numbers[i];
        }
        
        return answer;
    }
}
