package ar.unahur.nair.obj2;

public class Persona {

    private Integer edad;

    public Persona(Integer edad){
        this.edad = edad;
    }

    public Integer getEdad(){
        return edad;
    }

    public Integer inteligencia(){
        return edad >= 20 && edad <=40 ? 12 : 8; 
    } 

    public Integer potencia(){
        return 20;
    }
    
    public Boolean esDestacada(){
        return edad == 25 || edad == 35;
    }

    public void ofrecerTributo(Planeta p){

    }

    public Integer valor(){
        return potencia() + inteligencia();
    }
    
}
    

