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

    public double calculoDevolucaoAtrasado(int diasAtrasado, double valorTotal){
        double totalComMulta = 0;
        if (diasAtrasado > 7 && diasAtrasado<=14){
            totalComMulta *= 1.25;
        }else if (diasAtrasado > 14 && diasAtrasado > 21){
            totalComMulta *= 1.50;
        }else{
            totalComMulta *= 2;
        }
        return totalComMulta;
    }
}