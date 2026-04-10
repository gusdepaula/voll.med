package med.voll.api.testes.memoria;

public class TestaString {
    public static void main(String[] args) {
        String valor1 = "alura";
//        String valor2 = "alura";
//
//        System.out.println(valor1 == valor2);
//
//        String valor3 = new String("alura");
//        System.out.println(valor1 == valor3);

        valor1 = valor1 + "Programção";
        System.out.println(valor1);

        String resultado = "";
        for (int i = 0; i <=100; i++) {
            resultado = resultado + i + " ";
        }
        System.out.println(resultado);


    }
}
