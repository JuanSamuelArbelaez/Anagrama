public class Anagrama {
    public static void createAnagrams(String word, String aux){
        if (word.length() == 0) { //Verifica la el caso base, donde no hay mas letras a añadir;
            System.out.println(aux); //Imprime el resultado
        } else {
            for (int i = 0; i < word.length(); i++) { //Recorre las letras en el argumento word
                //Elimina la letra en la posicion i. En el primer llamado, "mora", pasa a ser "ora"
                String newWord=word.substring(0, i) + word.substring(i + 1);

                //Compienza a concatenar el camino. En el primer llamado, se toma "m"
                String letter = aux+word.charAt(i);

                //Llamado recursivo
                createAnagrams(newWord,letter);
            }
        }
    }
}
