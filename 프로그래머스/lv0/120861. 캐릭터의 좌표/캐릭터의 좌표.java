class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int boundaryX = (board[0] - 1) / 2;
        int boundaryY = (board[1] - 1) / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    System.out.println("up");
                    if (answer[1] >= 0) {
                        if (answer[1] < boundaryY) {
                            answer[1]++;
                        }
                    } else {
                        if (answer[1] >= -1 * boundaryY) {
                            answer[1]++;
                        }
                    }
                    break;
                case "down":
                    System.out.println("down");
                    if (answer[1] >= 0) {
                        if (answer[1] <= boundaryY) {
                            answer[1]--;
                        }
                    } else {
                        if (answer[1] > -1 * boundaryY) {
                            answer[1]--;
                        }
                    }
                    break;
                case "left":
                    System.out.println("left");
                    if (answer[0] >= 0) {
                        if (answer[0] <= boundaryX) {
                            answer[0]--;
                        }
                    } else {
                        if (answer[0] > -1 * boundaryX) {
                            answer[0]--;
                        }
                    }
                    break;
                case "right":
                    System.out.println("right");
                    if (answer[0] >= 0) {
                        if (answer[0] < boundaryX) {
                            answer[0]++;
                        }
                    } else {
                        if (answer[0] >= -1 * boundaryX) {
                            answer[0]++;
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        return answer;
    }
}