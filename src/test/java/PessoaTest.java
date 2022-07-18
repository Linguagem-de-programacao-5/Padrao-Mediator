import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PessoaTest {

    @Test
    void deveTrasnferirComercial(){
        Pessoa pessoa = new Pessoa("Jose");
        assertEquals("Sua chamada foi transferida e recebida pelo setor comercial!", pessoa.falarComSetor(Comercial.getInstancia()));
    }

    @Test
    void deveTrasnferirFinanceira(){
        Pessoa pessoa = new Pessoa("Jose");
        assertEquals("Sua chamada foi transferida e recebida pelo setor financeiro!", pessoa.falarComSetor(Financeiro.getInstancia()));
    }

    @Test
    void deveTrasnferirTecnico(){
        Pessoa pessoa = new Pessoa("Jose");
        assertEquals("Sua chamada foi transferida e recebida pelo setor tecnico!", pessoa.falarComSetor(Tecnico.getInstancia()));
    }
}