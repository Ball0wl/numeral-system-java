package com.company;
import java.util.Scanner;

public class Numbersystems {

    static void wandleBinInDez(){
        int binZahl =111;
        int binAndere=1010101;
        int rest=0;
        int kommaVersch = 0;
        int deziZahl =0;
        int deziZahl2=0;

        while(binZahl != 0){
            rest=binZahl % 10;
            deziZahl= deziZahl+(int)(rest*(Math.pow(2, kommaVersch)));
            binZahl=binZahl/10;
            kommaVersch=kommaVersch+1;
        }
        while(binAndere != 0){
            rest=binAndere % 10;
            deziZahl2= deziZahl2+(int)(rest*(Math.pow(2, kommaVersch)));
            binAndere=binAndere/10;
            kommaVersch=kommaVersch+1;
        }
        System.out.println(deziZahl);
        System.out.println(deziZahl2);

    }


    public static void main(String[] args) {

        int dezZahl=310;
        String octStr=Integer.toOctalString(dezZahl);
        System.out.println(octStr);
        int dezH=12;
        String hexStr=Integer.toHexString(dezH);
        System.out.println(hexStr);

        String hex="FFF";
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);

        wandleBinInDez();
    }
}