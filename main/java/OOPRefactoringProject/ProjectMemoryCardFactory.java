package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public class ProjectMemoryCardFactory implements MemoryCardFactory {



    public MemoryCard get8GBMemoryCard() {
        return new ExtMemoryMicroSDCard("8GB");
    }

    public MemoryCard get16GBMemoryCard() {
        return new ExtMemoryMicroSDCard("16GB");
    }
}
