/*설명     한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
        문장속의 각 단어는 공백으로 구분됩니다.
        입력
        첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
        출력
        첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
        단어를 답으로 합니다.*/
package Index_array;

import java.util.Scanner;

public class Algorithm1_3 {
    public String solution(String num) {
        String answer = "";
        String temp = "";
        num += " ";
        int answer_count = 0, temp_count = 0;
        for(int i=0; i<num.length(); i++) {
            if ((65 <= num.charAt(i) && num.charAt(i)<=90) || (97 <= num.charAt(i) && num.charAt(i)<=122)){
                temp += num.charAt(i);
                temp_count++;
            } else {
                if (temp_count > answer_count) {
                    answer = temp;
                    answer_count = temp_count;
                    temp="";
                    temp_count = 0;
                } else if (temp_count <= answer_count){
                    temp="";
                    temp_count = 0;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm1_3 T = new Algorithm1_3();
        Scanner kb = new Scanner(System.in);
        String words = kb.nextLine();

        System.out.println(T.solution(words));
    }


}
