package javatutorial.javamail;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.net.ssl.ExtendedSSLSession;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
//import static javatutorial.javamail.JavaMailUtil.prepareMessage;
import javatutorial.javamail.JavaMailUtil;

public class JavaMailUtil {
    public static void sendMail(String recepient) throws Exception{
        System.out.println("Sending message...");

        Properties properties = new Properties();

        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccEmail = "andreibacilatest@gmail.com";
        String myPassword = "Laptedecapra123";
        ///ExtendedSSLSession session = ExtendedSSLSession.getInstance() ;
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return  new PasswordAuthentication(myAccEmail,myPassword);
            }
        });

        Message message = prepareMessage(session, myAccEmail, recepient);

        Transport.send(message);
        System.out.println("Message sent succesfully");
    }
    private static Message prepareMessage(Session session, String myAccEmail, String recepient){
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("My first Email from java app");
            ///message.setText("Salutari, \n tocmai ce ai primit primul meu mail trimis dintr-o aplicatie java");
            //message.setContent();

            return message;
        } catch (Exception ex){
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
}
