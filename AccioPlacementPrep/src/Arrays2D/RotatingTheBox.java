package Arrays2D;

public class RotatingTheBox {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n = box[0].length;
        char[][] ans = new char[n][m];

        for (int i = 0; i < m; i++) {

            int bottomMost = n - 1; //position where the stone will be placed after rotation

            for (int j = n - 1; j >= 0; j--) {

                ans[j][m - i - 1] = '.'; //place empty stone

                if (box[i][j] == '#') {
                    //stone
                    ans[bottomMost][m - i - 1] = '#';
                    bottomMost--; //next stone will be placed accordingly

                } else if (box[i][j] == '*') {
                    //block -> a stationary obstacle
                    bottomMost = j - 1;
                    ans[j][m - i - 1] = '*';
                }
            }
        }

        return ans;
    }
}
