package ThrowExe;
public class ComSuff{
    void m1() throws ArithmeticException{
        int x = 100, y=0;
        int z=x/y;
        System.out.println(z);}}
        class Sub extends ComSuff{
            void m1() throws NumberFormatException{System.out.println("Wipro");}}
