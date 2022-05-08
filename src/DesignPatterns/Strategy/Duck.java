package DesignPatterns.Strategy;

import DesignPatterns.Strategy.AbstractStrategies.IDisplayBehaviour;
import DesignPatterns.Strategy.AbstractStrategies.IFlyBehaviour;
import DesignPatterns.Strategy.AbstractStrategies.IQuackBehaviour;

import javax.inject.Inject;


public class Duck {
    protected IDisplayBehaviour displayBehaviour;
    protected IFlyBehaviour flyBehaviour;
    protected IQuackBehaviour quackBehaviour;

    public Duck(IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour){
        this.displayBehaviour = displayBehaviour;
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }
}
