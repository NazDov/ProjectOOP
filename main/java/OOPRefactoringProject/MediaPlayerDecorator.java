package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public abstract class MediaPlayerDecorator implements ExtendHDD {

    protected ExtendHDD extendableHDD;

    public MediaPlayerDecorator(ExtendHDD extendableHDD){
        this.extendableHDD=extendableHDD;
    }

    public abstract void setMemoryCard(MemoryCard memoryCard);

    public abstract MemoryCard removeMemoryCard();

    public boolean hasMemory() {
        return true;
    }

    public boolean start() {

        return extendableHDD.start();
    }

}
