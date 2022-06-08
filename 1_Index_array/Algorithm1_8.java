/*설명     앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
        문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
        단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
        알파벳 이외의 문자들의 무시합니다.
        입력
        첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
        출력
        첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.*/
package Index_array;
import java.util.*;
public class Algorithm1_8 {
    public String solution(String words) {
        String answer="";
        words = words.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(words).reverse().toString();
        if (words.equals(tmp)) answer="YES";
        else answer="NO";
        return answer;
    }
    public static void main(String[] args) {
        Algorithm1_8 T = new Algorithm1_8();
        Scanner kb = new Scanner(System.in);

        String words = kb.nextLine();
        System.out.println(T.solution(words));
    }
}
