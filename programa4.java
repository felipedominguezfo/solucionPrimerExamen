public class programa4{
    public static void ContarRepe(char[] lista) {
        char[] caracteres = new char[lista.length];
        int[] char_rep = new int[lista.length];
        int num_char = 0;

        for (int i = 0; i < lista.length; i++) {
            char actual = lista[i];
            boolean encontrado = false;

            
            for (int j = 0; j < num_char; j++) {
                if (caracteres[j] == actual) {
                    char_rep[j]++;
                    encontrado = true;
                    break;
                }
            }

          
            if (!encontrado) {
                caracteres[num_char] = actual;
               char_rep[num_char] = 1;
                num_char++;
            }
        }

        
        for (int i = 0; i < num_char; i++) {
            System.out.println(caracteres[i] + ": " + char_rep[i]);
        }
    }

    public static void main(String[] args) {
        char[] lista = {'a','b','c','a','a','a','d','b','f','a','c','c',
                         'c','f','c','a','a','a','b','c'};
       ContarRepe(lista);
    }
}

