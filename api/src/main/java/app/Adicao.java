package app;

import io.jooby.annotations.*;

@Path("/adicao/{op1}/{op2}")
public class Adicao{

    @GET
    public double calculaAdicao(@PathParam double op1, @PathParam double op2) {
        return op1 + op2;
    }
}
