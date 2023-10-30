package com.example.product.models;

public class TamGiac {
    private int canhA;
    private int canhB;
    private int canhC;

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }
    public double chuVi(){
        return this.canhA +canhB+canhC;
    }
    public double dienTich(int canhA,int canhB, int canhC){
        return (canhA*canhB)/2;
    }
}
