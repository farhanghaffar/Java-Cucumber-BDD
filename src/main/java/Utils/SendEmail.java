package Utils;


import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
public class SendEmail {
	 // Replace sender@example.com with your "From" address.
    // This address must be verified.
    static final String FROM = "qaautomation@pharma.solutions";
    static final String FROMNAME = "QA Automation";
    
    // Replace smtp_username with your Amazon SES SMTP user name.
    static final String SMTP_USERNAME = "AKIA4PT56E63TMZSIBOE";
    
    // Replace smtp_password with your Amazon SES SMTP password.
    static final String SMTP_PASSWORD = "BEPp9VPm7n9aI2qCncmJ5SAHgvgfDBvg6HybgIvg1ZPK";
    
    // The name of the Configuration Set to use for this message.
    // If you comment out or remove this variable, you will also need to
    // comment out or remove the header below.
    static final String CONFIGSET = "QA-Automation-set";
    
    // Amazon SES SMTP host name. This example uses the US West (Oregon) region.
    // See https://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html#region-endpoints
    // for more information.
    static final String HOST = "email-smtp.us-east-2.amazonaws.com";
    
    // The port you will connect to on the Amazon SES SMTP endpoint. 
    static final int PORT = 587;

//    public static void main(String[] args) {
//		
//		SendEmailNow("Test Report");
//		
//	}

    public static void SendEmailNow(String body, String link) {    	
    	try {
		
    		 // Create a Properties object to contain connection configuration information.
        	Properties props = System.getProperties();
        	props.put("mail.transport.protocol", "smtp");
        	props.put("mail.smtp.port", "587"); 
        	props.put("mail.smtp.starttls.enable", "true");
        	props.put("mail.smtp.auth", "true");
        	props.put("mail.smtp.ssl.trust", "*");
        	props.put("mail.smtp.ssl.protocols", "TLSv1.2");

            // Create a Session object to represent a mail session with the specified properties. 
        	Session session = Session.getDefaultInstance(props);

            // Create a message with the specified information. 
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(FROM,FROMNAME));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(
            		"ambreen.younas@pharma.solutions,"+
            		"ambreeny4191@gmail.com,"+
            		"madhavi.cirasanambati@pharma.solutions,"+
            		"uchenna.ofoma@pharma.solutions"
            		));
            
            // Add a configuration set header. Comment or delete the 
            // next line if you are not using a configuration set
            msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);                
            
            String currentDateTime = new SimpleDateFormat("dd-MMM-yyyy_h:mm a z").format(Calendar.getInstance().getTime());
            msg.setSubject("Lighthouse Management Smoke Tests Run Report on  "+currentDateTime);
            msg.setText("Report is attached as a zip file, download, extract in a folder and you can see report files there.");
            Multipart multipart = new MimeMultipart();
            BodyPart textPart = new MimeBodyPart(); 
            body += link;
            textPart.setText(body);

			multipart.addBodyPart(textPart);

			// Send the complete message parts
            msg.setContent(multipart );

            // Create a transport.
            Transport transport = session.getTransport();
                        
            // Send the message.
            try
            {
                System.out.println("Sending Email...");
                
                // Connect to Amazon SES using the SMTP username and password you specified above.
                transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
            	
                // Send the email.
                transport.sendMessage(msg, msg.getAllRecipients());
                System.out.println("Email sent!");
            }
            catch (Exception ex) {
                System.out.println("The email was not sent.");
                System.out.println("Error message: " + ex.getMessage());
            }
            finally
            {
                // Close and terminate the connection.
                transport.close();
            }

		} catch (Exception e) {
			// TODO: handle exception
		}
           }
}
