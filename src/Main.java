import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        try {
            System.out.println("Zahl 1:");
            int i1 = sc.nextInt();

            System.out.println("Zahl 2:");
            int i2 = sc.nextInt();

            i = i1 + i2;

            System.out.println("Ergebnis: " + i);
        }catch(Exception e){
            System.out.println("Es wurde ein nicht kompatibler Wert angegeben!");
        }


    }

}
