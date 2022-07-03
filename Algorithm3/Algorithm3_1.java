/*설명 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
        입력
        첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
        두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
        세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
        네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
        각 리스트의 원소는 int 형 변수의 크기를 넘지 않습니다.
        출력
        오름차순으로 정렬된 배열을 출력합니다.*/
package Algorithm3;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm3_1 {
    public ArrayList<Integer> solution(int num1, int[] arr, int num2, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int v1 = 0, v2 = 0;
        while (v1<num1 && v2<num2) {
            if (arr[v1] < arr2[v2]) answer.add(arr[v1++]);
            else answer.add(arr2[v2++]);
        }
        if(v1<num1) while(v1<num1) answer.add(arr[v1++]);
        if(v2<num2) while(v2<num2) answer.add(arr2[v2++]);
        return answer;
    }
    public static void main(String[] args) {
        Algorithm3_1 T = new Algorithm3_1();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] arr2 = new int[num2];
        for(int i=0; i<num2; i++) {
            arr2[i] = kb.nextInt();
        }
        for(int sun : T.solution(num , arr, num2, arr2)) {
            System.out.print(sun+" ");
        }
    }
}
