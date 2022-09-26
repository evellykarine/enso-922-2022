package app;
 
import io.jooby.annotations.*;
 
@Path("/multiplicacao/{op1}/{op2}")
public class Multiplicacao{
 
    @GET
    public double calculaMultiplicacao (@PathParam double op1, @PathParam double op2) {
        return op1 * op2;
    }
}
