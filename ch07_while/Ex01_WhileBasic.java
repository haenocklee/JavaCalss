package ch07_while;

public class Ex01_WhileBasic {
    public static void main(String[] args) {

        /**
         * 1~3 까지 반복후 끝
         * */
        for (int i = 1; i <= 3; i++) {
            System.out.println("i= "+i);

        }

        int i = 1;
        while (i <= 3){
            System.out.println("i= " + i);
            i++;
        }

        int j =10;
        do{
            System.out.println("j= " + j);
            j++;
        }while(j <= 3);
        System.out.println("end after the do while" + j);

        int k = 1;
        while(true) {
            System.out.println("무한반복!" + k);
            k++;
            if(k == 3){
                break;
            }
            System.out.println("break 다음 문장");
            //break 걸려서 "break 다음 문장" 증발
        }

        int l = 1;
        boolean run = true;
        while (run) {
            System.out.println("l = " + l);
            l++;
            if (l == 3) {
                run = false;
            }
            System.out.println("run=false 다음 문장");
        }

    }
}