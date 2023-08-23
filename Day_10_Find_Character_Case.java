import java.util.*;
import java.io.*;
public class Day_10_Find_Character_Case {
    public static int findCase(char ch) {
        if (ch>='A'&&ch<='Z') return 1;
        else if(ch>='a'&&ch<='z') return 0;
        else return -1;


    }
}
