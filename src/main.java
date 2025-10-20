import java.util.*;

public class main {

    public static void main(String [] args) {

        Scanner Keyborad = new Scanner(System.in);

        ArrayList<Contestants> diva = new ArrayList<>();

        for (int i = 0 ; i < 5; i++) {


            System.out.println("Enter your name: ");
            String divaName = Keyborad.nextLine();

            Contestants diva1 = new Contestants(divaName);

            diva.add(diva1);


        }

        for (Contestants C : diva) {

            System.out.println(C.getDivaName());


        }


    }

}
