/*설명 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
        특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
        입력
        첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
        출력
        첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.*/
package Index_array;
import java.util.*;
public class Algorithm1_5 {
    public char[] solution(String object) {
        int right = object.length()-1, left = 0;
        char[] swap = object.toCharArray();
        String temp = "";
        while(left<right) {
            if (!Character.isAlphabetic(swap[left])) {
                left++;
            } else if(!Character.isAlphabetic(swap[right])) {
                right--;
            } else {
                temp += swap[left];
                swap[left] = swap[right];
                swap[right] = temp.charAt(0);
                temp = "";
                left++;
                right--;
            }
        }
        return swap;
    }
    public static void main(String[] args) {
        Algorithm1_5 T = new Algorithm1_5();
        Scanner kb = new Scanner(System.in);
        String word = kb.nextLine();

        System.out.println(T.solution(word));
    }
}
