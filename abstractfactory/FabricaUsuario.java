package padroescriacao_exercicios.abstractfactory;

public class FabricaUsuario implements FabricaAbstrata{
    @Override
    public Cadastro createCadastro() {return new CadastroUsuario();
    }
}

