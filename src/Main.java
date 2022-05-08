import DesignPatterns.Builder.Car;
import DesignPatterns.Delegation.ProductRepositoryImpl;
import DesignPatterns.Delegation.ProductService;
import DesignPatterns.Singleton.Singleton;
import DesignPatterns.Strategy.ConcreteStrategies.Display.DisplayGraphically;
import DesignPatterns.Strategy.ConcreteStrategies.Fly.NoFlying;
import DesignPatterns.Strategy.ConcreteStrategies.Fly.SimpleFlying;
import DesignPatterns.Strategy.ConcreteStrategies.Quack.NoQuack;
import DesignPatterns.Strategy.ConcreteStrategies.Quack.SimpleQuack;
import DesignPatterns.Strategy.Ducks.AmericanCoot;
import DesignPatterns.Strategy.Ducks.RubberDuckie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public static void main(String[] args){
        Main obj = new Main();
        int a = 2, b = 4;
        obj.positiveSum(a - 5, b, new Callback() {
            @Override
            public void onCompletion(int c) {
                System.out.printf("The sum of %d & %d is %d", a, b, c);
            }

            @Override
            public void onFailure(String error) {
                System.out.println(error);
            }
        });
        obj.positiveSum(a, b, new Callback() {
            @Override
            public void onCompletion(int c) {
                System.out.printf("The sum of %d & %d is %d\n", a, b, c);
            }

            @Override
            public void onFailure(String error) {
                System.out.println(error);
            }
        });

        obj.setX(10);
        System.out.printf("The value of x is %d\n%n", obj.getX());

        List<Integer> myList = new ArrayList<>();

        for (int i = 1; i < 11; i++)
            myList.add(i);

        myList.forEach(num -> {
            System.out.print(num);
        });
        System.out.print("\nEven Numbers: ");
        myList.forEach(num -> {
            System.out.print((num % 2 == 0) ? String.format("%d", num) : "");
        });
        System.out.print("\nOdd Numbers: ");
        myList.forEach(num -> {
            if (num % 2 != 0) System.out.print(num);
        });

        System.out.print("\nPairs:\n");
        List<List<Integer>> intPairCollector = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            intPairCollector.add(Arrays.asList(i + 1, i + 3));

        intPairCollector.forEach( row -> {
            System.out.printf("%d, %d\n", row.get(0), row.get(1));
        });

        /* Design Patterns  */
        /* Delegation */
        ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
        ProductService service = new ProductService(productRepositoryImpl);
        service.fetchRecommended(1);
        service.fetchRecommended(-1);

        /* Strategy */
        DisplayGraphically displayGraphically = new DisplayGraphically();
        SimpleFlying simpleFlying = new SimpleFlying();
        SimpleQuack simpleQuack = new SimpleQuack();
        NoFlying noFlying = new NoFlying();
        NoQuack noQuack = new NoQuack();

        AmericanCoot americanCoot = new AmericanCoot(displayGraphically, simpleFlying, simpleQuack);
        RubberDuckie rubberDuckie = new RubberDuckie(displayGraphically, noFlying, noQuack);

        System.out.println("\nAmerican Coot");
        americanCoot.display();
        americanCoot.fly();
        americanCoot.quack();

        System.out.println("\nRubber Duckie");
        rubberDuckie.display();
        rubberDuckie.fly();
        rubberDuckie.quack();

        /* Singleton */
        Singleton x = Singleton.getInstance();
        x.process();

        /* Builder */
        Car mercedes = new Car.Builder("Mercedes Benz", "AMG GT 63")
                .year(2021)
                .color("Black")
                .build();

        Car astonMartin = new Car.Builder("Aston Martin", "DB11")
                .color("Orange")
                .year(2022)
                .license("NZ-0977868")
                .build();

        System.out.printf("\n%s %s\n", mercedes.getMake(), mercedes.getModel());
        System.out.printf("%s %s\n", astonMartin.getMake(), astonMartin.getModel());

    }
    public  void positiveSum(int a, int b, Callback callback) {
        if (a < 0 || b < 0)
            callback.onFailure("Enter positive numbers only");
        else
            callback.onCompletion(a + b);
    }
    interface Callback {
        public void onCompletion(int c);
        public void onFailure(String error);
    }
}
