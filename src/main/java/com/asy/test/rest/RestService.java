package com.asy.test.rest;
import com.asy.test.rest.model.Color;
import com.asy.test.rest.model.ColorDetail;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;
import java.util.List;

/**
 * Created by Asy
 */
// The Java class will be hosted at the URI path "/"
@Path("/")
public class RestService {

    @GET // The Java method will process HTTP GET requests
    @Produces(MediaType.TEXT_PLAIN)    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Path("/facto/{num}")
    public String getFacto(@PathParam("num") String num) {
        BigInteger result = BigInteger.ONE;
        int param = 0;
        try {
            param = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return "Parameter error";
        }
        boolean isnegative = param < 0;
        if (isnegative) {
            param *= -1;
        }

        for (int i = 1; i <= param; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        if (isnegative) {
            result = result.multiply(BigInteger.valueOf(-1));
        }

        return num + "! = " + result;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/colors")
    public Color[] listColors() {
        Color white = new Color("white", "ffffff");
        Color black = new Color("black", "000000", new ColorDetail("det2.1", "det2.2"));

        Color[] colorList = {white, black};
        return colorList;
    }

}
