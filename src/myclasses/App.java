
package myclasses;

import entity.Buyer;
import entity.Product;

public class App {
    public void run(){
        Product product=new Product();
        Buyer buyer=new Buyer();
        product.setProductName("Jaitsa");
        product.setProductPrice(2);
        product.setProductLimitation(false);
        product.setProductExpiredays(31);
        buyer.setFirstName("Aleksei");
        buyer.setLastName("Lobosok");
        buyer.setBuyerAge(18);
        System.out.printf("%s %s купил %s за %d евро",
                    buyer.getFirstName(),
                    buyer.getLastName(),
                    product.getProductName(),
                    product.getProductPrice()
                );
    }
}
