package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public class MediaPlayerInstalledHDD implements ExtendHDD {


    private MemoryCard installedMemoryCard;

    protected MediaPlayerInstalledHDD(){

        installedMemoryCard = getInstalledMemoryCard();
    }


    public void setMemoryCard(MemoryCard memoryCard) {
        throw new UnsupportedOperationException("no memory extension available");
    }

    public MemoryCard removeMemoryCard() {
        return null;
    }

    public boolean hasMemory() {
        return true;
    }

    public boolean start() {

        System.out.println("installed memory: "+installedMemoryCard.getMemory());

        return true;
    }

    protected MemoryCard getInstalledMemoryCard() {
        return new ProjectMemoryCardFactory().get8GBMemoryCard();
    }
}
