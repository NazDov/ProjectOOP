package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public class Install16GBMemoryCommand implements CommandMemory {

    private MemoryCard memoryCard;

    public Install16GBMemoryCommand(MemoryCardFactory memoryCardFactory) {

        memoryCard = memoryCardFactory.get16GBMemoryCard();
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard=memoryCard;
    }

    public MemoryCard removeMemoryCard() {

        if(memoryCard!=null)
            memoryCard=null;

        return memoryCard;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard==null?MemoryCard.NULL:memoryCard;
    }
}
