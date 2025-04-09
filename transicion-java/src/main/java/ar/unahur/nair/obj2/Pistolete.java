package ar.unahur.nair.obj2;

public class Pistolete implements Arma {
    
    private Integer largo;

    public Integer potencia(Soldado soldado) {
        return soldado.getEdad() > 30 ? 3 * largo : 2 * largo;
    }

    public Pistolete(Integer largo){
        this.largo = largo;
    }

    
}
