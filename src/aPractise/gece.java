package aPractise;

import java.util.Arrays;

import java.util.ArrayList;

public class gece {

    public static void main(String[] args) {


       String words[] = { "parvina","parvina","mahir","mahir","ramazan"};

        ArrayList<String> uniqueArr = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {

            int k = 0;
            if (!uniqueArr.contains(words[i])){
                uniqueArr.add(words[i]);
                k++;

                for (int j = i; j < args.length ; j++) {
                    if (words[i]==words[j]){
                        k++;
                    }
                }

                System.out.println(words[i]);
                System.out.println(k);
            }

        }

    }
}

