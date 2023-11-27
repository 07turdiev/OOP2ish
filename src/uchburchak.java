public class uchburchak {
    private double a;
    private double b;
    private double c;
    public void getElement(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
        if (a <= 0)
            this.a = Math.sqrt(c*c-b*b);
        if (b <= 0)
            this.b = Math.sqrt(c*c-a*a);
        if (c <= 0)
            this.c = Math.sqrt(a*a+b*b);
        if (a*a+b*b != c*c)
            System.out.println("Parametrlar noto'g'ri: ");
        else {
            perimetr();
            yuza();
        }
    }
    public void perimetr(){
        float P = (float) (a + b + c);
        System.out.println(P);
    }
    public void yuza(){
        double S = a*b/2;
        System.out.println(S);
    }
}
