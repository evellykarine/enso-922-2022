package app;
 
import io.jooby.annotations.*;
 
@Path("/divisao/{op1}:{op2}")
public class Divisao{
 
    @GET
    public double calculaDivisao (@PathParam double op1, @PathParam double op2) {
        return op1 / op2;
    }
}
