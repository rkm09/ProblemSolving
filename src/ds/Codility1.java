package ds;

import java.util.List;

public class Codility1 {

    public static void main(String[] args) {
        String input = "java fs       ";
        int len = 7;
        // "java%20fs"
    }

    static void urlify(String in, int len) {
        char[] cin  = in.toCharArray();
        int spaces = 0;
        for(int i = 0 ; i < len ; i++) {
            if(cin[i] == ' ') {
                spaces++;
            }
        }
        int revisedLen = len + spaces*2;
        cin[revisedLen] = '\0';
        for(int i = len-1 ; i >= 0 ; i--) {
            if(cin[i] == ' ') {
                cin[revisedLen-1] = '0';
                cin[revisedLen-2] = '2';
                cin[revisedLen-3] = '%';
                revisedLen = revisedLen - 3;
            } else {
                cin[revisedLen-1] = cin[i];
                revisedLen = revisedLen - 1;
            }
        }
    }
}
