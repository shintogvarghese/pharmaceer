/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmaceer;
import javax.swing.UIManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Local User
 */
public class PharmaCeer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                try {
    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        System.out.println("LAF: " + info.getName());
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
        }
    }
} catch (ClassNotFoundException | InstantiationException
    | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
    Logger.getLogger(PharmaCeer.class.getName()).log(Level.SEVERE, null, ex);
}
       
        Login log = new Login();
        log.setVisible(true); 
        
    }
    
}
