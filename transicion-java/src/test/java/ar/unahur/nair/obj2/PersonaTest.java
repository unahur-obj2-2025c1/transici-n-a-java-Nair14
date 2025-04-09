package ar.unahur.nair.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

public class PersonaTest {
     private Persona julieta = new Persona(42);
    
    @Test
    public void creacionPersonaGenerica(){        
        assertEquals(Persona.class, julieta.getClass());
    }

    @Test
    public void creacionPersonaGenericaDe42Anios(){        
        assertEquals(42, julieta.getEdad());
    }

    @Test
    public void potenciaDeJulieta(){
        assertEquals(20, julieta.potencia());
    }

    @Test
    public void inteligenciaDeJulieta(){
        assertEquals(8, julieta.inteligencia());
    }

    @Test
    public void esDestacadaJulieta(){
        assertFalse(julieta.esDestacada());
    }  

    @Test
    public void ofreceTributoJulieta(){
        Planeta planeta = new Planeta(List.of(julieta));
        julieta.ofrecerTributo(planeta);
        //assertEquals(0, planeta.getcantMuseos());
        assertEquals(0, planeta.getLongitudMuralla());
    }

    @Test
    public void valorDeJulieta(){
        var valor = julieta.potencia() + julieta.inteligencia();
        assertEquals(valor, julieta.valor());
    }
    
}
