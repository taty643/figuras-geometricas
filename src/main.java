import java.util.Scanner;

public class main {
    public static void main(String[] arg){

        String color;
        double lado;

        Scanner x =new Scanner(System.in);
        System.out.println("Ingrese el color del cuadrado");
        color =x.next();
        System.out.println("Ingrese el lado del cuadrado");
        lado= x.nextDouble();

        Cuadrado c1=new Cuadrado (color, lado);
        System.out.println("El Area del cuadrado 1 es: "+c1.calcularArea());
        System.out.println("El color del cuadrado 1 es: "+c1.getColor());

        Cuadrado c2=new Cuadrado ("Azul", 2.3);
        System.out.println("El Area del cuadrado 2 es: "+c2.calcularArea());
        System.out.println("El color del cuadrado 2 es: "+c2.getColor());
    }
}
