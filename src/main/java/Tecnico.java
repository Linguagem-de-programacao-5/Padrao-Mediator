public class Tecnico implements Setor{

    private static Tecnico instancia = new Tecnico();

    private Tecnico(){};

    public static Tecnico getInstancia(){
        return instancia;
    }

    @Override
    public String receberLigacao() {
        return "recebida pelo setor tecnico!";
    }
}
