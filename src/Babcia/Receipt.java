package Babcia;

import java.util.Arrays;

public class Receipt {

    public Product[] Receipt(String receipt) {
        String[] receiptString = receipt.split("/");

        Product[] product = new Product[receiptString.length];

        for (int i = 0; i < receiptString.length; i++) {
            String[] productString = receiptString[i].split(":");
            product[i] = new Product(productString[0], Integer.valueOf(productString[1]), Double.valueOf(productString[2]));
        }
        return product;
    }

    public double sum(Product[] product) {
        double sum = 0;
        for (Product product1 : product) {
            sum += product1.getPrice();
        }
        return sum;
    }


    public int coins(double sum) {
        int quantity = 0;
        double[] tableCoin = {5, 2, 0.2, 0.1, 0.05, 0.01};
String markCoins = "";
        for (double v : tableCoin) {
            quantity += (sum / v);
            markCoins = markCoins.concat((int)(sum/v) + " szt monet " + v + " zł" + "\n ");
            sum -= (int) (sum / v) * v;
        }
        System.out.println(markCoins);
        return quantity;
    }

    public void repeatedProducts(Product[] product) {

        String boughtMoreExpensive = "";
        for (int i = 0; i < product.length; i++) {
            int a = i +1;
            for (; a < product.length; a++) {
                if (i == a) continue;
                if (product[i].getName().equals(product[a].getName()) &&
                        product[i].getPrice() != product[a].getPrice()) {
                    if (!boughtMoreExpensive.contains(product[a].getName()))
                        boughtMoreExpensive = boughtMoreExpensive.concat(product[a].getName() + " ");

                }
            }
        }
        System.out.println(boughtMoreExpensive);
    }

}
