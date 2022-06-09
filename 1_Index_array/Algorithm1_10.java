/*설명     한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
        입력
        첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
        문자열의 길이는 100을 넘지 않는다.
        출력
        첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.*/
package Index_array;

import java.util.Scanner;

public class Algorithm1_10 {
    public int[] solution(String w, char a) {
        int[] answer = new int[w.length()];
        int distance = 100;
        for(int i =0;  i<w.length(); i++) {
            if (w.charAt(i)==a) {
                distance =0;
                answer[i] = distance;
            } else {
                distance += 1;
                answer[i] = distance;
            }
        }
        distance = 100;
        for(int j =w.length()-1; j>=0; j--){
            if (w.charAt(j)==a) {
                distance =0;
            } else {
                distance+=1;
                if (answer[j]>distance) {
                    answer[j]=distance;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm1_10 T = new Algorithm1_10();
        Scanner kb = new Scanner(System.in);
        String words = kb.next();
        char alpha = kb.next().charAt(0);
        for (int i =0; i<T.solution(words, alpha).length; i++) {
            System.out.print(T.solution(words, alpha)[i] + " ");
        }
    }
}
