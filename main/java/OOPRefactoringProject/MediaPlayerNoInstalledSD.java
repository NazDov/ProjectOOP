package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public class MediaPlayerNoInstalledSD implements PortableHDD {


    private MemoryCard memoryCard;

    public MediaPlayerNoInstalledSD(MemoryCard memoryCard){
        this.memoryCard=memoryCard;
    }


    public boolean hasMemory() {
        return memoryCard!=null;
    }

    public boolean start() {
        if(hasMemory() && memoryCard.getMemory()!=null) {
            System.out.println("running on " + memoryCard.getMemory());

            return true;
        }

        return false;
    }
}
