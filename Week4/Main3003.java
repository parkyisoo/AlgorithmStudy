import java.util.Scanner;
// 킹, 퀸, 룩, 비숍, 나이트, 폰
public class Main3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //킹 1개, 퀸 1개, 룩 2개, 비숍 2개 나이트 2개, 폰 8개
        // 검은색 피스는 다 있고
        // 흰색 피스는 올바르지 않음
        // 흰색 피스 개수 입력
        int[] whitePiece = new int[6];
        for(int i = 0; i < whitePiece.length; i++){
            whitePiece[i] = sc.nextInt();
        }

        int[] blackPiece = {1, 1, 2, 2,2, 8};
        // 검정 피스와 흰 피스와 개수 비교 후 차이를 배열에 저장
        int[] newPiece = new int[6];
        for (int i = 0 ; i < whitePiece.length; i++){
            newPiece[i] = blackPiece[i] - whitePiece[i];
            System.out.print(newPiece[i] + " ");
        }

    }
}
