package ClientTest;
import foodBazar.*;

/**
 * Created by Sandipa on 8/24/2017.
 */

public class MyShopApp {
    public static void main(String args[])
    {
        //Upload Price Catalogue
        ProductCatalogue productCatalogue=new ProductCatalogue();
        productCatalogue.AddToCatalogue("Mango", 20f);
        productCatalogue.AddToCatalogue("Apple", 100f);
        productCatalogue.AddToCatalogue("Orange", 80f);
        productCatalogue.AddToCatalogue("Banana", 30f);
        productCatalogue.AddToCatalogue("Kiwi", 120f);

        //Build foodBazar.Cart
        ICart cart=new Cart(productCatalogue);
        cart.AddToCart("Mango",0.45f);
        cart.AddToCart("Guava",1f);
        cart.AddToCart("apple",2f);
        cart.AddToCart("mango",1f);
        cart.AddToCart("Orange",1.5f);
        cart.AddToCart("banana",0.5f);
        cart.AddToCart("kiwi",0.75f);
        //Checkout
        cart.Checkout();
    }
}

