import java.util.Scanner;

public class Main14681 {
    public static void solution(int x, int y){
        if(x>0 && y>0){
            System.out.println("1");
        }else if(x<0 && y>0){
            System.out.println("2");
        }else if(x<0 && y<0){
            System.out.println("3");
        }else if(x>0 && y<0){
            System.out.println("4");
        }else System.out.println("1,2,3,4사분면에 포함되어 있지 않습니다!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        int y = sc.nextInt();
        solution(x,y);
    }
}
