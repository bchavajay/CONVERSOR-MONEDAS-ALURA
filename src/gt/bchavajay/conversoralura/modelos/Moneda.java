package gt.bchavajay.conversoralura.modelos;

public class Moneda {
    String monedaBase;
    String monedaCambio;
    Double tipoDeCambio;
    Double cambioResultante;

    public Moneda(CambioMoneda cambioMoneda) {
        this.monedaBase = cambioMoneda.base_code();
        this.monedaCambio = cambioMoneda.target_code();
        this.tipoDeCambio = cambioMoneda.conversion_rate();
        this.cambioResultante = cambioMoneda.conversion_result();
    }

    @Override
    public String toString() {
        return "monedaBase='" + monedaBase + '\'' +
                ", monedaCambio='" + monedaCambio + '\'' +
                ", tipoDeCambio=" + tipoDeCambio +
                ", cambioResultado=" + cambioResultante;
    }
}
