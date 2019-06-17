package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) throws IllegalArgumentException {

        if(endingIndex - startingIndex < 0) {
            throw new IllegalArgumentException();
        }

        //try {
            String[] result = new String[endingIndex - startingIndex];
            Integer index = 0;

            for (int i = startingIndex; i < endingIndex; i++) {
                result[index] = arrayToBeSpliced[i];
                index++;
            }

            return result;

        //}

       /* catch (NegativeArraySizeException ex) {
            String[] error = {};
            return error;
        }*/


    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) throws IllegalArgumentException {

       // if((startingIndex >= arrayToBeSpliced.length) || (startingIndex < 0)) {
        if(startingIndex >= arrayToBeSpliced.length) {
            throw new IllegalArgumentException();
        }

        String[] result = new String[arrayToBeSpliced.length - startingIndex];
        Integer index = 0;

        for(int i = startingIndex; i < arrayToBeSpliced.length; i ++) {
            result[index] = arrayToBeSpliced[i];
            index++;
        }

        return result;
    }
}
