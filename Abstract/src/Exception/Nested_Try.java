package Exception;

public class Nested_Try{
    public static void main(String args[]){
        try{
            try{
                System.out.println("Arithmetic Division");
                int b=39/0;} 
                catch(ArithmeticException e)
                {System.out.println(e);}
                try{
                    int a[]=new int[5];
                    System.out.println("Accessing Array Elements");
                    a[5]=4;}
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println(e);}
                        System.out.println ("Inside Parent try"); }
                        catch(Exception e) {
                            System.out.println("Exception caught");}
                            System.out.println("Outside Parent try");}
    
}
