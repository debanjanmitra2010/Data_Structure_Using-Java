import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        RotateMatrix mn = new RotateMatrix();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        mn.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));


    }

    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        System.out.println("n = " + n);
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            System.out.println("first = " + first);
            int last = n - 1 - layer;
            System.out.println("last = " + last);
            for (int i = first; i < last; i++) {
                int offset = i - first;
                System.out.println("Offset " + offset);
                int top = matrix[first][i];
                System.out.println("top " + top);
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;

            }

        }
        return true;

    }
}
