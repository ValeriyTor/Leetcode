class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> iRow = new ArrayList<>();
            int numElemInRow = i+1;
            iRow.add(1);
            for(int j = 1; j < numElemInRow-1; j++) {
                int elemRiNj = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                iRow.add(elemRiNj);
            }
            if(i != 0) { iRow.add(1); }
            result.add(iRow);
        }

        return result;
    }
}
