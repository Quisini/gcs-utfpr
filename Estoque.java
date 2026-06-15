import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private int id;
    private String localizacao;
    private List<ItemEstoque> itens;

    public Estoque(int id, String localizacao) {
        this.id = id;
        this.localizacao = localizacao;
        this.itens = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

    public List<ItemEstoque> getItens() { return itens; }

    public void adicionarItem(ItemEstoque item) {
        itens.add(item);
    }

    public void exibirEstoque() {
        System.out.println("Estoque #" + id + " | Localização: " + localizacao + " | Itens: " + itens.size());
    }
}
