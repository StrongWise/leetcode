class Solution {
    public int mySqrt(int x) {
        if(x == 0 ){
            return 0;
        }
        int num = 1;
        while (num * num < x && (num + 1) * (num + 1) <= x) {
            if ((num + 1) * (num + 1) < 0)
                return num;
            num++;
        }
        return num;
    }
}