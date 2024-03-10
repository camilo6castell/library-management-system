package usecases.interfaces;

public interface IUseCaseObject<T> {
    T execute(T value);
}
