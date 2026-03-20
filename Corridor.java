import java.util.Scanner;

public class Corridor {
    static boolean inputValid = true;

    public static void corridor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        Player.waitTime(5000);
        System.out.println("You find yourself in a dungeon.");
        Player.waitTime(3000);
        System.out.println("You feel something beneath your feet.");
        Player.waitTime(2000);
        System.out.println("It's a note. You pick it up.");
        Player.waitTime();
        System.out.println("\u001B[43m----------------------------------------------------------------------------");
        System.out.println("    Welcome to the dungeon! Congratulations for leaving the first room!");
        System.out.println("   There are two more rooms. Enemies await you. Choose wisely. Good luck!");
        System.out.println("----------------------------------------------------------------------------\u001B[0m");
        Player.waitTime(10000);
        System.out.println("You start walking.");
        Player.waitTime(15000);
        System.out.println("There's something shining. You walk over.");
        Player.waitTime(5000);
        
        do {
            System.out.print("It's a gem. Do you pick it up? Y/N? ");
            String gemChoice = scan.nextLine();

            if (gemChoice.equals("Y")) {
                inputValid = true;
                Player.hasGem = true;
            } else if (gemChoice.equals("N")) {
                inputValid = true;
            } else {
                inputValid = false;
                System.out.println("Error! Invalid input!");
            }
        } while (!inputValid);

        SecondRoom.weaponSelection();
    }
}
