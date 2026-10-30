package padraostrategy;

public class FreteTransportadora implements Frete {

    public float calcular(float peso, float distancia) {
        return (peso * 0.5f) + (distancia * 0.25f);
    }
}
