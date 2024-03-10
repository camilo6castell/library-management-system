package usecases.ui;

import usecases.interfaces.IUseCase;

public class CloseSessionUseCase implements IUseCase<Boolean, Object> {

    @Override
    public Boolean execute(){
        return false;
    }
    @Override
    public Boolean execute(Boolean value) {
        return null;
    }
    @Override
    public Boolean execute(Boolean firstValue, Boolean secondValue) {
        return null;
    }
}
