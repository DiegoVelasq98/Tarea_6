
package sobrecarga;

public class Sobrecarga {


        
        String nombre;
        int edad;
        int carnet;

    public Sobrecarga(String nombre, int edad, int carnet) {
        this.nombre = nombre;
        this.edad = edad;
        this. carnet=carnet;
    }

  
    

    public Sobrecarga(int carnet) {
        this.carnet = carnet;
    }
        
    
    public void curso(){
        System.out.println("Muy buenas, mi nombre es "+ nombre+ " tengo "+edad+ " años y mi carnet de la universidad es " +carnet);
    }

    public void curso(int corporativo){
        System.out.println("Soy " + nombre + " y tengo " +edad+ " años y mi corporativo es " + corporativo);  
        
    }
}