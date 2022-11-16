package Assignments;

import java.io.IOException;
import java.util.Scanner;

public class FindDuplicateChar {
        public static void main(String[] args) throws IOException {
            // create object of the string.
            String S;
            Scanner scan = new Scanner(System.in);

            // enter your statement here.
            System.out.print("Enter the Statement : ");

            // will read statement and store it in "S" for further process.
            S = scan.nextLine();
            int count = 0, len = 0;
            do {
                try {
                    // this loop will identify character and find how many times it occurs.
                    char[] name = S.toCharArray();
                    len = name.length;
                    count = 0;
                    for (int j = 0; j < len; j++) {
                        // use ASCII codes for searching.
                        if ((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91) || (name[0] >= 97 && name[0] <= 123)))
                            count++;
                    }
                    if (count != 0) {
                        // print all the repeated characters.
                        System.out.println(name[0] + " " + count + " Times");
                    }
                    S = S.replace("" + name[0], "");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            while (len != 1);
        }
    }
