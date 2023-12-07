import java.util.Scanner;

public class Main2884 {
    public static void solution(int hour, int minute){
        //1. 현재 분이 45분 미만이면 hour-1 60-(45-minute)
            // 만약 시간이 0시라면 24-1을 해야함.
        //2. 그 밖에 경우는 현재 분 - 45분을 해주면 된다.
        if(minute <45){
            if(hour == 0) hour = 23;
            else hour--;
            minute = 60 - (45-minute);
        }else{
            minute = minute - 45;
        }
        System.out.println(hour + " " + minute);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        solution(h,m);
    }
}
