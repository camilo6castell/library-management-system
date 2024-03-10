package usecases.interfaces;

public interface IUseCaseObjectObject<T, G> {
    G execute(T firstValue, T secondValue);
}
