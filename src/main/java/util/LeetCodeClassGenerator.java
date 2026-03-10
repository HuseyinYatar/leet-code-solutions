package util;

import java.util.Scanner;

//This Class for generating java class with using leetcode problem names
public class LeetCodeClassGenerator {
    public static void main(String[] args) {
        while(true)
        {
            Scanner in=new Scanner(System.in);
System.out.println(generate(in.nextLine()));        }
    }

    private static String generate(String s) {
        s=s.trim();
        String[] s1 = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for(int i=1;i<s1.length;i++)
        {
            builder.append(s1[i]).append('_');
        }

        return builder.append(s1[0]).toString().replace(".", "");
    }
}
