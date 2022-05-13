import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LancamentoDados {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> numero = new HashMap<>();
        Map<Integer, Integer> quantidadeLancamentos = new HashMap<>();

        for(Integer i = 1; i <= 100; i++) {
            numero.put(i, random.nextInt(6)+1);
        }

        for(Integer j = 1; j<=numero.size(); j++){
            for(Integer z = 1; z <= 6; z++){
                if(numero.get(j) == z && quantidadeLancamentos.containsKey(z) == false){
                    quantidadeLancamentos.put(z, 1);
                } else if (numero.get(j) == z && quantidadeLancamentos.containsKey(z) == true){
                    quantidadeLancamentos.put(z, quantidadeLancamentos.get(z) +1);
                }
            }

        }
        System.out.println(numero.toString());
        System.out.println(quantidadeLancamentos.toString());
    }
}
