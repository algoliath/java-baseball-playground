package study;

import java.util.List;

class BaseballGame {

    Receiver receiver = new Receiver();
    ResultView sender = new ResultView();
    List<BallNumber> targetBallsNoList; // target number;
    Balls targetBalls;

    BaseballGame(List<Integer> comBallNoList) {
        targetBallsNoList = BallNumber.getBallNumbers(comBallNoList);
        targetBalls = new Balls(targetBallsNoList);
    }

    void play() {
        boolean playGame = true; // stop if flag = 1
        String gameResult = "";
        while(playGame) {
            if (!gameResult.equals("3 스트라이크")) {
                List<Integer> playerList = receiver.getPlayerList();
                gameResult = targetBalls.playGame(playerList);
                sender.report(gameResult);
                continue;
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
            playGame = receiver.wantToPlay();
            if(!playGame) break;
            // initialize inputs: get play balls list for computer
            List<Integer> candidateList = receiver.getPlayerList();
            targetBallsNoList = BallNumber.getBallNumbers(candidateList);
        }
    }
}
