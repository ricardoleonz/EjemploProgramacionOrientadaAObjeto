package entidades;

public enum Mensajes {

    MENSAJE_PETICION_HORAS("Ingresa las horas trabajadas"),
    MENSAJE_PETICION_VALOR_HORAS("Ingrese el valor de las horas trabajadas"),
    MENSAJE_RESPUESTA("El sueldo a pagar es: $");


    private String message;

    Mensajes(String s) {
        this.message = s;
    }

    public String getMensajes() {
        return message;
    }
}
