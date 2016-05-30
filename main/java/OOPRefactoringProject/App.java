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

        ExtendHDD extHDD = new ExtendInnerMemory(new MediaPlayerInstalledHDD(), new Install16GBMemoryCommand(memoryCardFactory));

        extHDD.start();

    }
}
