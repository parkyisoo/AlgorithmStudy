import java.util.Scanner;

public class Main2753 {
    public static int solution(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return 1;
        }else if (year%400 == 0) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(solution(year));
    }
}
