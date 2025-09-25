public class constestant {

    String [] constestantsName;
    int [] scorecard;

    public constestant (String divaName, int scoreCard) {

    }

    public void setConstestantsName(String[] constestantsName) {
        this.constestantsName = constestantsName;
    }

    public void setScorecard(int[] scorecard) {
        this.scorecard = scorecard;
    }

    public String[] getConstestantsName() {
        return constestantsName;
    }

    public int[] getScorecard() {
        return scorecard;
    }

    public void print () {


        for (int i = 0; i < constestantsName.length; i++) {

            System.out.println(constestantsName[i]);


        }
    }
}
