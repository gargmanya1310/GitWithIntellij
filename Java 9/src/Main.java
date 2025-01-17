//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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
    public static void main(String[] args)//throws FileNotFoundException
    {

//try-with-resources
//        FileOutputStream fileStream=new FileOutputStream("javatpoint.txt");
//        try(fileStream){
//            String greeting = "Welcome to javaTpoint.";
//            byte b[] = greeting.getBytes();
//            fileStream.write(b);
//            System.out.println("File written");
//        }catch(Exception e) {
//            System.out.println(e); }

// private interface methods
        Sayable s = new Main();
        s.say();


    }
}