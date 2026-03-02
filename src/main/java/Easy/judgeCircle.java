package Easy;

public class judgeCircle {
    public static void main() {

        solution("UD");
    }
    static  public boolean solution(String moves) {
        int horizontal = 0;
        int vertical = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'D')
                vertical--;
            else if (c == 'U')
                vertical++;
            else if (c == 'L')
                horizontal--;
            else
                horizontal++;
        }
        return (Math.abs(vertical) + Math.abs(horizontal)) == 0;
    }
}
