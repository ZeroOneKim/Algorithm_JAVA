package Algorithm2;

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm2_8 {
    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<num; i++) {
            int rank = 1;
            for (int j=0; j<num; j++) {
                if(j == i) continue;
                else {
                    if(arr[i] < arr[j]) {
                        rank++;
                    }
                }
            }
            answer.add(rank);
        }
        return answer;
    }
    public static void main(String[] args) {
        Algorithm2_8 T = new Algorithm2_8();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(num, arr)) {
            System.out.print(x + " ");
        }

    }
}
