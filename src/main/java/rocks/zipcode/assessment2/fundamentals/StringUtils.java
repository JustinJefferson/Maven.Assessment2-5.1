package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        String result = "";

        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) {
            result += " ";
        }

        result += stringToBePadded;

        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        String result = stringToBePadded;

        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) {
            result += " ";
        }

        return result;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < numberOfTimeToRepeat; i++) {
            builder.append(stringToBeRepeated);
        }

        return builder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        Character[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


        for(int i = 0; i < string.length(); i++){
            Boolean isAlpha = false;
            for(Character character : characters) {
                if(character.equals(string.charAt(i))) isAlpha = true;
                Character upper = Character.toUpperCase(character);
                if(upper.equals(string.charAt(i))) isAlpha = true;
                if(string.charAt(i) == ' ') isAlpha = true;
            }
            if(!isAlpha) return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        Character[] numbers = {'1', '2','3','4','5','6','7','8','9','0'};


        for(int i = 0; i < string.length(); i++){
            Boolean isNum = false;
            for(Character num : numbers) {
                if(num.equals(string.charAt(i))) isNum = true;

            }
            if(!isNum) return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        Character[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Character[] numbers = {'1', '2','3','4','5','6','7','8','9','0'};

        Boolean isAlpha = false;
        Boolean isNum = false;

        for(int i = 0; i < string.length(); i++){

            for(Character character : characters) {
                if(character.equals(string.charAt(i))) isAlpha = true;
                Character upper = Character.toUpperCase(character);
                if(upper.equals(string.charAt(i))) isAlpha = true;
            }

        }

        for(int i = 0; i < string.length(); i++){
            for(Character num : numbers) {
                if(num.equals(string.charAt(i))) isNum = true;

            }
        }


        return (!isAlpha && !isNum);
    }
}
