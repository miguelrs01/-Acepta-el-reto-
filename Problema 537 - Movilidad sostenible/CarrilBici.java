/**
 * Write a description of class CalcularTramo here.
 * 
 * @author Miguel Rodriguez Sorni
 * @version 1.0
 */
import java.io.*;
import java.util.*;

public class CarrilBici
{
    public static void main (String[] args) throws java.io.IOException
    {
        String linea;
        try {
        BufferedReader br = new BufferedReader (new FileReader ("sample.in"));
        //leo la linea y compruebo que no esta vacia (fin del fichero)
        while((linea = br.readLine())!=null){
            StringTokenizer st = new StringTokenizer (linea);
            
            String p = st.nextToken();
            String c = st.nextToken();
            
            int puntos = Integer.parseInt(p);
            int carriles = Integer.parseInt(c);
            
            if( carriles < (puntos-1)) { 
                System.out.println("A PIE");
            } else {
                System.out.println("BICI");
            }
            
            for(int i = 0; i < carriles; i++) {
                br.readLine();
            }
            
        }
      } catch(Exception e) {}
    }
}
