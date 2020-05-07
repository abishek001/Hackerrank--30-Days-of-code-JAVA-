import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,String> phNo = new HashMap<String,String>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            String phoneNo = ""+ phone;
            phNo.put(name,phoneNo);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(!phNo.containsKey(s)){
                System.out.println("Not found");
            }else{
                System.out.println(s + "=" + phNo.get(s));
            }
            // Write code here
        }
        in.close();
    }
}
