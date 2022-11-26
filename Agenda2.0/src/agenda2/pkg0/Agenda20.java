
package agenda2.pkg0;

import java.util.LinkedList;
import java.util.Scanner;

public class Agenda20 {

    public static void main(String[] args) {
        LinkedList<Datos> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de contactos: ");
        int tam = sc.nextInt();
        
        for (int i = 0; i < tam; i++) {
            Datos d = new Datos();
            System.out.print("contacto " + (i + 1) + ")" + " ingrese el nombre: ");
            d.nombre = sc.next();
            System.out.print("contacto " + (i + 1) + ")" + " ingrese el apellido: ");
            d.apellido = sc.next();
            System.out.print("contacto " + (i + 1) + ")" + " ingrese el Email: ");
            d.mail = sc.next();
            System.out.print("contacto " + (i + 1) + ")" + " ingrese el numero1 de telefono : ");
            d.tel1 = sc.nextInt();
            System.out.print("contacto " + (i + 1) + ")" + " ingrese el numero2 de telefono : ");
            d.tel2 = sc.nextInt();
            lista.add(d);
        }
        
        for (Datos datos : lista) {
            Datos.ImprimirContacto(datos);
        }
        
      
        
    }
    
}
