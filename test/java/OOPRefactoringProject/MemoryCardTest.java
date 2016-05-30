package OOPRefactoringProject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by User on 30.05.2016.
 */
public class MemoryCardTest {


    @Test
    public void testMemoryCardCapacity(){


        MemoryCard memoryCard = new MemoryCard() {
            public String getMemory() {
                return "8GB";
            }
        };


        assertEquals("8GB", memoryCard.getMemory());


    }

    @Test
    public void testPortableHDDImpl(){

        PortableHDD portableHDD = new MediaPlayerNoInstalledSD(new MemoryCard() {
            public String getMemory() {
                return "16GB";
            }
        });


        assertTrue(portableHDD.hasMemory());


    }

    @Test
    public void testPortableHDDNoMemoryInstalledOnStart(){

        PortableHDD portableHDD = new MediaPlayerNoInstalledSD(null);


        assertFalse(portableHDD.hasMemory());
        assertFalse(portableHDD.start());


    }


    @Test
    public void testExtendSDDTestInnerMemory(){

        final MemoryCard installedMemoryCard =new ProjectMemoryCardFactory().get16GBMemoryCard();

        MediaPlayerInstalledHDD mediaPlayerInstalledHDD = new MediaPlayerInstalledHDD(){

            @Override
            protected MemoryCard getInstalledMemoryCard() {
                return installedMemoryCard;
            }
        };


        assertTrue(mediaPlayerInstalledHDD.hasMemory());
        assertTrue(mediaPlayerInstalledHDD.start());
        assertEquals("16GB", mediaPlayerInstalledHDD.getInstalledMemoryCard().getMemory());

    }



}
