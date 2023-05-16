class Solution {
    public int[] solution(String[] park, String[] routes) {
        int H = 0;
        int W = 0;
        char[][] row = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                char c = park[i].charAt(j);
                row[i][j] = c;

                if (c == 'S') {
                    H = i;
                    W = j;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String direction = route[0];
            String num = route[1];
            try {
                if ("E".equals(direction)) {
                    int w = W + 1;
                    for (; w <= W + Integer.parseInt(num); w++) {
                        if (row[H][w] == 'X') {
                            throw new Exception("s");
                        }
                    }
                    W += Integer.parseInt(num);
                } else if ("W".equals(direction)) {
                    int w = W - 1;
                    for (; w >= W - Integer.parseInt(num); w--) {
                        if (row[H][w] == 'X') {
                            throw new Exception("s");
                        }
                    }
                    W -= Integer.parseInt(num);
                } else if ("N".equals(direction)) {
                    int h = H - 1;
                    for (; h >= H - Integer.parseInt(num); h--) {
                        if (row[h][W] == 'X') {
                            throw new Exception("s");
                        }
                    }
                    H -= Integer.parseInt(num);
                } else if ("S".equals(direction)) {
                    int h = H + 1;
                    for (; h <= H + Integer.parseInt(num); h++) {
                        if (row[h][W] == 'X') {
                            throw new Exception("s");
                        }
                    }
                    H += Integer.parseInt(num);
                }
            } catch (IndexOutOfBoundsException e) {
            } catch (Exception e) {
            }
        }
        return new int[]{H, W};
    }
}