package ex_07142024;

public class Lab056 {
    public static void main(String[] args) {
        //Type casting is of two types
        // Narrowing and widening
        // Type casting means source and the destination converstion
        //Widening
        byte i = 10;
        int a = i;// valid implicit
        int a1 = (int)i;// valid explicit

        // Narrowing
        int x = 300;
        //byte y = x; invalid implicit
        byte y = (byte)x;// invalid expicit
        System.out.println(y);
    }
}
