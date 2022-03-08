import java.util.Scanner;

public class PassTheClassNotSystem {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;


        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter your math note: ");
        mat = input.nextInt();
        if (mat > 100 || mat < 0) {
            System.out.println("You can not choose that numbers");
            System.out.println("PLease select a number between 0 and 100\nPLease enter your math note: ");
            mat = input.nextInt();
        }


        System.out.println("PLease enter your turkce note: ");
        turkce = input.nextInt();
        if (turkce > 100 || turkce < 0) {
            System.out.println("You can not choose that numbers");
            System.out.println("PLease select a number between 0 and 100\nPLease enter your turkce note: ");
            turkce = input.nextInt();
        }
        System.out.println("PLease enter your fizik note: ");
        fizik = input.nextInt();
        if (fizik > 100 || fizik < 0) {
            System.out.println("You can not choose that numbers");
            System.out.println("PLease select a number between 0 and 100\nPLease enter your fizik note: ");
            fizik = input.nextInt();

        }

        System.out.println("PLease enter your kimya note: ");
        kimya = input.nextInt();
        if (kimya > 100 || kimya < 0) {
            System.out.println("You can not choose that numbers");
            System.out.println("PLease select a number between 0 and 100\nPLease enter your kimya note: ");
            kimya = input.nextInt();
        }

        System.out.println("PLease enter your müzik note: ");
        muzik = input.nextInt();
        if (muzik > 100 || muzik < 0) {
            System.out.println("You can not choose that numbers");
            System.out.println("PLease select a number between 0 and 100\nPLease enter your müzik note: ");
            muzik = input.nextInt();
        }

        double average = (mat + turkce + fizik + kimya + muzik) / 5;
        if (average < 55) {
            System.out.println("you couldn't pass the class");
        } else {
            System.out.println("Congrats, you pass the class");
        }
        System.out.println("Your average: " + average);


    }

}

