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
    public static void main(String args[]){
        Main obj = new Main();
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
            if (num % 2 == 0)
                System.out.print(num);
        });
        System.out.print("\nOdd Numbers: ");
        myList.forEach(num -> {
            if (num % 2 != 0)
                System.out.print(num);
        });

        System.out.print("\nPairs:\n");
        List<List<Integer>> intPairCollector = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            intPairCollector.add(Arrays.asList(i + 1, i + 3));

        intPairCollector.forEach( row -> {
            System.out.printf("%d, %d\n", row.get(0), row.get(1));
        });




    }
}
