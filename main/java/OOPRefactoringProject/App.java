package OOPRefactoringProject;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        MemoryCardFactory memoryCardFactory = new ProjectMemoryCardFactory();

        MemoryCard memoryCard=memoryCardFactory.get16GBMemoryCard() ;

        System.out.println(memoryCard.getMemory());

    }
}
