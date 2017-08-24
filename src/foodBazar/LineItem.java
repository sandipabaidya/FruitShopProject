package foodBazar;

/**
 * Created by Sandipa on 8/24/2017.
 */
public class LineItem {
    private String name;
    private float price;
    private float quantity;
    private float subtotal;
    public LineItem (String itemName, float itemPrice, float itemQuantity)
    {
        name = itemName;
        price = itemPrice;
        quantity = itemQuantity;
        subtotal = itemPrice * itemQuantity;
    }

    public void UpdateQuantity(float itemQuantity)
    {
        this.quantity+=itemQuantity;
        this.subtotal=this.price * this.quantity;
    }

    public String toString ()
    {
        return (name + "\t" + quantity + "\t" + subtotal);
    }
}
