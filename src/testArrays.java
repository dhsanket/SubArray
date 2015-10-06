import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class testArrays {

    @Test
    public void testIndexMustBe2(){
        int[] smallArray = new int[]{4,5};
        int[] largeArray = new int[]{2,3,4,5};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(2, index);
    }

    @Test
    public void testEmptyLargeArrayReturnsCorrectly(){
        int[] smallArray = new int[]{4,5};
        int[] largeArray = new int[] {};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(-1, index);
    }

    @Test
    public void testSmallArrayIsLargerThanLargeArrayReturnsCorrectly(){
        int[] smallArray = new int[]{4,5,3,2,1};
        int[] largeArray = new int[]{3,2,1};

        int index = SubArray.findIndex(largeArray, smallArray);

        Assert.assertEquals(-1, index);
    }
}
