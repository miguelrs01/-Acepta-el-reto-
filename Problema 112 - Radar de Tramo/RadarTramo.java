
/**
 * Write a description of class CalcularTramo here.
 * 
 * @author Miguel Rodriguez Sorni
 * @version 1.0
 */
import java.io.*;
import java.util.*;

public class RadarTramo
{
    public static void main (String[] args) throws java.io.IOException
    {
        String linea;
        boolean seguir;
        // Cargo el buffer con el contenido del archivo
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //leo la linea y compruebo que no esta vacia (fin del fichero)
        while((linea = br.readLine())!=null){
           
               StringTokenizer st = new StringTokenizer (linea);
               seguir = true;
               // bucle por todas las palabras
               //leo cada dato del archivo
               String mS = st.nextToken();
               String velMaxS = st.nextToken();
               String segS = st.nextToken();
                
                //convierto los datos a tipo DOUBLE
               double m = Double.parseDouble(mS);
               double velMax = Double.parseDouble(velMaxS);
               double seg = Double.parseDouble(segS);

                if(seg < 0) {
                    seguir = false;
                    System.out.println("ERROR");
                }
                
                if(seg == 0 && velMax == 0 && m == 0) {
                    break;
                }
                
               if(seguir == true) {
                double velocidadMedia = (m / seg) * 3.6;
                
                if ( velocidadMedia <= velMax) {
                    System.out.println("OK");
                } else if (velocidadMedia >= velMax * 1.20){
                    System.out.println("PUNTOS");
                }  else {
                    System.out.println("MULTA");
                }  
               }
        
        }

}
}