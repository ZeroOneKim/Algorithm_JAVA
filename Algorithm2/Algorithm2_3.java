/*설명 A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
        가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
        두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
        입력
        첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
        두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
        세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
        출력
        각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.*/
package Algorithm2;
import java.util.Scanner;
public class Algorithm2_3 {

    public static void main(String[] args) {
        Algorithm2_3 GetMain = new Algorithm2_3();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int[] info_A = new int[N];
        int[] info_B = new int[N];
        for (int i=0; i<N; i++) {
            int A = kb.nextInt();
            info_A[i] = A;
        }
        for (int i=0; i<N; i++) {
            int B = kb.nextInt();
            info_B[i] = B;
        }
        for(int i=0; i<N; i++) {
            if (info_A[i]==info_B[i]) System.out.println("D");
            else if ((info_A[i]==1 && info_B[i]==2) || (info_A[i]==2 && info_B[i]==3) || (info_A[i]==3 && info_B[i]==1)) {
                System.out.println("B");
            } else if ((info_B[i]==1 && info_A[i]==2) || (info_B[i]==2 && info_A[i]==3) || (info_B[i]==3 && info_A[i]==1)) {
                System.out.println("A");
            }
        }
    }
}
