package Zad1Woda;

public class Main {

    public static void main(String[] args) {
        MyWater magazyn =new MyWater(4,4,2);
        System.out.println(magazyn.waterCapacity());
        magazyn.addLarge(1);
        System.out.println(magazyn.waterCapacity());
    }

}
