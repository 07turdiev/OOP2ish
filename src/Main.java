import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kirit = new Scanner(System.in);
        Car car = new Car();
        System.out.print("Moshina rusimini kiriting: ");
        String nomi = kirit.nextLine();
        car.setModel(nomi);

        System.out.print("Moshina rangini kiriting: ");
        String rangi = kirit.nextLine();
        car.setColor(rangi);

        System.out.print("Moshina narxini kiriting: $");
        double narxi = kirit.nextInt();
        car.setPrice(narxi);


        System.out.println(car.getColor() + " rangli " + car.getModel() + " avtomobili " + car.getPrice() + "$ turadi!");

        System.out.println();

        System.out.println("Endi Uchburchak class ga o'tamiz!");
        Uchburchak uchburchak = new Uchburchak();
        System.out.println("Uchburchak tomonlarini kiriting: ");

        System.out.print("a=");
        double a = kirit.nextDouble();

        System.out.print("b=");
        double b = kirit.nextDouble();

        System.out.print("c=");
        double c = kirit.nextDouble();

        uchburchak.setA(a);
        uchburchak.setB(b);
        uchburchak.setC(c);


        System.out.println("Uchburchak perimatri: " + uchburchak.hisoblashPerimetri());
        System.out.println("Uchburchak yuzasi: " + uchburchak.hisoblashYuzasi());

        System.out.println();

        System.out.println("Endi Point class ga o'tamiz.  Atributlar qiymatlarini obyekt yaratilayotgan vaqtda kiritib ketamiz va javob quydagicha: ");
        Point point = new Point(1.0, 2.0, 3.0);


        System.out.println("X qiymati: " + point.getX());
        System.out.println("Y qiymati: " + point.getY());
        System.out.println("Z qiymati: " + point.getZ());


        point.setX(4.0);
        point.setY(5.0);
        point.setZ(6.0);

        System.out.println();
        System.out.println("qiymat o'zgartirildi!");
        System.out.println("Yangi X qiymati: " + point.getX());
        System.out.println("Yangi Y qiymati: " + point.getY());
        System.out.println("Yangi Z qiymati: " + point.getZ());
    }
}