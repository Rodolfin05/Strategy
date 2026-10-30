package padraostrategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteTransportadora() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteTransportadora(10.0f, 100.0f);
        assertEquals(30.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteSedex() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteSedex(10.0f, 100.0f);
        assertEquals(60.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteRetirada() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteRetirada(10.0f, 100.0f);
        assertEquals(0.0f, pedido.getValorFrete());
    }

}
