import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main1316 {
    //check 메서드를 만든다. 단어를 입력해서 그룹단어인지 아닌지만 판단하면 됨 ==> boolean
    static boolean check(String str){
        boolean[] check = new boolean[100];
        int prev = -1; // 이전 문자 인덱스값 변수

        for (int i = 0;  i < str.length(); i++){
            int current = str.charAt(i); // 현재 문자의 아스키 값을 저장함

            if(prev != current){
                if(!check[current - 97]){ //false라는 것은 문자가 처음 나온 문자임
                    check[current-97] = true;
                    prev = current;

                }else{//아니라는 것은 이미 나온 적이 있는 경우 => 그룹 문자가 아님
                    return false;
                }
            }else{ // 이전 문자와 지금의 문자가 같으면 => 반복문을 다시 진행
                continue;
            }
        }
        return true;
            }

    public static void main(String[] args) throws IOException {
        //BufferedReader을 이용한 방법
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        //예외처리 해줘야함
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            if(check(br.readLine())){
                count ++;
            }
        }
        System.out.println(count);
    }

}
