package OOPRefactoringProject;

/**
 * Created by User on 30.05.2016.
 */
public class ExtMemoryMicroSDCard implements MemoryCard {


    private String memoryCapacity;

    public ExtMemoryMicroSDCard(String capacity){
        memoryCapacity=capacity;
    }


    public String getMemory() {
        return memoryCapacity;
    }
}
