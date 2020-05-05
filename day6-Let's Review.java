import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        // System.out.println(T);

        for(int i=0;i<=T;i++){
            String S = input.nextLine();
            String a = "";
            String b = "";
            if (!S.isEmpty()){
            for(int j=0;j<S.length();j++)
            {
                char result = S.charAt(j);

                if(j%2 == 0)
                {
                    a += result;
                }
                else
                {
                    b += result;
                }
            }System.out.println(a+" "+b);
        }
        }
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }
}
