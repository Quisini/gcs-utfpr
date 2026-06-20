public class Endereco {

    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    public void exibirEndereco() {
        System.out.println(rua + ", " + numero + " - " + cidade + "/" + estado);
    }
}