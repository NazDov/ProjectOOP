package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public interface ExtendHDD extends PortableHDD {

    void setMemoryCard(MemoryCard memoryCard);

    MemoryCard removeMemoryCard();

}
