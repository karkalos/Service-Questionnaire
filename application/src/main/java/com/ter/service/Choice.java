package main.java.com.ter.service;

public class Choice {
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private final String F;


    public Choice() {
        this.A = "A. A$B";
        this.B = "B. _helloWorld";
        this.C = "C. true";
        this.D = "D. java.lang";
        this.E = "E. Public";
        this.F = "F. 1980_s";
    }

    public void setA(String a) {
        A = a;
    }

    public void setB(String b) {
        B = b;
    }

    public void setC(String c) {
        C = c;
    }

    public void setD(String d) {
        D = d;
    }

    public void setE(String e) {
        E = e;
    }

    public String setF() {
        return F;
    }

    public String getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public String getC() {
        return C;
    }

    public String getD() {
        return D;
    }

    public String getE() {
        return E;
    }

    public String getF() {
        return E;
    }
}
