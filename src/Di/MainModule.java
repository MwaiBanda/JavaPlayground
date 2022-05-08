package Di;

import DesignPatterns.Strategy.ConcreteStrategies.Display.DisplayGraphically;
import DesignPatterns.Strategy.ConcreteStrategies.Fly.SimpleFlying;
import DesignPatterns.Strategy.ConcreteStrategies.Quack.SimpleQuack;
import DesignPatterns.Strategy.Ducks.AmericanCoot;
import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    static DisplayGraphically provideDisplayGraphically(){
        return new DisplayGraphically();
    }

    @Provides
    static SimpleFlying provideSimpleFlying(){
        return new SimpleFlying();
    }

    @Provides
    static SimpleQuack provideSimpleQuack(){
        return new SimpleQuack();
    }

    @Provides
    static AmericanCoot provideCoot(
            DisplayGraphically displayGraphically,
            SimpleFlying simpleFlying,
            SimpleQuack simpleQuack
    ){
        return new AmericanCoot(displayGraphically, simpleFlying, simpleQuack);
    }
}
