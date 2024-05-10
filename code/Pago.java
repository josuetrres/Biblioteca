import java.util.Date;

public class Pago implements Cotizacion{
    private float costo;
    private boolean estado;
    private Date plazoMaximo;

    @Override
    public float calcularCosto() {
        return 0;
    }
}
