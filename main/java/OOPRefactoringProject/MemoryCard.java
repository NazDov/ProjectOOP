package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public interface MemoryCard {


    MemoryCard NULL = new NullMemoryCard();

    String getMemory();
}
