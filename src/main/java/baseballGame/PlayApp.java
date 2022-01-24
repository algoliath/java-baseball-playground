package baseballGame;

import java.util.List;

class PlayApp {
    Receiver receiver = new Receiver();
    ResultView sender = new ResultView();
    Balls targetBalls;
    List<BallNumber> targetBallsNoList; // target number;

    PlayApp(List<Integer> comBallNoList) {
        targetBallsNoList = BallNumber.getBallNumbers(comBallNoList);
        targetBalls = new Balls(targetBallsNoList);
    }

    void initGame() {
        boolean keep = true; // stop if flag = 1
        String game_result = "";
        while(keep) {
            if (!game_result.equals("3 스트라이크")) {
                List<Integer> playerList = receiver.getPlayerList();
                game_result = targetBalls.play2Balls(playerList);
                sender.report(game_result);
                continue;
            }
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
            keep = receiver.wantToPlay();
            if(!keep) break;
            // initialize inputs: get play balls list for computer
            List<Integer> candidateList = receiver.getPlayerList();
            targetBallsNoList = BallNumber.getBallNumbers(candidateList);
        }
    }
}
