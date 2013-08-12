package localizador;

import java.io.*;  
import java.net.InetAddress; 
/**
 *
 * @author luis
 */
public class localizador {
  
   InetAddress ia;
   
    
    public localizador() {
    }
    
    /**
     * @param args the command line arguments
     */
    public String ip(String lala){
            try {  
          ia = InetAddress.getByName(lala);           
            System.out.println("sucesso");
       } catch (Exception e) {  
            
            e.printStackTrace();  
       }  
                    return ia.getHostName();
        }
    
    public String host(String lala){
           try {  
          ia = InetAddress.getByName(lala);           
            System.out.println("sucesso");
       } catch (Exception e) {  
            
            e.printStackTrace();  
       }  
                    return ia.getHostAddress();
        }
    
    public String canonical(String lala){
             try {  
          ia = InetAddress.getByName(lala);           
          
       } catch (Exception e) {  
            
            e.printStackTrace();  
       }  
                    return ia.getCanonicalHostName();
        }
     
}
