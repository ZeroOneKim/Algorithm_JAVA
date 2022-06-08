/*설명     문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
        만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
        추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
        입력
        첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
        출력
        첫 줄에 자연수를 출력합니다.*/
package Index_array;
import java.util.Scanner;
public class Algorithm1_9 {
    public String solution(String object) {
        String answer = "";
        object = object.toUpperCase().replaceAll("[A-Z]", "");
        for(int i =0; i<object.length(); i++) {
            if(object.charAt(i) == '0') {
            } else if(object.charAt(i)!='0') {
                for(int j=i; j<object.length(); j++) {
                    answer += object.charAt(j);
                }
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm1_9 T = new Algorithm1_9();
        Scanner kb = new Scanner(System.in);
        String words = kb.nextLine();

        System.out.println(T.solution(words));
    }
}
