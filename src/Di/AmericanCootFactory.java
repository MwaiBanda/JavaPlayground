package Di;

import DesignPatterns.Strategy.Ducks.AmericanCoot;
import dagger.Component;

@Component(modules = MainModule.class)
public interface AmericanCootFactory {
    AmericanCoot coot();
}
