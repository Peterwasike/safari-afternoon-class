package xyz;

import java.util.Scanner;

public class fileFour {
    public static void main(String[] args) {
        Scanner chukua;
        String[] watu;
        Integer num;
        chukua = new Scanner(System.in);
        System.out.println("How many names do you have?");
        num = chukua.nextInt();
        watu = new String[num];
        for (int i=0; i<num; i++){
            System.out.println("Enter name"+(i+1));
            watu[i] = chukua.next();
        }

        for (int i=0; i<num;i++){
            System.out.println((i+1)+" "+watu[i]);
        }
    }
}
