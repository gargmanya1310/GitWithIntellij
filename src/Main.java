//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface FuncInterface
{
    void abstractFun(int x);

    default void normalFun()
    {
        System.out.println("Hello");
    }

}
interface ZeroParameter {
    void display();
}

public class Main
{
    public static void main(String[] args)
    {
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = ()-> System.out.println("This is a zero-parameter lambda expression!");
        zeroParamLambda.display();

        // lambda expression to implement above functional interface. This interface by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);
        fobj.abstractFun(5);

        //simple lambda expressions
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL

        System.out.println("Elements of the ArrayList : ");
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        System.out.println(
                "Even elements of the ArrayList : ");
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

        //String API


    }
}
