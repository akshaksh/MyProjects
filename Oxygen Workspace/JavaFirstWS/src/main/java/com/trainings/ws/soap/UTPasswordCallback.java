
package com.trainings.ws.soap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;



public class UTPasswordCallback implements CallbackHandler {

	private Map<String, String> passwords = new HashMap<String, String>();

	public UTPasswordCallback() {
		
		passwords.put("Bharath", "Bharath");
		passwords.put("cxf", "cxf");
	}

	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		for (int i = 0; i < callbacks.length; i++) {
			WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];

			String pass = passwords.get(pc.getIdentifier());
			if (pass != null) {
				pc.setPassword(pass);
				return;
			}
		}
	}


}
/**
 * With security
 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soap.ws.trainings.com/">
   <soapenv:Header>
  <wsse:Security xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" soapenv:mustUnderstand="1">
  <wsse:UsernameToken xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
  <wsse:Username xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">Bharath</wsse:Username>
  <wsse:Password xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText">Bharath</wsse:Password>
  </wsse:UsernameToken>
  </wsse:Security>
   </soapenv:Header>
   <soapenv:Body>
      <soap:processPayment>
         <!--Optional:-->
         <paymentProcessorRequest>
            <creditCardInfo>
               <cardNumber>1234</cardNumber>
               <firstName>abc</firstName>
               <lastName>def</lastName>
               <secCode>gfg</secCode>
               <Address>dfsdf</Address>
            </creditCardInfo>
            <double>4.5</double>
         </paymentProcessorRequest>
      </soap:processPayment>
   </soapenv:Body>
</soapenv:Envelope>
 * */
