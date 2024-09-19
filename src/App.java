public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String cadena = "Hola mundo";
        int edad = 10;
    
        System.out.println(cadena);
        System.out.print("Tamano de la cadena ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[1]);

         for (int i = 0; i < cadena.length(); i++) {
            if (i == cadena.length()-1){
                System.out.println(cadena.charAt(i));
            }else{
                System.out.print(cadena.charAt(i) + "-");        
            }
            }

        //Contar palabras
        int palabras =cadena.split(" ").length;   
        System.out.println(palabras);    
        
        //Contar cuantas a hay en la cadena
        char letra = 'a';
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == letra){
                contador++;
            }
        }  
        System.out.println("Existen " + contador + " letras a en la palabra");
    }}