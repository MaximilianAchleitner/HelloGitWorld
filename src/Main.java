import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while(i==0) {
            try {
                System.out.println("Zahl 1:");
                int i1 = Integer.parseInt(sc.next());

                System.out.println("Zahl 2:");
                int i2 = Integer.parseInt(sc.next());

                System.out.println("Zahl 3:");
                int i3 = Integer.parseInt(sc.next());

                System.out.println("Operator (+|-|*|/)");
                String Op = sc.next();

                
                if(Op.equals("+"))
                    i = i1 + i2 + i3;
                else if(Op.equals("-"))
                    i= i1 - i2 - i3;
                else if(Op.equals("*"))
                    i= i1 * i2 * i3;
                else if(Op.equals("/"))
                    i= i1 / (i2 * i3);


            } catch (Exception e) {
                System.out.println("Es wurde ein nicht kompatibler Wert angegeben!");
            }
        }


        System.out.println("Ergebnis: " + i);


    }

}
