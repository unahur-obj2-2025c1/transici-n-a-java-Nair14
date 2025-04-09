package ar.unahur.nair.obj2;

public class Espadon implements Arma {

    private Integer peso;

    public Integer potencia(Soldado soldado) {
        return soldado.getEdad() < 40 ? peso / 2 : 6;
    }

    public Espadon(Integer peso){
        this.peso = peso;
    }

}
