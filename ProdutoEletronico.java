public class ProdutoEletronico extends Produto {

    private String marca;
    private int garantiaMeses;
    private String voltagem;

    public ProdutoEletronico(String nome, double preco, int codigo, String marca, int garantiaMeses, String voltagem) {
        super(nome, preco, codigo);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
        this.voltagem = voltagem;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getGarantiaMeses() { return garantiaMeses; }
    public void setGarantiaMeses(int garantiaMeses) { this.garantiaMeses = garantiaMeses; }

    public String getVoltagem() { return voltagem; }
    public void setVoltagem(String voltagem) { this.voltagem = voltagem; }

    @Override
    public void exibirProduto() {
        System.out.println("Produto Eletrônico: " + getNome() + " | Marca: " + marca + " | Garantia: " + garantiaMeses + " meses | Voltagem: " + voltagem + " | Preço: R$ " + getPreco());
    }
}
