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
