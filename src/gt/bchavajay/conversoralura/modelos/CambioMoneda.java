package gt.bchavajay.conversoralura.modelos;

public record CambioMoneda(String base_code,
                           String target_code,
                           Double conversion_rate,
                           Double conversion_result) {
}
