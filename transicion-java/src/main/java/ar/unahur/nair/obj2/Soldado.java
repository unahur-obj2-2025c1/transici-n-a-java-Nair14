package ar.unahur.nair.obj2;

import java.util.List;

public class Soldado extends Persona {
    private List<Arma> armas;
    
    public Soldado(Integer edad) {
        super(edad);
    }

    public Soldado(Integer edad, List<Arma> armas) {
        super(edad);
        this.armas = armas;
    }

    public Integer potencia(){
        return super.potencia() + armas.stream().mapToInt(arma -> arma.potencia(this)).sum();
    }

    /* 
    public Integer potencia2(){
        var potenciaArmas = 0;
        for (Arma a : armas) {
            potenciaArmas += a.potencia(this);
        }
        return super.potencia() + potenciaArmas;
    }
    */

    public void ofrecerTributo(Planeta p){
        p.construirMuralla(5);
    }

}
