class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int indexT = 0;
        int indexS = 0;

        int lengthT = t.length();
        int lengthS = s.length();

        char[] sourceChars = s.toCharArray();
        char[] targetChars = t.toCharArray();

        if (lengthS < 1) {
            return true;
        }

        while (indexT < lengthT) {

            if (targetChars[indexT] == sourceChars[indexS]) {
                indexS++;
            }

            indexT++;

            if (indexS == lengthS) {
                return true;
            }
        }

        return false;
    }
}