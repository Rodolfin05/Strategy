package padraostrategy;

public class CalculadoraFrete {

    private float peso;
    private float distancia;

    public CalculadoraFrete(float peso, float distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public float calcular(Frete frete) {
        return frete.calcular(peso, distancia);
    }
}
