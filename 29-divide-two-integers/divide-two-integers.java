class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) 
            return Integer.MAX_VALUE;

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int res = 0;

        while (dvd >= dvs) {
            long temp = dvs, m = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                m <<= 1;
            }
            dvd -= temp;
            res += m;
        }

        return (dividend > 0) == (divisor > 0) ? res : -res;
    }
}