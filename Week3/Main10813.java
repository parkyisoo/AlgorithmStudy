import java.util.Scanner;

public class Main10813 {
    /*
    도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.

도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.

공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) {
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //n번 바구니엔 n번의 공
        //원래 바구니에 들어있는 배열 출력
        int[] array = new int[n];
        for (int i = 0; i<array.length; i++){
            array[i] = i + 1;
        }
        //n,m이 주어졌으면 둘째줄부터 m번만큼 공 교환 방법 입력 반복


        for (int k = 0; k < m; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            temp = array[i-1];
            array[i-1] = array[j-1];
            array[j-1] = temp;
        }
        //배열 출력
        for (int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
