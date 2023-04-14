class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;
        int GCD = getGCD(a, b);
        return new int[]{a / GCD, b / GCD};
    }   
    
    public int getGCD(int molecule, int denominator) {
        int remainder = molecule % denominator;
        while(remainder != 0){
            molecule = denominator;
            denominator = remainder;
            remainder = molecule % denominator;
        }
        return denominator;
    }
}