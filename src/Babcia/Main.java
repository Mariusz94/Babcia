package Babcia;

public class Main {
    public static void main(String[] args) {
        String receipt = "Śliwki:30:2.5/Masło:20:6.20/Kapusta:2:3/Jabłka:5:4/Margaryna:10:20/Śliwki:10:2.5/" +
                "Majonez:8:4/Jabłka:10:4/Kapusta:5:3/Śliwki:20:3.20/Masło:2:3.33/Kiełbasa:2:4.44/Ciasto:4:2.22";

        Receipt receipt1 =new Receipt();
        System.out.println("Cena całkowita to:");
        System.out.println(receipt1.sum(receipt1.Receipt(receipt)));

        System.out.println("Najmniejsza ilosć monet to:");
        System.out.println(receipt1.coins(receipt1.sum(receipt1.Receipt(receipt))) + " sztuk");

        System.out.println("Produkty na których mocher został oszukany");
        receipt1.repeatedProducts(receipt1.Receipt(receipt));
    }
}
