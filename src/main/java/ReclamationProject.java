/*
 * The following code needs a lot of TLC. So give it some! 1. Fix all checkstyle errors 2. Determine
 * what it does (it's going to be tough before you finish #1) 3. Improve the name of the methods and
 * variables 4. Add comments and Javadoc comments where needed 5. Remove unnecessary comments as
 * appropriate
/*
 * The following code needs a lot of TLC. So give it some! 1. Fix all checkstyle errors 2. Determine
 * what it does (it's going to be tough before you finish #1) 3. Improve the name of the methods and
 * variables 4. Add comments and Javadoc comments where needed 5. Remove unnecessary comments as
 * appropriate
 * @param shorterString First string to compare
 * @param longerString Second string to compare
 * @ return The largest common substring
 */

public class ReclamationProject {
    public static String largestCommonSubstring(String param1, String param2){
        String longerString, shorterString;
        if (param1.length() > param2.length()){
            longerString  = param1;
            shorterString = param2;
        } else {
            longerString  = param2;
            shorterString = param1;
        }

        String largestCommonSubstring = new String();
        for (int i = 0; i < shorterString.length(); i++) {
            for (int j = shorterString.length() - i; j > 0; j--) {
                for (int k = 0; k < longerString.length()- j; k++) {
                    if (shorterString.regionMatches(i, longerString, k, j) && j > largestCommonSubstring.length()){
                        largestCommonSubstring = shorterString.substring(i,i + j);
                    }
                }
            }
        }
        return largestCommonSubstring;
    }
}
