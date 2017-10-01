package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] test = new String[3][6];
        char simv = 'a';
        for (int i = 0; i < 3; i++){
            int numb = 1;
            for (int k = 0; k < 6; k++){
                test[i][k] = simv + "" + numb++;
            }
            simv++;
        }
        for (int i =  0; i < 3; i++){
            for (int k = 0; k < 6; k++){
                System.out.print(test[i][k] + " ");
            }
            System.out.println();
        }
        Phone.receiveCall(1234);
    }
}
