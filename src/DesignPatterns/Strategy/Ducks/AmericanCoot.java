package DesignPatterns.Strategy.Ducks;

import DesignPatterns.Strategy.AbstractStrategies.IDisplayBehaviour;
import DesignPatterns.Strategy.AbstractStrategies.IFlyBehaviour;
import DesignPatterns.Strategy.AbstractStrategies.IQuackBehaviour;
import DesignPatterns.Strategy.ConcreteStrategies.Display.DisplayGraphically;
import DesignPatterns.Strategy.ConcreteStrategies.Fly.SimpleFlying;
import DesignPatterns.Strategy.ConcreteStrategies.Quack.SimpleQuack;
import DesignPatterns.Strategy.Duck;

import javax.inject.Inject;
import javax.inject.Singleton;

public final class AmericanCoot extends Duck {
    @Inject
    public AmericanCoot(IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        super(displayBehaviour, flyBehaviour, quackBehaviour);
    }
}
