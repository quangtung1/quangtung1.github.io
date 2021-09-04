package Btcuoiki;

public class _1309_Decrypt_String {
    public static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '#') {
                int num = Integer.parseInt(s.substring(i - 2, i));
                result.append((char) ('a' + num - 1));
                i -= 2;
            } else {
                result.append((char) ('0' + ch));
            }
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String s="10#11#12";
        System.out.println(freqAlphabets(s));
    }
    }

