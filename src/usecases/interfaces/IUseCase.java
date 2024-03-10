package usecases.interfaces;

public interface IUseCase<T, G> {
    T execute(T value);
    void execute();
    G execute(T firstValue, T secondValue);
}


