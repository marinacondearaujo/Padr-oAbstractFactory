package padroescriacao_exercicios.abstractfactory;

public class Pessoa {

    private Cadastro cadastro;

    public Pessoa (FabricaAbstrata fabrica) {
        this.cadastro = fabrica.createCadastro();
    }

    public String emitirCadastro() {
        return this.cadastro.emitir();
    }

}