/*설명     선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
        선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
        입력
        첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
        출력
        선생님이 볼 수 있는 최대학생수를 출력한다.*/
package Algorithm2;

import java.util.Scanner;
public class Algorithm2_2 {
    public int solution(int[] num) {
        int answer = 1;
        int max = num[0];
        for(int i=0; i<num.length-1; i++) {
            if (max < num[i+1]) {
                answer += 1;
                max = num[i+1];
            } else if (max > num[i+1]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm2_2 T = new Algorithm2_2();
        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        int[] height = new int[N];
        for (int i=0; i<N; i++) {
            int h = kb.nextInt();
            height[i] = h;
        }
        System.out.print(T.solution(height));
    }
}
