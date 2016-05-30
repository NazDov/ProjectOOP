package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public class ExtendInnerMemory extends MediaPlayerDecorator {

    private CommandMemory commandMemory;

    public ExtendInnerMemory(ExtendHDD extendableHDD, CommandMemory commandMemory) {
        super(extendableHDD);

        this.commandMemory=commandMemory;
    }

    @Override
    public void setMemoryCard(MemoryCard memoryCard) {

        commandMemory.setMemoryCard(memoryCard);

    }

    @Override
    public MemoryCard removeMemoryCard() {
        return commandMemory.removeMemoryCard();
    }


    @Override
    public boolean hasMemory() {

        return commandMemory.getMemoryCard()!=MemoryCard.NULL;
    }

    @Override
    public boolean start() {

        System.out.println("added memory: "+commandMemory.getMemoryCard().getMemory());

        return super.start();
    }
}
