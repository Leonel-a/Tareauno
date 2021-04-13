
public class persona
{
   String Nombre;
   int Edad = 21;
   String Nacionalidad;
   String FechaNacimiento;
   
     public persona(String saludar, String despedirse, String Nacionalidad, int edad){
       saludar = saludar;
       despedirse = despedirse;
       this.Nacionalidad = Nacionalidad;
       edad = edad;
    }
    
    public String persona(){
        String saludo;
        saludo = "hola mi nombre es leonel" + Nombre + " y tengo " + Edad;
        
        return saludo;
        
}

public String despedirse(){
    String despedirse;
    despedirse = "hasta luego nos vemos mañana";
    
    return despedirse;
}
}

