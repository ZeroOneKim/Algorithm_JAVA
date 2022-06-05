/*설명     N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
        입력
        첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
        두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
        출력
        N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.*/
package Index_array;

import java.util.Scanner;

public class Algorithm1_4 {
    public String solution(String str) {
        String answer = "";
        for (int j=str.length()-1; j>=0; j--) {
            answer += str.charAt(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm1_4 T = new Algorithm1_4();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i =0; i<N; i++) {
            String words = input.next();
            System.out.println(T.solution(words));
        }
    }
}
