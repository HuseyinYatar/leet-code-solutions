package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Keyboard_Row_500 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Aasdfghjkl", "Qwertyuiop", "zZxcvbnm"})));
    }

    static public String[] findWords(String[] words) {
        String[] alphabetRows = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        HashSet<Character>[] rows = new HashSet[3];
        for (int i = 0; i < 3; i++) {
            rows[i] = new HashSet<Character>();
            for (int j = 0; j < alphabetRows[i].length(); j++) {
                rows[i].add(alphabetRows[i].charAt(j));
            }
        }


        ArrayList<String> res = new ArrayList<>();

        for (String word : words) {
            String tmp = word;
            word = word.toLowerCase();
            if (rows[0].contains(word.charAt(0))) {
                isValid(word, 0, res, rows, word);
            } else if (rows[1].contains(word.charAt(0))) {
                isValid(word, 1, res, rows, tmp);

            } else {
                isValid(word, 2, res, rows, tmp);

            }
        }
        return res.toArray(new String[0]);
    }

    static private void isValid(String word, int rowIndex, ArrayList<String> res, HashSet<Character>[] rows, String tmp) {
        boolean err = true;
        for (int i = 1; i < word.length(); i++) {
            if (!rows[rowIndex].contains(word.charAt(i))) {
                err = false;
                break;
            }
        }
        if (err)
            res.add(tmp);
    }
}




