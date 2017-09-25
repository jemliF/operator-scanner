/**
 * @author Fathi Jemli
 */
class Utils {
    /**
     * This method returns a number which describes how many characters in the beginning of each string are similar
     *
     * @param stringA
     * @param stringB
     * @return int
     */
    public static int stringSimilarityCoefficient(String stringA, String stringB) {
        int l = 0, i = 0;
        if (stringA.length() < stringB.length()) {
            l = stringA.length();
        } else {
            l = stringB.length();
        }
        while (i < l && stringA.charAt(i) == stringB.charAt(i)) {
            i++;
        }
        return i;
    }

    /**
     * This method returns a clean version of a phone number by removing non numeric characters like .,+, etc
     *
     * @param number
     * @return string
     */
    public static String cleanNumber(String number) {
        return number.replaceAll("[^\\d]", "");
    }
}
