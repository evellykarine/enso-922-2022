package app;

import io.jooby.annotations.*;

@Path("/raiz/{op}")
public class Raiz {

    @GET
    public double calculaRaiz(@PathParam double op) {
        return Math.sqrt(op);
    }
}
