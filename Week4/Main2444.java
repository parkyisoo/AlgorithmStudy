import java.util.Scanner;
// 별 찍기
public class Main2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //5를 입력하면 별의 개수가 1,3,5,7,9,7,5,3,1 순으로 출력됨
        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = i+1; j< num; j++) {
                System.out.print(" ");
            }
            for(int k = i; k >= 0; k--) {
                System.out.print("*");
            }
            for(int l = i; l > 0; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<num; i++) {
            for(int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = i; k<num; k++) {
                System.out.print("*");
            }
            for(int l = i+1; l<num; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
