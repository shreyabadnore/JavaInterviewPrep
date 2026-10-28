package ProgramPractise;

public class PeakElement2D {
	public static void main(String[] args) {

        int[][] arr = {
            {10,  8, 10, 10},
            {14, 13, 12, 11},
            {15,  9, 11, 21},
            {16, 17, 19, 20}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        boolean found = false;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                int current = arr[i][j];

                boolean up = (i == 0) || (current >= arr[i - 1][j]);
                boolean down = (i == rows - 1) || (current >= arr[i + 1][j]);
                boolean left = (j == 0) || (current >= arr[i][j - 1]);
                boolean right = (j == cols - 1) || (current >= arr[i][j + 1]);

                if (up && down && left && right) {

                    System.out.println("Peak element: " + current);
                    System.out.println("Position: [" + i + "][" + j + "]");

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No peak element found.");
        }
    }

}
