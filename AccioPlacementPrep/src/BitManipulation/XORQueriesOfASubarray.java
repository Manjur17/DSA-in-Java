package BitManipulation;

public class XORQueriesOfASubarray {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] res = new int[queries.length];
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }

        int k = 0;
        for(int[] query : queries){
            int xor;

            if(query[0] == 0){
                xor = prefix[query[1]];
            }else{
                xor = prefix[query[1]] ^ prefix[query[0] - 1];
            }

            res[k++] = xor;
        }

        return res;
    }

}
