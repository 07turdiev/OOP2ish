public class Car {
    private String color;
    private int price;
    private String model;

    public void modelCar(String m){
        model = m;
        System.out.println(model);
    }
    public void priceCar(int p){
        price = p;
        System.out.println(price);
    }
    public void colorCar(String c){
        color = c;
        System.out.println(color);
    }
}
