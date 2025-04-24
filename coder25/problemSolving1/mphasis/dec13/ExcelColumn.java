package coder25.problemSolving1.mphasis.dec13;

public class ExcelColumn {
    public static void main(String[] args) {
        int column =701;
        StringBuilder columnName = new StringBuilder();
        while (column > 0) {
            int rem = column % 26;
            if (rem == 0) {
                columnName.append("Z");
                column = column / 26-1;
            } else {
                columnName.append((char) ((rem - 1) + 'A'));
                column = column / 26;
            }
        }
        System.out.println(columnName.reverse());
    }
}
