import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        // vars para los nombres:
        String MY_NAME   = "Pablo";
        String WIFE_NAME = "Confidecial";
        String DOG_1     = "Confidecial";
        String DOG_2     = "Confidecial";

        // vars para las edades:
        byte miEdad   = 40; // para la edad no es necesario declarar tipo int;
        byte wifeEdad = 36; // para la edad no es necesario declarar tipo int;
        byte dog1Edad =  6; // para la edad no es necesario declarar tipo int;
        byte dog2Edad =  5; // para la edad no es necesario declarar tipo int;

        // mostrar por pantalla
        System.out.println("----------------------------------------------------------");
        System.out.println("Mi nombre es " + MY_NAME + " y tengo " + miEdad);
        System.out.println("Pareja nombre es " + WIFE_NAME + " y tiene " + wifeEdad);
        System.out.println("Perro 1 nombre es " + DOG_1 + " y tiene " + dog1Edad);
        System.out.println("Perro 2 nombre es " + DOG_2 + " y tiene " + dog2Edad);
        System.out.println("----------------------------------------------------------");

        System.out.println();
        System.out.println("EJERCICIO 2");

        // char c = ‘z’; conviertelo a int
        System.out.println("----------------------------------------------------------");
        System.out.println("char = z; a int");
        char c = 'z';
        System.out.print("  " + c + "   -> ");
        System.out.println(((Object)c).getClass().getSimpleName());

        int cI = (int) c;
        System.out.print("  " + cI + " -> ");
        System.out.println(((Object)cI).getClass().getSimpleName());

        System.out.println("----------------------------------------------------------");

        // int i = 250; conviertelo a long y luego de long a short
        System.out.println("int = 250; a long");
        int i = 250;
        System.out.print("  " + i + " -> ");
        System.out.println(((Object)i).getClass().getSimpleName());

        long iL = (long) i;
        System.out.print("  " + iL + " -> ");
        System.out.println(((Object)iL).getClass().getSimpleName());

        System.out.println("* long a short");
        short iS = (short) iL;
        System.out.print("  " + iS + " -> ");
        System.out.println(((Object)iS).getClass().getSimpleName());

        System.out.println("* short a byte");
        byte iB = (byte) iL;
        System.out.print("  " + iB + " -> ");
        System.out.println(((Object)iB).getClass().getSimpleName());

        System.out.println("----------------------------------------------------------");

        // double d = 301.067; conviertelo a long
        System.out.println("double d = 301.067; a long");
        double d = 301.067;
        System.out.print("  " + d + " -> ");
        System.out.println(((Object)d).getClass().getSimpleName());

        long dL = (long) d;
        System.out.print("  " + dL + "     -> ");
        System.out.println(((Object)dL).getClass().getSimpleName());

        System.out.println("----------------------------------------------------------");

        /* int i = 100; súmale 5000.66 y conviertelo a float*/
        System.out.println("int i = 100; súmale 5000.66 y conviertelo a float");

        System.out.println("* int i = 100:");
        int i1 = 100;
        System.out.print("  " + i1 + " -> ");
        System.out.println(((Object)i1).getClass().getSimpleName());

        System.out.println("* súmale 5000.66:");
        i1 += 5000.66;
        System.out.print("  " + i1 + " -> ");
        System.out.println(((Object)i1).getClass().getSimpleName());

        System.out.println("* conviertelo a float:");
        float i1F = (float) i1;
        System.out.print("  " + i1F + " -> ");
        System.out.println(((Object)i1F).getClass().getSimpleName());

        System.out.println("----------------------------------------------------------");

        // int i = 737; multiplícalo por 100 y conviertelo a byte
        System.out.println("int i = 737; multiplícalo por 100 y conviertelo a byte");

        System.out.println("* int i = 737");
        int i2 = 737;
        System.out.print("  " + i2 + " -> ");
        System.out.println(((Object)i2).getClass().getSimpleName());

        System.out.println("* multiplícalo por 100");
        i2 *= 100 ;
        System.out.print("  " + i2 + " -> ");
        System.out.println(((Object)i2).getClass().getSimpleName());

        System.out.println("* conviertelo a byte");
        byte i2B = (byte) i2;
        System.out.print("  " + i2B + " -> ");
        System.out.println(((Object)i2B).getClass().getSimpleName());

        System.out.println("----------------------------------------------------------");


        // double d = 298.638; divídelo entre 25 y conviertelo a long
        System.out.println("double d = 298.638; divídelo entre 25 y conviertelo a long");

        System.out.println("* double d = 298.638");
        double d1 = 298.638;
        System.out.print("  " + d1 + " -> ");
        System.out.println(((Object)d1).getClass().getSimpleName());

        System.out.println("* divídelo entre 25");
        d1 /= 25;
        System.out.print("  " + d1 + " -> ");
        System.out.println(((Object)d1).getClass().getSimpleName());

        System.out.println("* conviertelo a long");
        long d1L = (long) d1;
        System.out.print("  " + d1L + " -> ");
        System.out.println(((Object)d1L).getClass().getSimpleName());

        System.out.println("----------------------------------------------------------");

        // ADICIONAL:
        // float f = 298.638; divídelo entre 25 y conviertelo a long
        System.out.println("float f = 298.638; divídelo entre 25 y conviertelo a long");

        System.out.println("* float f = 298.638");
        float f1 = 298.638F;
        System.out.print("  " + f1 + " -> ");
        System.out.println(((Object)f1).getClass().getSimpleName());

        System.out.println("* divídelo entre 25");
        f1 /= 25;
        System.out.print("  " + f1 + " -> ");
        System.out.println(((Object)f1).getClass().getSimpleName());

        System.out.println("* conviertelo a long");
        long f1L = (long) f1;
        System.out.print("  " + f1L + " -> ");
        System.out.println(((Object)f1L).getClass().getSimpleName());

        System.out.println("THE END --------------------------------------------------");

    }
}