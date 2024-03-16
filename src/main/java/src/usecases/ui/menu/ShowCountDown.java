package src.usecases.ui.menu;

public class ShowCountDown {
    public static void countDown(int seconds){
        System.out.println();
        for (int i = seconds; i > 0; i--) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
