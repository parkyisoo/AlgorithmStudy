import java.util.Scanner;

public class Main1330 {
    //백준 두 수 비교하기

    public static String solution(int a, int b){
        if (a > b) return ">";
        else if(a < b) return "<";
        else return "==";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a,b));

    }
}
