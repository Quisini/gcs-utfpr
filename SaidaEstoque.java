import java.time.LocalDate;

public class SaidaEstoque {

    private int id;
    private LocalDate data;
    private ItemEstoque itemEstoque;
    private String motivo;

    public SaidaEstoque(int id, LocalDate data, ItemEstoque itemEstoque, String motivo) {
        this.id = id;
        this.data = data;
        this.itemEstoque = itemEstoque;
        this.motivo = motivo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public ItemEstoque getItemEstoque() { return itemEstoque; }
    public void setItemEstoque(ItemEstoque itemEstoque) { this.itemEstoque = itemEstoque; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public void exibirSaida() {
        System.out.println("Saída #" + id + " | Data: " + data + " | Motivo: " + motivo);
    }
}
