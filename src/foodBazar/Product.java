package foodBazar;

/**
 * Created by Sandipa on 8/23/2017.
 */
public class Product implements IProduct {
    private String name;
    private float unitPrice;

    Product(String name, float unitPrice)
    {
        this.name=name;
        this.unitPrice=unitPrice;
    }
    @Override
    public float GetPrice() {
        return unitPrice;
    }

    @Override
    public String Name() {
        return name;
    }
}
