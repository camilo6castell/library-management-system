package usecases.ui;

import usecases.interfaces.IUseCase;

public class ExitProgram implements IUseCase{
    public void execute(){
        System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
        System.exit(0);
    }
}
