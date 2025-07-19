package java10_recursionqs;

public class TrianglePattern1 {
    public static void main(String[] args) {
        pattrn1(0,4);
    }

    static void pattrn1 (int col, int row) {
        if ( col == row) {
            System.out.println();
            row = row - 1;
            // max_col = max_col - 1;
            col = 0;
        }
        if ( row == 0) {
            return;
        }
        // if ( row == max_row) {
        //     return;
        // }
        System.out.print("*");
        pattrn1(col + 1, row);
    }
}
