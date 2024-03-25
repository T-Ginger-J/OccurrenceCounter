import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CounterTest {

    @Test
    public void NodeEdgeCoverageTest(){
        char[] array = {'r', 'r'};
        OccurrenceCounter testCounter = new OccurrenceCounter(array);
        assertTrue(testCounter.countArr[0] == 2);
    }

    @Test
    public void EmptyPathCoverageTest() {
        char[] array = { };
        OccurrenceCounter testCounter = new OccurrenceCounter(array);
        assertTrue(testCounter.countArr.length == 0);
    }

    @Test
    public void PrimePathCoverageTest(){
        char[] array = {'a', 'b', 'b', 'b', 'c'};
        OccurrenceCounter testCounter = new OccurrenceCounter(array);
        assertTrue(testCounter.countArr[3] == 3);
    }

    @Test
    public void NodeEdgeCoverageTest2(){
        char[] array = {'a', 'x'};
        OccurrenceCounter testCounter = new OccurrenceCounter(array);
        int count = testCounter.countSingleChar('a');
        assertTrue(count == 1);
    }

    @Test
    public void EmptyPathCoverageTest2() {
        char[] array = { };
        OccurrenceCounter testCounter = new OccurrenceCounter(array);
        int count = testCounter.countSingleChar('c');
        assertTrue(count == 0);
    }

    @Test
    public void PrimePathCoverageTest2(){
        char[] array = {'a', 'a', 'b', 'b'};
        OccurrenceCounter testCounter = new OccurrenceCounter(array);
        int count = testCounter.countSingleChar('b');
        assertTrue(count == 2);
    }
    
}
