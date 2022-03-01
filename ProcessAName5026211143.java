import java.util.Scanner;

public class ProcessAName5026211143 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Type your name in here:");
        String nama  = input.nextLine();

        String firstName = nama.substring(0,1).toUpperCase();
        int lastSpaceIdx = nama.lastIndexOf(' ');
        String lastName = nama.substring(lastSpaceIdx+1);
        System.out.println("Your name is " + lastName + ", "+ firstName + ".");
    }

}