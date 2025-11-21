public class SeleccionarConversion {
    public String getCodigo(int moneda) {
        return switch(moneda) {
            case 1 -> "USD";
            case 2 -> "VES";
            case 3 -> "ARS";
            case 4 -> "BRL";
            case 5 -> "COP";
            case 6 -> "CLP";
            default -> throw new IllegalArgumentException("Número de moneda inválido: " + moneda);
        };
    }
}
