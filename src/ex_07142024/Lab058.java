package ex_07142024;

public class Lab058 {
    public static void main(String[] args) {
        //Narrowing
        int course = 100;
        float f = 14.85f;
        float s1 = course+f;
        int s = course + (int)f;// implicit casting
        System.out.println(s);// loss of data if we do implicit casting
        System.out.println(s1);
    }
}
