package DesignPatterns.Strategy.Ducks;

import DesignPatterns.Strategy.AbstractStrategies.IDisplayBehaviour;
import DesignPatterns.Strategy.AbstractStrategies.IFlyBehaviour;
import DesignPatterns.Strategy.AbstractStrategies.IQuackBehaviour;
import DesignPatterns.Strategy.Duck;

public class RubberDuckie extends Duck {

    public RubberDuckie(IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        super(displayBehaviour, flyBehaviour, quackBehaviour);
    }
}
