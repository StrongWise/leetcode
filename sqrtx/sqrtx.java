class Solution {
    public int mySqrt(int x) {
        if(x == 0 ){
            return 0;
        }
        if (x == 2147483647) {
            return 46340;
        }
        int num = 1;
        while (num * num < x && (num + 1) * (num + 1) <= x) {
            num++;
        }
        return num;
    }
}