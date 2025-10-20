import java.util.*;

public class main {



    public static void main(String [] args) {

        Scanner Keyborad = new Scanner(System.in);

        judges();

        int judgeScore;

        ArrayList<Contestants> diva = new ArrayList<>();

        for (int i = 0 ; i < 5; i++) {


            System.out.println("Enter your name: ");
            String divaName = Keyborad.nextLine();

            Contestants diva1 = new Contestants(divaName);

            diva.add(diva1);


        }



            for (Contestants C : diva) {

                for (String i : judges())


                System.out.println( judges().get() + " Enter the Score for " + C.getDivaName());


                judgeScore = Keyborad.nextInt();
                C.setScoreCard(judgeScore);


            }

            for (Contestants D : diva) {

                System.out.println(D.getDivaName() + " Score is : " + D.getScoreCard());
                // We will add the score to keep track of the judges

            }


        }


    public static ArrayList<String> judges () {

        Scanner Keyborad = new Scanner(System.in);


        int JudgeMax = 3;
        String judgesName;


        System.out.println("Welcome Judges.");

       ArrayList<String> judgesNames = new ArrayList<>();

        for (int i = 0; i < JudgeMax; i++) {

            System.out.println("Enter your name: ");
            judgesName = Keyborad.nextLine();
            judgesNames.add(judgesName);

            System.out.println(judgesNames);
        }

        return judgesNames;
    }
}



