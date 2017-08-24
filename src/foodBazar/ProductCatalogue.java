package foodBazar; /**
 * Created by Sandipa on 8/23/2017.
 */

import java.util.*;

public class ProductCatalogue {
    private Map<String, IProduct> productPriceMap;

    public ProductCatalogue()
    {
        productPriceMap=new HashMap<String, IProduct>();
    }

    public void AddToCatalogue(String name, Float price)
    {
        productPriceMap.put(name, new Product(name, price));
    }

    public IProduct FindProductByName(String name)
    {
        if (productPriceMap.isEmpty())
            return null;

        for (Map.Entry<String, IProduct> entry : productPriceMap.entrySet()) {

            if(entry.getKey().toLowerCase().equals(name.toLowerCase()))
            {
                return entry.getValue();
            }
        }
        return null;
    }
}
