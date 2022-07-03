/*설명 A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
        입력
        첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
        두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
        세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
        네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
        각 집합의 원소는 1,000,000,000이하의 자연수입니다.
        출력
        두 집합의 공통원소를 오름차순 정렬하여 출력합니다.*/
package Algorithm3;

import java.util.*;

public class Algorithm3_2 {
    public ArrayList<Integer> solution(int n1, int n2, int[] a1, int[] a2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int v1 =0, v2=0;
        Arrays.sort(a1);  //12359
        Arrays.sort(a2);  //23578
        while(v1<n1 && v2<n2) {
            if(a1[v1] < a2[v2]) v1++;
            else if(a1[v1] > a2[v2]) v2++;
            else if(a1[v1] == a2[v2]) {
                answer.add(a1[v1]);
                v1++;
                v2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Algorithm3_2 test = new Algorithm3_2();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int[] arr1 = new int[num1];
        for(int i=0; i<num1; i++) {
            arr1[i] = kb.nextInt();
        }
        int num2 = kb.nextInt();
        int[] arr2 = new int[num2];
        for(int i=0; i<num2; i++) {
            arr2[i] = kb.nextInt();
        }
        for(int x : test.solution(num1, num2, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
