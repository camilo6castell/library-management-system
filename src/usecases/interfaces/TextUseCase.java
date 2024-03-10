package usecases.interfaces;

public interface TextUseCase<A, B, C>{
    void execute();
    A execute(A valueA, B valueB, B valueBB);
    A execute(A valueA, B valueB, B valueBB, C valueC, C valueCC, C valueCCCC, B valueBBB, C valueCCC);
}
