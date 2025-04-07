import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCalcularCusto() throws Exception {
        Veiculo veiculo = new Veiculo("Corolla",15);
        assertEquals(60, veiculo.calcularCusto(4));
    }

    @Test
    public void testDesconto() throws Exception {
        Veiculo veiculo = new Veiculo("Corolla",20);
        assertEquals(126, veiculo.desconto(7));
    }

    @Test
    public void testValorComAtraso() throws Exception {
        Veiculo veiculo = new Veiculo("Corolla",18);
        assertEquals(0, veiculo.calculoDevolucaoAtrasado(8,10));
    }

    @Test(expected = Exception.class)
    public void testCalculosZero() throws Exception{
        Veiculo veiculo = new Veiculo("Corolla",20);
        veiculo.calcularCusto(0);
    }
    @Test(expected = Exception.class)
    public void testCalculosNegativo() throws Exception{
        Veiculo veiculo = new Veiculo("Corolla",30);
        veiculo.calcularCusto(-2);
    }
}