package ar.unahur.nair.obj2;

public class Docente extends Persona {
    private Integer cursosDados = 0;

    public Docente(Integer edad) {
        super(edad);
    }

    public Docente(Integer edad, Integer cursosDados) {
        super(edad);
        this.cursosDados = cursosDados;
    }

    public Integer getCursosDados() {
        return cursosDados;
    }

    @Override
    public Integer inteligencia(){
        return super.inteligencia() + cursosDados * 2;
    }

    @Override
    public Boolean esDestacada(){
        return cursosDados > 3;
    }

    @Override
    public void ofrecerTributo(Planeta p){
        p.fundarMuseo();
    }

    @Override
    public Integer valor(){
        return super.valor() + 5;
    }
    
}
