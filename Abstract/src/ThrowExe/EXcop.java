//compile Sucessfully
package ThrowExe;
import java.io.*;
public class EXcop {
    void m1() 
    throws FileNotFoundException{
        FileInputStream fx= new FileInputStream("Super.txt"); 
        
    }
    
}class Sub extends EXcop {
    void m1() throws IOException {
        FileInputStream fx= new FileInputStream("Sub.txt");
        
    }
}



