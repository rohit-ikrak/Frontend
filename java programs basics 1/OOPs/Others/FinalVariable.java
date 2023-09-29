// This program will give error 'cause final variable cannot be changed.
public class FinalVariable {
    public static void main(String[] args){
        final int i = 0;
        System.out.println(i);
        // i = i+10;
        System.out.println(i);
    }    
}
