package com.company;
import java.util.Scanner;
public class StringCompress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next()+" ";
        char ch=s.charAt(0);
        int c=0;
        for(int i=0; i<s.length(); i++){
            if(ch==s.charAt(i))
                c++;
            else{
                System.out.print(ch+""+c);
                ch=s.charAt(i);
                c=1;
            }
        }
    }
}
