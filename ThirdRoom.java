import java.util.Scanner;

public class ThirdRoom {
    static boolean inputValid = true;
    
    public static void thirdRoom() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("------------------------------------------------------------------------");
        Player.waitTime(6000);
        System.out.println("You enter the third room.");
        Player.waitTime(7000);

        System.out.println("A dragon appears!");
        Player.waitTime(2000);
        System.out.println("A fight begins!");
        Player.waitTime(5000);
        System.out.println("The fight intensifies!");
        Player.waitTime(5000);

        if (Player.hasBow || Player.hasSword && Player.hasArmour) {
            System.out.println("You win!");
            Player.waitTime(3000);
            System.out.println("You exit the dungeon. Congratulations!");
            Player.waitTime(3000);
        } else {
            System.out.println("You lose! It appears your defence was too low!");
            Player.waitTime(3000);
            do {
                System.out.print("Do you want to start again? Y/N? ");
                String restart = scan.nextLine();

                if (restart.equals("Y")) {
                    inputValid = true;
                    SecondRoom.golemFight();
                } else if (restart.equals("N")) {
                    inputValid = true;
                    System.out.println("Thank you for playing!");
                    Player.waitTime(3000);
                } else {
                    inputValid = false;
                    System.out.println("Error! Invalid input!");
                }
            } while (!inputValid);
            
        }
    }
}
