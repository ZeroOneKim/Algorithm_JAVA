package Algorithm2;

import java.util.Scanner;

public class Algorithm2_9 {
    public int result(int res1, int res2, int res3, int res4) {
        int result = 0;
        if (res1>res2) result=res1;
        else result=res2;
        if (result < res3) result=res3;
        if (result <res4) result=res4;
        return result;
    }

    public int solution(int num, int[][] arr) {
        int answer = 0, GHigh = 0, SHigh = 0;
        int Cross = 0, Cross2 = 0;
        for(int i=0; i<num; i++) {
            int Garo = 0, Sero = 0;
            for(int j=0; j<num; j++) {
                Garo += arr[i][j];
                 Sero += arr[j][i];
            }
            Cross += arr[i][i];
            Cross2 += arr[(num-1)-i][0+i];
            if(GHigh < Garo) GHigh=Garo;
            if(SHigh < Sero) SHigh=Sero;
        }
        answer = result(Cross, Cross2, GHigh, SHigh);

        return answer;
    }

    public static void main(String[] args) {
        Algorithm2_9 T = new Algorithm2_9();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] arr = new int[num][num];
        for (int i =0; i<num; i++) {
            for (int j =0; j<num; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(num, arr));
    }
}
