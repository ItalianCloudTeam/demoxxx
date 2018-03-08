package application.rest.v1;

import java.net.InetAddress;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("hello")
public class Example {



    @GET
    public String greet() throws Exception{
     return "Ciao siamo il team italian cloud dalla macchina: "+InetAddress.getLocalHost().getHostName();
    
    }


}
