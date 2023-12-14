import java.util.Scanner;

public class Main10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        sc.nextLine();
        //길이가 n인 배열 array 요소 입력
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        //min 값 찾기
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        //max 값 찾기
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
