import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String userName = scanner.next();
        System.out.println(userName + "\tis a nice name\n" );

        System.out.println("what is your age?");
        int userAge = scanner.nextInt();
        System.out.println(userAge + "\tyour age is good\n" );

        System.out.println("how tall you are?");
        double userHeight = scanner.nextDouble();
        System.out.println(userHeight+ "\tgood.\n" );

        System.out.println("what is your favourite food item?");
        String userThing = scanner.next();
        System.out.println(userThing + "\tok\n" );

       System.out.println("what is your father name?");
        String userFather = scanner.next();
        System.out.println(userFather + "\tgood\n");

        System.out.println("what is your mother name?");
        String userMother = scanner.next();
        System.out.println(userMother + "\tis a nice name\n" );

        System.out.println("what is your sister name?");
        String userSister = scanner.next();
        System.out.println(userSister + "\tis a nice name\n" );

         System.out.println("what is your brother name?");
        String userBrother = scanner.next();
        System.out.println(userBrother + "\tis a nice name\n" );

         System.out.println("what is your best friends name?");
        String userFriends = scanner.next();
        System.out.println(userFriends +"\tis a nice name\n" );

         System.out.println("what is your mothers friend name?");
        String userMotherfriends = scanner.next();
        System.out.println(userMotherfriends + "\tgood\n" );

         System.out.println("where did you live?");
        String userLive = scanner.next();
        System.out.println("\tthanks! for felling information" );



        scanner.close();
    }
}