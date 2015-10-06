import java.util.ArrayList;
import java.util.Arrays;

public class SubArray {

    public static int findIndex(int[] largeArray, int[] smallArray){
        int startingIndex = -1; // return -1 if largeArray does not contain smallArray
        boolean success = false;

        // check if empty, RETURN EARLY
        if(smallArray.length==0 || largeArray.length==0){
            return -1;
        }

        // check smallArray is truly smaller than largeArray, RETURN EARLY
        if(smallArray.length > largeArray.length){
            return -1;
        }

        // check if smallArray exists inside largeArray
        // FOR EACH element in the largeArray, check if it matches the first elem in the smallerArray
        // if it matches the first elem, then check if EACH elem in the smaller array matches the same set of elems in the larger array
        // the processing can be cut short when
        // - if #of elems left to check in the largerArray is less than the #ofelems in the smallerArray
        // - if after matching a few elems, at any elem there is a mismatch
        for(int i=0; i<largeArray.length; i++){
            if(i+smallArray.length-1 > largeArray.length){  // do not need to look at every element, if the full smaller word cannot be matched
                startingIndex = -1;
                break;
            }

            if(largeArray[i] == smallArray[0]){ //when a match for the first elem of the smallerArray has been found, check for remaining elems matches
                for(int j=0; j<smallArray.length; j++){
                    if( smallArray[j]==largeArray[i+j] ){
                        success = true;
                    } else {
                        success = false;
                    }
                }

                if (success) {
                    return i;
                }
            }
        }

        return -1; //RETURN Default
    }
}
