import java.util.ArrayList;
import java.util.Arrays;

public class SubArray {

    public static int findIndex(int[] largeArray, int[] smallArray){
        int startingIndex = -1; // return -1 if largeArray does not contain smallArray
        boolean subArrayFound = false;

        // check empty
        if(smallArray.length==0 || largeArray.length==0){
            return -1;
        }

        // check smallArray is truly smaller than largeArray
        if(smallArray.length > largeArray.length){
            return -1;
        }

        // check if array2 exists inside array1


        return -1;
    }
}
