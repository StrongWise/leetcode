/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        int result = 1;

        while (result != 0) {
            result = guess(n);
            if (result == -1) {
                right = n - 1;
                n = left + (n - left) / 2;
            } else if (result == 1) {
                left = n + 1;
                n = n + (right - n + 1) / 2;
            }
        }
        return n;
    }
}