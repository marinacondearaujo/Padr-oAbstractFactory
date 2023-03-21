package padroescriacao_exercicios.abstractfactory;

public class FabricaAdministrador implements FabricaAbstrata{
    @Override
    public Cadastro createCadastro() {return new CadastroAdministrador();
    }
}
