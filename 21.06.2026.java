class Solution {
    public int maxIceCream(int[] costs, int coins) {
        //
        Arrays.sort(costs);

        if (costs[0] > coins)
            return 0;

        int temp_coins = coins;
        int max_icecream = 0;
        // int j=0;

        for (int i = 0; i < costs.length; i++) {
            if (costs[i] <= temp_coins) {
                max_icecream++;
                temp_coins -= costs[i];

            }

        }

        return max_icecream;

    }
}