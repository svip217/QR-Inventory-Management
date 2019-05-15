


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author muffler
 */
public class QRcodeGen {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String  details = null;
        
        try{
            Statement stmnt = DBConnection.getDBConnection().createStatement();
            details = "SELECT * FROM borrow";
            ResultSet rs = stmnt.executeQuery(details);
            
             while (rs.next()) {
             
                 ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
        
        File f = new File("C:\\Users\\admin\\Documents\\qrproject\\qr.jpg");
        FileOutputStream fos = new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush();
             }
            
        
        
        
        
        }catch(Exception ex){
        
        
        JOptionPane.showMessageDialog(null, "Unable to generate QR Code", "Generation error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
        
    }
    
}
