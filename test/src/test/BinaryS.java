package test;


import java.util.Random;
import java.util.Scanner;


public class BinaryS {
    public static int randNum;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        randNum = random.nextInt(256);
        
        System.out.println("1부터 256까지의 수를 맞추세요, 8번의 기회가 있습니다.");
        int attempt = 0;
        while (attempt < 8){
            boolean isCorrect = play();
            
            //isCorrect가 true false 면 break 반복문 종료
            if (isCorrect) {
                break;
            }
            //반복횟수가 증가할때마다 시도 횟수 1씩 증가
            attempt = attempt +1;
            System.out.println(attempt + "회 시도")
            ;
        }
        //break 후 여기로 와서 종료
        System.out.println("게임 종료");

    }
    public static boolean play(){
        System.out.print("숫자 입력 : ");
        int input = scan.nextInt();
        
        //입력한 숫자가 random 생성한 숫자라면
        
        if (input == randNum){
            System.out.println("정답");
            return true;
        }else if (input > randNum){
            System.out.println("다운");
        }else if (input < randNum){
            System.out.println("업");
        }
        return false;
    }

}

