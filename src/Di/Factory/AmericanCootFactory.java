package Di.Factory;

import DesignPatterns.Strategy.Ducks.AmericanCoot;
import Di.MainModule;
import dagger.Component;

@Component(modules = MainModule.class)
public interface AmericanCootFactory {
    AmericanCoot coot();
}
