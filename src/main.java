import java.util.*;

public class main {

    public static void main(String [] args) {

        Scanner Keyborad = new Scanner(System.in);
        int judgeScore;

        ArrayList<Contestants> diva = new ArrayList<>();

        for (int i = 0 ; i < 5; i++) {


            System.out.println("Enter your name: ");
            String divaName = Keyborad.nextLine();

            Contestants diva1 = new Contestants(divaName);

            diva.add(diva1);


        }



            for (Contestants C : diva) {

                System.out.println("Enter the Score for " + C.getDivaName());


                judgeScore = Keyborad.nextInt();
                C.setScoreCard(judgeScore);


            }

            for (Contestants D : diva) {

                System.out.println(D.getDivaName() + " Score is : " + D.getScoreCard());

            }


        }




    }


