public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria){
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) throws Exception{
        if (dias <= 0) throw new Exception("Dias precisam ser positivos.");
        return this.valorDiaria * dias;
    }

    public double desconto(int dias) throws Exception {
        if(dias >= 7 && dias < 14){
            return calcularCusto(dias) * 0.9;
        } else if(dias >= 14){
            return calcularCusto(dias) * 0.85;
        }
        else{
            return calcularCusto(dias);
        }
    }
}
