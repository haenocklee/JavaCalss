package cha00_player;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시각:");
        int H = scanner.nextInt();
        System.out.print("분:");
        int M = scanner.nextInt();

        int min = 0;

        if((0 <= H && H <= 23) && (0 <= M && M <= 59)){
            if(M - 45 <= 0){
                min = M - 45;
                M = 60 + min;
                H = H - 1;
                System.out.println( H + "시" + M + "분에 알람이 설정되었습니다");
            }else{
                System.out.println( H + "시" + (M - 45) + "분에 알람이 설정되었습니다");
            }
        }else{
            System.out.println("정확한 시각과 분을 입력해 주세요");
        }
    }
}
