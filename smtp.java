package code;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;

//import org.mortbay.jetty.servlet.AbstractSessionManager.Session;

//import com.sun.jdi.connect.Transport;

public class smtp  
{  
 public static void main(String [] args){  
      String to = "bala.murthy@gmail.com";//change accordingly  
      String from = "bala.murthy@gmail.com";//change accordingly  
      String host = "localhost";//or IP address  
      Session session;
     //Get the session object  
      Properties properties = System.getProperties();  
      properties.setProperty("mail.smtp.host", host);  
      
	  properties.put("mail.smtp.port", "587");
      properties.put("mail.smtp.auth", "false");
      properties.put("mail.smtp.starttls.enable", "true"); //TLS
      session = Session.getDefaultInstance(properties); 
      
  
     //compose the message  
      try{  
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("Ping");  
         message.setText("Hello, this is example of sending email  ");  
  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");  
  
      }catch (MessagingException mex) {mex.printStackTrace();}  
   }  
}  