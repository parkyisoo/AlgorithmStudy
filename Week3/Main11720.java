import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String num = sc.next();

        //입력한 문자열 합구하기
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += num.charAt(i)- '0';
        }
        System.out.print(sum);
    }
}
