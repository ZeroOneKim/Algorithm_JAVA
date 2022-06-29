package Algorithm2;

import java.util.Scanner;

public class Algorithm2_10 {
    public int result(int num, int[][] res) {
        int result = 0;
        for(int i=1; i<num+1; i++) {
            for(int j=1; j<num+1; j++) {
                if((res[i][j] > res[i-1][j])&&(res[i][j] > res[i][j-1])
                        &&(res[i][j] > res[i+1][j])&&(res[i][j] > res[i][j+1])) {
                    result += 1;
                }
            }
        }
        return result;
    }
    public int solution(int num, int[][] info) {
        int answer;
        int[][] newInfo = new int[num+2][num+2];
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                newInfo[i+1][j+1] = info[i][j];
            }
        }
        answer = result(num, newInfo);
        return answer;
    }
    public static void main(String[] args) {
        Algorithm2_10 T = new Algorithm2_10();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] info = new int[num][num];
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                info[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(num, info));
    }
}
