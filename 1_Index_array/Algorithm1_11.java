/*설명     알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
        문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
        단 반복횟수가 1인 경우 생략합니다.
        입력
        첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
        출력
        첫 줄에 압축된 문자열을 출력한다.*/
package Index_array;
import java.util.Scanner;
public class Algorithm1_11 {
    public String solution(String words) {
        String answer="";
        int count = 1;
        words += " ";
        for(int i = 0; i<words.length()-1; i++) {
            if(words.charAt(i)==words.charAt(i+1)) {
                count+=1;
            } else {
                answer += words.charAt(i);
                if (count!=1) {
                    answer += count;
                }
                count = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm1_11 T = new Algorithm1_11();
        Scanner kb = new Scanner(System.in);
        String words = kb.next();

        System.out.println(T.solution(words));
    }
}