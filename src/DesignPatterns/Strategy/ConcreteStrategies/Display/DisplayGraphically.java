package DesignPatterns.Strategy.ConcreteStrategies.Display;

import DesignPatterns.Strategy.AbstractStrategies.IDisplayBehaviour;

public class DisplayGraphically implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("Displayed Graphically");
    }
}
