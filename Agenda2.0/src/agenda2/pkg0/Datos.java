
package agenda2.pkg0;

public class Datos {
    
    
  public String nombre;
  public String apellido;
  public int tel1;
  public int tel2;
  public String mail;

  // Metodo ImprimirContacto()
  
    public static void ImprimirContacto(Datos d){
        System.out.println("");
        System.out.println("Nombre: "+d.nombre);
        System.out.println("Apellido: "+d.apellido);
        System.out.println("Telefono1: "+d.tel1);
        System.out.println("Telefono2: "+d.tel2);
        System.out.println("Email: "+d.mail);
    
    }
    
}
