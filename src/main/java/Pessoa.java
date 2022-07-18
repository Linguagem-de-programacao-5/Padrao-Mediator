public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String falarComSetor(Setor setor){
        return CentralAtendimento.getInstancia().transferirChamada(setor);
    }

}
