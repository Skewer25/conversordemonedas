public class ModificarSalida {
    private String monedaBase;
    private String monedaObjetivo;
    private double tasaDeConversion;
    private double resultadoDeConversion;

    public ModificarSalida(Conversion salidaDeConversion){
        monedaBase = salidaDeConversion.base_code();
        monedaObjetivo = salidaDeConversion.target_code();
        tasaDeConversion = Double.parseDouble(salidaDeConversion.conversion_rate());
        resultadoDeConversion = Double.parseDouble(salidaDeConversion.conversion_result());
    }

    @Override
    public String toString() {
        return "Moneda base = "+monedaBase+
                "\nMonedaObjetivo = "+monedaObjetivo+
                "\nTasa de conversion = "+tasaDeConversion+
                "\nResultado de conversion = "+resultadoDeConversion;
    }
}
