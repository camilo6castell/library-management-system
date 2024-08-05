package src.usecases.ui.menu;

public class ShowCountDown {
    public static void countDown(int seconds){
        System.out.println("""
                        
                        Inicio de sesión en..                                      
                        """);
        for (int i = seconds; i > 0; i--) {
            System.out.println(i + " ");
            sleepSeconds();
        }
        System.out.println("""
                                                             
                        """);
    }

    private static void sleepSeconds() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
