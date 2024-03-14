public class inverte {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String strInvertida = inverterString(str);
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
