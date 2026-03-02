package Easy;

public class hammingDistance {
    public static void main(String[] args) {
        solution(4, 1);
    }

    static public int solution(int x, int y) {
        return Math.abs(setBitNumber(x) - setBitNumber(y));
    }

    static int setBitNumber(int n) {
        if (n == 0)
            return 0;

        int msb = 0;
        n = n / 2;

        while (n != 0) {
            n = n / 2;
            msb++;
        }

        return (1 << msb);
    }

}
