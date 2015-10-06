import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class testArrays {


    // check happy path, can the algorithm satify the successful case provided in the question
    @Test
    public void testIndexMustBe2(){
        int[] smallArray = new int[]{4,5};
        int[] largeArray = new int[]{2,3,4,5};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(2, index);
    }

    @Test
    public void testMatchesRightAtBegining(){
        int[] smallArray = new int[]{4,5};
        int[] largeArray = new int[]{4,5,2,3};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(0, index);
    }

    @Test
    public void testWhenDummyMatchOccurs(){
        int[] smallArray = new int[]{2,5};
        int[] largeArray = new int[]{2,3,4,2,5};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(3, index);
    }

    // check case when empty array is passed
    @Test
    public void testEmptyLargeArrayReturnsCorrectly(){
        int[] smallArray = new int[]{4,5};
        int[] largeArray = new int[] {};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(-1, index);
    }

    // check case when small array is NOT truly smaller
    @Test
    public void testSmallArrayIsLargerThanLargeArrayReturnsCorrectly(){
        int[] smallArray = new int[]{4,5,3,2,1};
        int[] largeArray = new int[]{3,2,1};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(-1, index);
    }
}
