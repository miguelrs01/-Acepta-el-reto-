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
            StringTokenizer st = new StringTokenizer (linea);
            
            String p = st.nextToken();
            String c = st.nextToken();
            
            puntosRecorridos.clear();
            int puntos = Integer.parseInt(p);
            int carriles = Integer.parseInt(c);
            
            if( carriles < (puntos-1)) { 
                System.out.println("A PIE");
                for(int i = 0; i < carriles; i++) {
                br.readLine();
               }
            } else {
                for(int i = 0; i < carriles; i++) {
                linea = br.readLine();
                st = new StringTokenizer (linea);
            
                String p1 = st.nextToken();
                String p2 = st.nextToken();
                int a = Integer.parseInt(p1);
                int b = Integer.parseInt(p2);
                
                puntosRecorridos.add(a);
                puntosRecorridos.add(b);
               }
               
               Collections.sort(puntosRecorridos);
               Set<String> hashSet = new HashSet<String>(puntosRecorridos);
               puntosRecorridos.clear();
               puntosRecorridos.addAll(hashSet);
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
