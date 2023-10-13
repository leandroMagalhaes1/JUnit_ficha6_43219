package org.example;

public class Digitos {

    public double media(int num){
        int somaD=0;
        double median;


        String temp = "";
        String numText = String.valueOf(num);
        int tam = (numText).length();


        for(int i =0;i<tam;i++){
            temp = numText.substring(i, i+1);
            somaD = somaD + Integer.parseInt(temp);
        }

        median = somaD/tam;

        return median;
    }
}
