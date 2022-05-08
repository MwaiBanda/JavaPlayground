package Di;

import DesignPatterns.Delegation.ProductRepository;
import DesignPatterns.Delegation.ProductRepositoryImpl;
import DesignPatterns.Delegation.ProductService;
import DesignPatterns.Strategy.ConcreteStrategies.Display.DisplayGraphically;
import DesignPatterns.Strategy.ConcreteStrategies.Fly.SimpleFlying;
import DesignPatterns.Strategy.ConcreteStrategies.Quack.SimpleQuack;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;


@Module
public class ProductModule {
    @Provides
    @Singleton
    static ProductRepository provideProductRepo(){
        return new ProductRepositoryImpl();
    }

    @Provides
    @Singleton
    static ProductService provideProductService(
            ProductRepository impl
    ){
        return new ProductService(impl);
    }



}
