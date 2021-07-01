public class App {

    private String name;
    private int identification;
    private double estatura;
    private float peso;
    private char sexo;
    private boolean estadoVacunado;

    public static void main2(String[] args) {
        System.out.println("Hello, World!");
        // operadores aritmeticos
        int resultado = 45 + 12;
        resultado = 45 - 22;
        resultado = 45 * 12;
        resultado = 45 / 12;
        resultado = 45 % 12;
        boolean respuesta = true;
        //operadores unarios
        resultado ++;
        //algebra booleana
        respuesta = 5 < 8;
        respuesta = 5 > 8 ;
        respuesta = 5 >= 8;
        respuesta = 5 <= 8;
        respuesta = 5 == 8;
        respuesta = 5 != 8;
        //operadores lógicos
        respuesta = 5 < 8 && 4 >= 6; // y
        respuesta = 5 < 8 || 4 >= 6; // ó  
        //operadores lógicos
        // &
        // |
        // ^
        // estructuras de control
        if (5!=10){
            //bloque código
        }
        if (respuesta){

        }else if (!respuesta){
            //bloque código
        } else {
            //bloque código
        }

        int llave = 2;
        switch (llave){
            case 1:
            //bloque código
            case 2 :
            //bloque código
                break;
            default:
                break;
        }
        //---ciclos, repetitivas, bucles ----ciclos
        while (llave > 5){
            //bloque código
        }
        do{
            //bloque código
        }
        for (String string : args){ //lista

        }
        //declaración de una variable ; condición ; incremento
        for (int i=0; i< args.length; i++){
            //bloque código
        }
    }
}
