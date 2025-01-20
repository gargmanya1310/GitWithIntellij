//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

interface StringOper {
    String concat(String left, String right);
}


interface Sayable{
    default void say() {
        saySomething();
    }
    // Private method inside interface
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }
}

public class Main implements Sayable
{
    public static void main(String[] args)throws Exception
    //throws FileNotFoundException
    {

////try-with-resources
//        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");
//        try(fileStream){
//            String greeting = "Welcome to javaTpoint.";
//            byte b[] = greeting.getBytes();
//            fileStream.write(b);
//            System.out.println("File written");
//        }catch(Exception e) {
//            System.out.println(e); }

//// private interface methods
//        Sayable s = new Main();
//        s.say();
//
////Local variable type inference java 10
//        var name = "John Doe"; // Infers String type
//        var age = 30; // Infers int type
//        var salary = 50000.0; // Infers double type
//
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
//        //If this was done in prev. versions then : Compile-time error: var must be initialized; gvar uninitializedVar;

////unmodifiable collection
//        try {
//
//            // creating object of ArrayList<Character>
//            List<Character> list = new ArrayList<Character>();
//
//            // populate the list
//            list.add('X');
//            list.add('Y');
//
//            // printing the list
//            System.out.println("Initial list: " + list);
//
//            // getting unmodifiable list
//            // using unmodifiableCollection() method
//         //   Collection<Character>immutablelist = Collections.unmodifiableCollection(list);
//
//            Collection<Character>copyoflist = List.copyOf(list);
//            // Adding element to new Collection
//           // System.out.println("\nTrying to modify the unmodifiableCollection");
//            System.out.println("\nTrying to modify the unmodifiablelist using copyOflist");
//
//          //  immutablelist.add('Z');
//            copyoflist.add('Z');
//        }
//        catch (UnsupportedOperationException e) {
//
//            System.out.println("Exception thrown : " + e);
//        }

//        // using var keyword in java 11
//        StringOper s  = (var left, var right) -> left + right;
//        String op = s.concat("Hello", " World");
//        System.out.println(op);

////using string indent in java 12
//        String original = "Hello\nWorld";
//        String indented = original.indent(4);
//        System.out.println(indented);
//
//        //using transform in java 12
//        String original1 = "Hello";
//        String transformed = original.transform(s -> s.toUpperCase());
//        System.out.println(transformed);

////test mismatch() in java 12
//        // getting the file path to the respective two files
//        Path filePath1 = Path.of("C:\\Users\\asus\\Desktop\\m1.txt");
//        Path filePath2 = Path.of("c:\\Users\\asus\\Desktop\\m2.txt");
//
//        // calling the mismatchfunction
//        long mis_match = Files.mismatch(filePath1, filePath2);
//
//        // printing the output result.
//        if (mis_match == -1)
//            System.out.println("No mismatch found in the files");
//        else
//            System.out.println("mismatch found");

////Switch expresssions
//        Object obj = "Hello";
//        switch (obj) {
//            case String s -> System.out.println("It's a string: " + s);
//            case Integer i -> System.out.println("It's an integer: " + i);
//            default -> System.out.println("Unknown type");
//        }
//
//        String day = null;
//        String result = switch (day) {
//            case null -> "The day is null!";
//            case "Monday", "Tuesday" -> "It's a weekday.";
//            default -> "Invalid day.";
//        };
//        System.out.println(result);


        String day = null;
        String result = switch (day) {
            case null:
                yield "The day is null!";
            case "Monday", "Tuesday":
                yield "It's a weekday.";
            default:
                yield "Invalid day.";
        };

        System.out.println(result);



    }
}
