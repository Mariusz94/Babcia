package Zad1Woda;

public class MyWater {

    private static int largeBottle=2;
    private static int mediuBottle=1;
    private static double smallBottle=0.5;

    private int quantityBottleLarge=0;
    private int quantityBottleMedium=0;
    private int quantityBottleSmall=0;

    public MyWater(int quantityBottleLarge, int quantityBottleMedium, int quantityBottleSmall){
        this.quantityBottleLarge=quantityBottleLarge;
        this.quantityBottleMedium=quantityBottleMedium;
        this.quantityBottleSmall=quantityBottleSmall;
    }

    //Podaje do zapasu wody podaną jaką argument liczbę dużych butelek
    public void addLarge(int botleLarge) {
quantityBottleLarge +=botleLarge;
    }

    public void addMedium(int botleMedium) {
       quantityBottleMedium += botleMedium;
    }

    public void addSmall(int botleSmall) {
     quantityBottleSmall += botleSmall;
    }

    public double waterCapacity() {
        double sumawater = largeBottle * quantityBottleLarge + mediuBottle * quantityBottleMedium + smallBottle*quantityBottleSmall;
        return  sumawater;
    }

    public static void setLargeBottle(int largeBottle) {
        MyWater.largeBottle = largeBottle;
    }

    public static void setMediuBottle(int mediuBottle) {
        MyWater.mediuBottle = mediuBottle;
    }

    public static void setSmallBottle(double smallBottle) {
        MyWater.smallBottle = smallBottle;
    }

    public int getQuantityBottleLarge() {
        return quantityBottleLarge;
    }

    public int getQuantityBottleMedium() {
        return quantityBottleMedium;
    }

    public int getQuantityBottleSmall() {
        return quantityBottleSmall;
    }
}
