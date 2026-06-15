public class ItemEstoque {

    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemEstoque(Produto produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

    public double getValorTotal() {
        return quantidade * precoUnitario;
    }

    public void exibirItemEstoque() {
        System.out.println("Qtd: " + quantidade + " | Preço unitário: R$ " + precoUnitario + " | Total: R$ " + getValorTotal());
    }
}
