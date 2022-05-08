package Di.Factory;

import DesignPatterns.Delegation.ProductService;
import Di.ProductModule;
import dagger.Component;

@Component(modules = ProductModule.class)
public interface ProductServiceFactory {
    ProductService service();
}
