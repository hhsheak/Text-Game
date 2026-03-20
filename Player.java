public class Player {
    public static boolean hasGem = false;
    public static boolean hasSword = false;
    public static boolean hasBow = false;
    public static boolean hasArmour = false;

    public static boolean hasRestartedOnce = false;

    public static void waitTime() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void waitTime(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
