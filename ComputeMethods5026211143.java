import java.util.Random;

public class ComputeMethods5026211143 {
    public static void main(String args[]){
    }

    public double fToC (double F) {
        return 5 / 9.0 * (F - 32);
    }

    public double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public int roll(){
        Random dadu = new Random();
        int dadu1 = dadu.nextInt(3)+1;
        int dadu2 = dadu.nextInt(6)+2;
        return (dadu1+dadu2);
    }
}