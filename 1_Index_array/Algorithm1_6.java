/*설명     소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
        중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
        입력
        첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
        출력
        첫 줄에 중복문자가 제거된 문자열을 출력합니다.*/
package Index_array;
import java.util.*;
public class Algorithm1_6 {
    public String solution(String object) {
        String answer = "";
        char[] words = object.toCharArray();
        int count =0;
        for(int i=0; i<words.length; i++) {
            for(int j=0; j<answer.length(); j++) {
                if (answer.charAt(j) == words[i]) {
                    count++;
                }
            }
            if(count==0) {
                answer+=words[i];
                count=0;
            } else count=0;
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm1_6 T = new Algorithm1_6();
        Scanner kb = new Scanner(System.in);
        String word = kb.nextLine();

        System.out.println(T.solution(word));
    }
}
