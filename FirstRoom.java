import java.util.Scanner;

public class FirstRoom {
    static boolean inputValid;

    public static void firstRoom() {
        Scanner scan = new Scanner(System.in);
        new Player();
        
        System.out.println("You wake up, confused, in a dark room.");

        Player.waitTime(5000);
        System.out.println("You try to leave.");
        Player.waitTime(3000);
        System.out.println("The door is locked.");
        Player.waitTime();
        
        do {
            System.out.print("Where do you want to go? L/R? ");
            String leftOrRight = scan.nextLine();

            if (leftOrRight.equals("L")) {
                inputValid = true;
                Player.waitTime(5000);
                System.out.println("You find a key.");
                Player.waitTime();
                System.out.println("You leave the room.");
            } else if (leftOrRight.equals("R")) {
                inputValid = true;
                Player.waitTime(5000);
                System.out.println("There's nothing there.");
                Player.waitTime();
                System.out.println("You go to the left.");
                Player.waitTime(000);
                System.out.println("You find a key.");
                Player.waitTime();
                System.out.println("You leave the room.");
            } else {
                inputValid = false;
                System.out.println("Error! Invalid input!");
            }
        } while (!inputValid);

        Corridor.corridor();
    }
}
