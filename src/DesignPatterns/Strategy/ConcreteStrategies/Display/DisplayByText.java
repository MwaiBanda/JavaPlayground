package DesignPatterns.Strategy.ConcreteStrategies.Display;

import DesignPatterns.Strategy.AbstractStrategies.IDisplayBehaviour;

public class DisplayByText implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("Displayed by text");
    }
}
