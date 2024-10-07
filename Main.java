import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner mlg360doritosUWUemoboy = new Scanner(System.in);
    Circle a = new Circle(10.1);
    Circle b = new Circle(14.0);
    Circle c = new Circle(20.5);
    System.out.println(a.toString() + "\n" + b.toString() + "\n" + c.toString());

    System.out.println("type # for length + width:");
    double x = mlg360doritosUWUemoboy.nextDouble();
    System.out.println("type # for length:");
    double y = mlg360doritosUWUemoboy.nextDouble();
    System.out.println("type # for width:");
    double z = mlg360doritosUWUemoboy.nextDouble();

    Rectangle urmom = new Rectangle(x);
    Rectangle urdad = new Rectangle(y,z);
    System.out.println(urmom.toString() + "\n" + urdad.toString());

    System.out.println("type # for side length:");
    x = mlg360doritosUWUemoboy.nextDouble();

    RegularPolygon urstepsis = new RegularPolygon(x);
    RegularPolygon urstepbro = new RegularPolygon(4, x);
    System.out.println(urstepsis.toString() + "\n" + urstepbro.toString());
    mlg360doritosUWUemoboy.close();
  }
}
