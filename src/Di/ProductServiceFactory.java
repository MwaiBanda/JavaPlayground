package Di;

import DesignPatterns.Delegation.ProductService;
import dagger.Component;

@Component(modules = ProductModule.class)
public interface ProductServiceFactory {
    ProductService service();
}
