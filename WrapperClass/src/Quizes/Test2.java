package Quizes;
public class Test2 {
    public void m1(Double x) {
        System.out.println("Double");}
        public void m1(long x) {
            System.out.println("long");}
            public static void main(String[] args) {
                int x = 0;//if double the o/p will be double else it will pass long
                Test2 t = new Test2();
               t.m1(x);
                Long l1 = 10L;
                t.m1(l1); 
               }}