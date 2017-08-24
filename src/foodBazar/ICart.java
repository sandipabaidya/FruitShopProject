package foodBazar;

/**
 * Created by Sandipa on 8/23/2017.
 */
public interface ICart {
    void AddToCart(String itemName, float quantity);
    void Checkout();
}
