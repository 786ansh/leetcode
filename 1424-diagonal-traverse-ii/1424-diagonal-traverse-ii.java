class Solution {
    public int[] findDiagonalOrder(List<List<Integer>>nums) {
         Map<Integer, List<Integer>> diagonalMap = new HashMap<>();

        int maxKey = 0;

        // Group elements based on diagonal index
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> row = nums.get(i);
            for (int j = 0; j < row.size(); j++) {
                int key = i + j;
                maxKey = Math.max(maxKey, key);
                diagonalMap.putIfAbsent(key, new ArrayList<>());
                diagonalMap.get(key).add(row.get(j));
            }
        }

        List<Integer> result = new ArrayList<>();

        // Traverse diagonally from 0 to maxKey
        for (int key = 0; key <= maxKey; key++) {
            List<Integer> diagonal = diagonalMap.get(key);
            if (diagonal != null) {
                for (int i = diagonal.size() - 1; i >= 0; i--) {
                    result.add(diagonal.get(i));
                }
            }
        }

        // Convert list to array
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}