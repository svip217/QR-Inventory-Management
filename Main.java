
import java.awt.EventQueue;
import javax.swing.JFrame;


/**
 *
 * @author muffler
 */
public class Main implements Runnable {
public final JFrame frame;
public Main (JFrame frm) {
    this.frame = frm;
}
public void run(){
frame.setVisible(true);
}
public static void main (String args []){
     //  new frmsplash (3000);//call a splash screen
EventQueue.invokeLater(new Main (new LoginPage()));
        }
}
