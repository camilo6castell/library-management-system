package src.usecases.interfaces;

public interface IUseCase<T, G> {
    G execute(T value);
    void execute();
    G execute(T firstValue, T secondValue);
}


