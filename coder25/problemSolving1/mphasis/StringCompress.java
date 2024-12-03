package coder25.problemSolving1.mphasis;

import java.util.HashSet;
import java.util.Set;

public class StringCompress {
    public static void main(String[] args) {
        String str = "AAAA";  //AB*C*D
        String compressedString = compress(str);
        System.out.println(compressedString + "   is it correct");

    }

    private static String compress(String str) {
        String occ = "";
        String result = "";
        String substr = "";
        char newChar = '\0';
        int end = 0;
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            end = str.length() - 1;
            newChar = str.charAt(i);
            while (end >= i && !occ.equals("")) {
                found=false;
                substr = str.substring(i, end + 1);
//                System.out.println(substr + "  **  " + occ);
                if (occ.equals(substr)) {
                    found = true;
                    result += "*";
                    i = end;
                    occ += substr;
                    System.out.println(occ + "  d    "+result);
                    break;
                }
                end--;

            }
            if (!found) {
                occ+=newChar;
                result += newChar;
            }
        }
        return result;
    }

}
