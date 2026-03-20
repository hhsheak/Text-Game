import java.util.Scanner;

public class SecondRoom {
    static boolean inputValid = true;
    static Scanner scan = new Scanner(System.in);

    public static void weaponSelection() {
        System.out.println("------------------------------------------------------------------------");
        Player.waitTime(5000);
        System.out.println("You enter the second room.");
        Player.waitTime(2000);
        
        do {
            System.out.print("Choose your weapon: Sword/Bow? ");
            String weaponChoice = scan.nextLine();

            if (weaponChoice.equals("Sword")) {
                inputValid = true;
                Player.hasSword = true;
            } else if (weaponChoice.equals("Bow")) {
                inputValid = true;
                Player.hasBow = true;
            } else {
                inputValid = false;
                System.out.println("Error! Invalid input!");
            }
        } while (!inputValid);

        golemFight();
    }

    public static void golemFight() {
        Player.waitTime(7000);
        System.out.println("A golem appears!");
        Player.waitTime(2000);
        System.out.println("A fight begins!");
        Player.waitTime(5000);
        System.out.println("The fight intensifies!");
        Player.waitTime(5000);

        if (Player.hasSword || Player.hasBow && Player.hasGem) {
            System.out.println("You win!");
            Player.waitTime(5000);

            do {
                System.out.print("The golem has dropped his armour. It looks deformed. Do you want to pick it up? Y/N? ");
                String armourChoice = scan.nextLine();

                if (armourChoice.equals("Y")) {
                    inputValid = true;
                    Player.hasArmour = true;
                    Player.waitTime(3000);
                    System.out.println("You leave the room.");
                } else if (armourChoice.equals("N")) {
                    inputValid = true;
                    Player.waitTime(3000);
                    System.out.println("You leave the room.");
                } else {
                    inputValid = false;
                    System.out.println("Error! Invalid input!");
                }
            } while (!inputValid);

            ThirdRoom.thirdRoom();
        } else {
            System.out.println("You lose! It appears your strength was too low!");
            Player.waitTime(3000);
            do {
                System.out.print("Do you want to start again? Y/N? ");
                String restart = scan.nextLine();
                
                if (restart.equals("Y")) {
                    inputValid = true;
                    if (!Player.hasRestartedOnce) {
                        Player.hasRestartedOnce = true;
                        Corridor.corridor();
                    } else {
                        Player.hasGem = false;
                        Player.hasBow = false;
                        weaponSelection();
                    }
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
