import java.io.*;

public class Main {

    static int[][] plate = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                plate[i][j] = Integer.parseInt(s[j]);
            }
        }

        fill(0, 0);
        br.close();
    }

    private static void fill(int row, int col) {
        if (col >= 9) {
            fill(row + 1, 0);
            return;
        }

        if (row >= 9) {
            StringBuilder sb = new StringBuilder();
            for (int[] rows : plate) {
                for (int value : rows) {
                    sb.append(value).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }

        if (plate[row][col] == 0) {
            for (int i = 1; i < 10; i++) {
                if (check(row, col, i)) {
                    plate[row][col] = i;
                    fill(row, col + 1);
                }
            }
            plate[row][col] = 0;
            return;
        }
        fill(row, col + 1);
    }

    private static boolean check(int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (plate[row][i] == num) {
                return false;
            }
        }
        
        for (int i = 0; i < 9; i++) {
            if (plate[i][col] == num) {
                return false;
            }
        }
        
        int x = (row / 3) * 3;
		int y = (col / 3) * 3;
		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				if (plate[i][j] == num) {
					return false;
				}
			}
		}
        return true;
    }
}
