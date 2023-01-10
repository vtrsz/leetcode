import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        int integer = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 < s.length() && s.charAt(i+1) == 'V') {
                        integer += 4;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i+1) == 'X') {
                        integer += 9;
                        i++;
                    } else {
                        integer += 1;
                    }
                    break;
                case 'V':
                    integer += 5;
                    break;
                case 'X':
                    if (i + 1 < s.length() && s.charAt(i+1) == 'L') {
                        integer += 40;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i+1) == 'C') {
                        integer += 90;
                        i++;
                    } else {
                        integer += 10;
                    }
                    break;
                case 'L':
                    integer += 50;
                    break;
                case 'C':
                    if (i + 1 < s.length() && s.charAt(i+1) == 'D') {
                        integer += 400;
                        i++;
                    } else if (i + 1 < s.length() && s.charAt(i+1) == 'M') {
                        integer += 900;
                        i++;
                    } else {
                        integer += 100;
                    }
                    break;
                case 'D':
                    integer += 500;
                    break;
                case 'M':
                    integer += 1000;
                    break;
            }
        }
        return integer;
    }
}