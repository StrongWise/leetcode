class Solution {
    public int[] solution(String[] wallpaper) {
        int xMax = 0;
        int xMin = Integer.MAX_VALUE;
        int yMax = 0;
        int yMin = Integer.MAX_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    xMax = Math.max(xMax, i+1);
                    xMin = Math.min(xMin, i);
                    yMax = Math.max(yMax, j+1);
                    yMin = Math.min(yMin, j);
                }
            }
        }
        return new int[]{xMin, yMin, xMax, yMax};
    }
}