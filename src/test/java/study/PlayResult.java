package study;

public class PlayResult {
    int nStrike, nBall;
    public PlayResult(int nStrike, int nBall) {
        this.nStrike = nStrike;
        this.nBall = nBall;
    }
    public String report() {
        if(nStrike==0 && nBall==0){
            return "낫띵";
        }
        if(nStrike==0){
            return String.format("%d 볼",nBall);
        }
        if(nBall==0){
            return String.format("%d 스트라이크",nStrike);
        }
        return String.format("%d 볼 %d 스트라이크",nStrike,nBall);
    }
}
