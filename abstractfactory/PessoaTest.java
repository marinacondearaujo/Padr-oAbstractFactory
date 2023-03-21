package padroescriacao_exercicio.abstractfactory;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.abstractfactory.FabricaAbstrata;
import padroescriacao_exercicios.abstractfactory.FabricaUsuario;
import padroescriacao_exercicios.abstractfactory.FabricaAdministrador;
import padroescriacao_exercicios.abstractfactory.Pessoa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    void deveEmitirCadastroUsuario(){
        FabricaAbstrata fabrica = new FabricaUsuario();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Cadastro usuário", pessoa.emitirCadastro());
    }

    @Test
    void deveEmitirCadastroAdministrador(){
        FabricaAbstrata fabrica = new FabricaAdministrador();
        Pessoa pessoa = new Pessoa(fabrica);
        assertEquals("Cadastro administrador", pessoa.emitirCadastro());
    }


}
