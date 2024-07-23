package ex_07142024;

public class Lab057 {
    public static void main(String[] args) {
        //Narrowing
        long i = 897865443l;
        byte b = (byte)i;// Implicit narrowing
        System.out.println(b);// The remaining memory can be collected the garbage collector
    }
}
