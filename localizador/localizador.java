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
    public String ip(String sip){
            try {  
          ia = InetAddress.getByName(sip);           
            System.out.println("sucesso");
       } catch (Exception e) {  
            
            e.printStackTrace();  
       }  
                    return ia.getHostName();
        }
    
    public String host(String shost){
           try {  
          ia = InetAddress.getByName(shost);           
            System.out.println("sucesso");
       } catch (Exception e) {  
            
            e.printStackTrace();  
       }  
                    return ia.getHostAddress();
        }
    
    public String canonical(String scanon){
             try {  
          ia = InetAddress.getByName(scanon);           
          
       } catch (Exception e) {  
            
            e.printStackTrace();  
       }  
                    return ia.getCanonicalHostName();
        }
     
}
