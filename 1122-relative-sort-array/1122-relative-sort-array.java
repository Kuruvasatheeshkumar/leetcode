

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);

        int[] result = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    result[index++] = arr1[j];
                    arr1[j] = -1; 
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                result[index++] = arr1[i];
            }
        }

        return result;
    }
}

        
