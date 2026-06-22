class Solution {
    public int maxNumberOfBalloons(String text) {
        int count_b = 0;
        int count_a = 0;
        int count_l = 0;
        int count_o = 0;
        int count_n = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'b') {
                count_b++;
            } else if (ch == 'a') {
                count_a++;
            } else if (ch == 'l') {
                count_l++;
            } else if (ch == 'o') {
                count_o++;
            } else if (ch == 'n') {
                count_n++;
            }
        }

        return Math.min(
                Math.min(count_b, count_a),
                Math.min(count_l / 2,
                    Math.min(count_o / 2, count_n))
        );
    }
}