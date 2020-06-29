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
        ArrayList puntosRecorridos = new ArrayList<>();
        boolean correcto = true;
        
        try {
        BufferedReader br = new BufferedReader (new FileReader ("sample.in"))
      
        //leo la linea y compruebo que no esta vacia (fin del fichero)
        while((linea = br.readLine())!=null){
            //Divido la linea por los espacios
            StringTokenizer st = new StringTokenizer (linea);
            //cojo cada dato de la linea
            String p = st.nextToken();
            String c = st.nextToken();
            //limpio el array de puntosRecorridos
            puntosRecorridos.clear();
            //extraigo los puntos y los carriles de la linea del fichero
            int puntos = Integer.parseInt(p);
            int carriles = Integer.parseInt(c);
            //compruebo que hay carriles suficientes para llegar a todos los puntos, sino es imposible recorrer todos los puntos de interes
            if( carriles < (puntos-1)) { 
                System.out.println("A PIE");
                //recorro todas las lineas para llegar a la siguiente con los puntos de interes y caminos
                for(int i = 0; i < carriles; i++) {
                br.readLine();
               }
            } else {
                //en caso contrario recorro linea a linea para comprobar que los carriles pasen por todos los puntos de interes
                for(int i = 0; i < carriles; i++) {
                linea = br.readLine();
                st = new StringTokenizer (linea);
            
                String p1 = st.nextToken();
                String p2 = st.nextToken();
                //extraigo los 2 puntos de interes que une el camino
                int a = Integer.parseInt(p1);
                int b = Integer.parseInt(p2);
                //añado los 2 puntos a la lista de puntos recorridos
                puntosRecorridos.add(a);
                puntosRecorridos.add(b);
               }
               //quito los puntos de interes repetidos de la lista y los introduzco en hashSet
               Set<String> hashSet = new HashSet<String>(puntosRecorridos);
               //limpio la lista de puntos recorridos y la actualizo con los datos del hashSet
               puntosRecorridos.clear();
               puntosRecorridos.addAll(hashSet);
               //compruebo que se recorren todos los puntos
               if (puntosRecorridos.size() < puntos){
                   System.out.println("A PIE");
                } else {
                    System.out.println("BICI");
                }
            }

        }
       }catch(Exception e) {}
    }
}
