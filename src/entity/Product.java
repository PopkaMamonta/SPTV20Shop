
package entity;

public class Product {
    private String productName;
    private int productPrice;
    private boolean productLimitation;
    private int productExpiredays;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public boolean getProductLimitation() {
        return productLimitation;
    }

    public void setProductLimitation(boolean productLimitation) {
        this.productLimitation = productLimitation;
    }

    public int getProductExpiredays() {
        return productExpiredays;
    }

    public void setProductExpiredays(int productExpiredays) {
        this.productExpiredays = productExpiredays;
    }
}
