import java.util.Scanner;

public class Main2739 {
    // 구구단
    public static void solution(int number){
        //N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램
        for(int i = 1; i<10; i++){
            //문제에서 요구하는 형식으로 출력
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //메소드 호출
        solution(num);
    }
}
