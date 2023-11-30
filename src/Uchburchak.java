import java.util.Scanner;

public class Uchburchak {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double hisoblashYuzasi() {
        double s = (a + b + c) / 2;
        double yuza = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return yuza;
    }


    public int hisoblashPerimetri() {
        int P = (int) (a + b + c);
        return P;
    }
}
