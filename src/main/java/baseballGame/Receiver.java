package baseballGame;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Receiver {
    Scanner scanner;
    Receiver(){
        this.scanner = new Scanner(System.in);
    }
    List<Integer> getPlayerList(){
        System.out.print("숫자를 입력해 주세요: ");
        int num = scanner.nextInt();
        return Arrays.asList((num/100)%10, (num/10)%10, (num%10));
    }
    boolean wantToPlay(){
        System.out.print("한 번 더 하시겠습니까?: ");
        int coin = scanner.nextInt();
        return (coin==1);
    }
}

