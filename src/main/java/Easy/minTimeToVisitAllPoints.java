package Easy;

public class minTimeToVisitAllPoints {
    static public int solution(int[][] points) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x1 = points[i][0];
            int x2 = points[i + 1][0];

            int y1 = points[i][1];
            int y2 = points[i + 1][1];

            int hor = Math.abs(x1 - x2);
            int ver = Math.abs(y1 - y2);
            while (hor > 0 && ver > 0) {
                res++;
                hor--;
                ver--;
            }
            res += hor + ver;
        }
        return res;
    }

    static void main(String[] args) {
        System.out.println(

                solution(new int[][]{{1, 1}, {3, 4}, {-1, 0}})

        );
    }

}
