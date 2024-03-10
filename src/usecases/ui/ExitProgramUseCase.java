package usecases.ui;

import usecases.interfaces.IUseCase;

public class ExitProgramUseCase implements IUseCase{
    @Override
    public Object execute(Object value) {
        return null;
    }

    public void execute(){
        System.out.println("""
                            _______________________________________________________________

                            Programa terminado. ¡Vuelva pronto a nuestra biblioteca!
                            _______________________________________________________________""");
        System.exit(0);
    }

    @Override
    public Object execute(Object firstValue, Object secondValue) {
        return null;
    }
}
