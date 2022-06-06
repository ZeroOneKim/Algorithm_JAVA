/*설명 N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
        (첫 번째 수는 무조건 출력한다)
        입력
        첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
        출력
        자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.*/
package Algorithm2;

import java.util.*;
public class Algorithm2_1 {
    public static void main(String[] args) {
        Algorithm2_1 T = new Algorithm2_1();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] numbers = new int[N];
        ArrayList<Integer> NewNum = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = kb.nextInt();
            numbers[i] = num;
        }
        NewNum.add(numbers[0]);
        for (int ii = 0; ii < numbers.length - 1; ii++) {
            if (numbers[ii] < numbers[ii + 1]) {  //ArrayList<Integer> 에서의 값 추가법
                NewNum.add((numbers[ii + 1]));
            } else ;
        }

        for(int x : NewNum) {
            System.out.print(x+" ");
        }

    }
}
