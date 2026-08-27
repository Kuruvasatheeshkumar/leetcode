class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {

            if (!isVowel(arr[start])) {
                start++;
            }
            else if (!isVowel(arr[end])) {
                end--;
            }
            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr);
    }

    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }

        return false;
    }
}
