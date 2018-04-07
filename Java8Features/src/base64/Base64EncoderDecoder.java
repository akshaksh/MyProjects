package base64;

import java.util.Base64;

public class Base64EncoderDecoder {

	public static void main(String[] args) {
		 // Getting encoder  
        Base64.Encoder encoder = Base64.getEncoder();  
        byte[] encode = encoder.encode("Ajay".getBytes());
        String str=encoder.encodeToString("Ajay".getBytes());
        System.out.println("encoded :"+str);
     // Getting decoder  
        Base64.Decoder decoder = Base64.getDecoder();  
        // Decoding string  
        System.out.println(new String(decoder.decode(str)));
        
        
        // Encoding URL
        Base64.Encoder encoderurl = Base64.getUrlEncoder();  
        String eStr = encoderurl.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
        System.out.println("Encoded :"+eStr);
       // Getting URL decoder  
        Base64.Decoder decoderurl = Base64.getUrlDecoder();
        System.out.println(new String(decoderurl.decode(eStr)));
        
        
        // Encoding MIME
        Base64.Encoder encodermime = Base64.getMimeEncoder();  
        String mimestr = encodermime.encodeToString("Hello, \nYou are informed regarding your inconsistency of work".getBytes());
        System.out.println("Encoded :"+mimestr);
       // Getting URL decoder  
        Base64.Decoder decodermime = Base64.getMimeDecoder();
        System.out.println(new String(decodermime.decode(mimestr)));
        
	}

}
