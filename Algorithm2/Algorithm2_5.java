package Algorithm2;

import java.util.Scanner;
public class Algorithm2_5 {
    public int solution(int num) {
        int answer = 0;
        int[] ch=new int[num+1];
        for (int i=2; i<=num; i++) {
            if(ch[i]==0) {
                answer++;
                for (int j = i; j <= num; j = j + i) {
                    ch[j]=1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm2_5 T = new Algorithm2_5();
        Scanner kb = new Scanner(System.in);

        int num = kb.nextInt();
        System.out.println(T.solution(num));
    }
}
