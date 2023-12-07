import java.util.Scanner;

public class Main2438 {
    //별찍기 - 1
    public static void solution(int n){
        for (int i = 0; i < n; i++){
            for (int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        solution(number);
    }

}
