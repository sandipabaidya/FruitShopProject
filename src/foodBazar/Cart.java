package foodBazar; /**
 * Created by Sandipa on 8/23/2017.
 */
import java.util.*;
public class Cart implements ICart {

    private ProductCatalogue productCatalogue;
    private Map<String, LineItem> lineItems;
    private float totalPrice;

    public Cart(ProductCatalogue productCatalogue){
        this.productCatalogue=productCatalogue;
        this.lineItems=new HashMap<String, LineItem>();
        this.totalPrice = 0;
    }

    @Override
    public void AddToCart(String itemName, float quantity ) {
        //Check if item available in catalogue/store
        IProduct product=productCatalogue.FindProductByName(itemName);
        if(product!=null)
        {
            UpdateCart(product, quantity);
        }
        else
            System.out.println("Item not recognized: " + itemName);
    }

    @Override
    public void Checkout() {
        //print Bill header
        System.out.println(GetHeader());
        //print line item
        for (Map.Entry<String, LineItem> entry : lineItems.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        //print total
        System.out.println("Total amount = "+ totalPrice);
    }

    private void UpdateCart(IProduct product, float quantity)
    {
        //Update the quantity if item is already existing in the cart
        if(lineItems.containsKey(product.Name()))
            lineItems.get(product.Name()).UpdateQuantity(quantity);
        //Else insert a new Item
        else
            lineItems.put(product.Name(), new LineItem(product.Name(),product.GetPrice(),quantity ));
        totalPrice += (product.GetPrice() * quantity);
    }

    private String GetHeader()
    {
        return ("Fruit" + "\t" + "Quantity" + "\t" + "Amount");
    }
   
}
