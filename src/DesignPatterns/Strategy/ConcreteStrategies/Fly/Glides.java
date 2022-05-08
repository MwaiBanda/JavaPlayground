package DesignPatterns.Strategy.ConcreteStrategies.Fly;

import DesignPatterns.Strategy.AbstractStrategies.IFlyBehaviour;

public class Glides implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Gliding");
    }
}
