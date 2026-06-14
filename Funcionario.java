public class Funcionario extends Pessoa {

    private String matricula;
    private double salario;

    public void baterPonto() {
        System.out.println("Ponto registrado!");
    }

    @Override
    public void exibirDados() {
        System.out.println("Funcionário");
    }
}