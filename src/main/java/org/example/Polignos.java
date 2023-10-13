package org.example;

public class Polignos {
    int comp;
    int largura;
    int lado1, lado2, lado3;

    public Polignos(int novaComp, int novaLargura){
        this.comp = novaComp;
        this.largura = novaLargura;
    }

    public Polignos(int novoComp1, int novoComp2, int novoComp3){
        this.lado1=novoComp1;
        this.lado2=novoComp2;
        this.lado3=novoComp3;
    }

    public int area(int base, int altura){
         int area = base*altura;
         return area;
    }

    public int perimetro(int base, int altura){
        int perimetro = base*2 + altura*2;
        return perimetro;
    }

    public int isTriangle(int a, int b, int c){
        if(a+b>c && a+c>b && b+c>a){
            return 1;
        }else {
            return 0;
        }

    }
}
