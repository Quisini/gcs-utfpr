import java.time.LocalDate;

public class EntradaEstoque {

    private int id;
    private LocalDate data;
    private Fornecedor fornecedor;
    private ItemEstoque itemEstoque;
    private String observacao;

    public EntradaEstoque(int id, LocalDate data, Fornecedor fornecedor, ItemEstoque itemEstoque, String observacao) {
        this.id = id;
        this.data = data;
        this.fornecedor = fornecedor;
        this.itemEstoque = itemEstoque;
        this.observacao = observacao;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public Fornecedor getFornecedor() { return fornecedor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }

    public ItemEstoque getItemEstoque() { return itemEstoque; }
    public void setItemEstoque(ItemEstoque itemEstoque) { this.itemEstoque = itemEstoque; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public void exibirEntrada() {
        System.out.println("Entrada #" + id + " | Data: " + data + " | Fornecedor: " + fornecedor.getNome() + " | Obs: " + observacao);
    }
}
