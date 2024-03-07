import java.io.*;
class Coche
{
  //Atributos
  String color;
  String marca;
  int km;
  
  //Metodo
  public static void main(String[] args)
  {
    
     // Crear un objeto.
     Coche coche1 = new Coche();
     
    // Modificar atributos.
    coche1.color = "Rojo";
    coche1.marca = "Mitsubishi";
    coche1.km = 0;
    
    // Mostrar por pantalla los valores del objeto.
    System.out.println("El color del coche es:"+coche1.color);
    System.out.println("La marca del coche es:"+coche1.marca);
    System.out.println("El km del coche es:"+coche1.km);
  }
}
