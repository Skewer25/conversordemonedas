import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        String confirmacion = "n";
        while (confirmacion.equalsIgnoreCase("n")) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("""
                    ******************************************************
                    Bienvenido/a al conversor de monedas :D
                    
                    1) Dolar
                    2) Bolivar Soberano
                    3) Peso Argentino
                    4) Real Brasileño
                    5) Peso Colombiano
                    6) Peso Chileno
                    Escriba los numeros de las monedas que desea utilizar para la conversion!
                    ******************************************************
                    """);
            try {
                ConsultaConversion consulta = new ConsultaConversion();
                SeleccionarConversion conversor = new SeleccionarConversion();

                System.out.println("Desde que moneda desea realizar la conversion?: ");
                var monedaBase = conversor.getCodigo(Integer.parseInt(teclado.nextLine()));

                System.out.println("Indique a que moneda desea convertir: ");
                var monedaObjetivo = conversor.getCodigo(Integer.parseInt(teclado.nextLine()));

                System.out.println("Que cantidad desea convertir?");
                var cantidadAConvertir = Double.parseDouble(teclado.nextLine());

                Conversion conversion = consulta.realizarConversion(monedaBase, monedaObjetivo, cantidadAConvertir);
                ModificarSalida salida = new ModificarSalida(conversion);
                System.out.println(salida);
            }catch (NumberFormatException e) {
                System.out.println("Formato incorrecto, ingrese un numero.");
            }catch (IllegalArgumentException e){
                System.out.println("Opcion invalida, por favor ingrese una opcion valida");
            }
            System.out.println("Desea salir? s/n");
            confirmacion = teclado.nextLine();
        }
    }
}
