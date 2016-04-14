/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.wsclient;

import com.mkyong.ws.HelloWorld;
import com.mkyong.ws.HelloWorldImplService;
import com.tpb.paygate.ws.EBGProcessor;

/**
 *
 * @author phuongle
 */
public class WSClient {

	public static void main(String[] args) {
		EBGProcessor client = new EBGProcessor();
		System.out.println("fasdfs");

		String abc = client.getEBGProcessorHttpSoap11Endpoint().processRequest("123445", "fasd", "fasd", "fsda", "fasdf");
		System.out.println(abc);
//		HelloWorldImplService service = new HelloWorldImplService();
//		HelloWorld abc = service.getHelloWorldImplPort();
//		System.out.println("jhgkhjlkjl;"+abc.getHelloWorldAsString());

	}
}
