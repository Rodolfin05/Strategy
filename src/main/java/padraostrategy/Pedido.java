package padraostrategy;

public class Pedido {

    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFreteSedex(float peso, float distancia) {
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadoraFrete.calcular(new FreteSedex());
    }

    public void calcularFreteTransportadora(float peso, float distancia) {
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadoraFrete.calcular(new FreteTransportadora());
    }

    public void calcularFreteRetirada(float peso, float distancia) {
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadoraFrete.calcular(new FreteRetirada());
    }

}
