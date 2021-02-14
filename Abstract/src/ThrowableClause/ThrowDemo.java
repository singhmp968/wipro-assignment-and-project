package ThrowableClause;
public class ThrowDemo{
    public static void main(String args[]) {
        try {
            int age=Integer.parseInt(args[0]);
            if(age < 18)
            throw new ArithmeticException();
            else if(age >=60) 
            throw new ArithmeticException("Employee is retired");}
            catch(ArithmeticException e) 
            {System.out.println(e);}System.out.println("After Catch");}}
