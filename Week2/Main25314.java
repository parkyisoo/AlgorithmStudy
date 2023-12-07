import java.util.Scanner;

public class Main25314 {
    //코딩은 체육과목입니다.
    public static void solution(int n){
        //n값이 4라면 long이 1번
        //longNumber은 n을 4로 나눈 횟수(long 출력 반복 횟수)
        int longNumber = n/4;
        String output = "long ";
        for (int i = 0; i < longNumber; i++){
            System.out.print(output);
        }
        System.out.println("int");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        solution(number);
    }
}
