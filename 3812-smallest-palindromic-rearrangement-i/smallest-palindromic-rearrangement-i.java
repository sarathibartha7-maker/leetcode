class Solution {
    public String smallestPalindrome(String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        String middle = "";
        for (int i = 0; i < 26; i++) {
            while (count[i] >= 2) {
                firstHalf.append((char) ('a' + i));
                count[i] -= 2;
            }

            if (count[i] == 1) {
                middle = String.valueOf((char) ('a' + i));
            }
        }

        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        return firstHalf.toString() + middle + secondHalf;
    }
}