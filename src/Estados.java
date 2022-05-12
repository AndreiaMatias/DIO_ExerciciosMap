
import java.util.*;

public class Estados {

    /*Dada a população estimada de alguns estados do NE brasileiro, faça:

        Estado = PE - População = 9.616.621

        Estado = AL - População = 3.351.543

        Estado = CE - População = 9.187.103

        Estado = RN - População = 3.534.265

        Crie um dicionário e relacione os estados e suas populações;*/

    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};


        System.out.println(estados.toString());

        //Substitua a população do estado do RN por 3.534.165;

        estados.put("RN", 3534165);

        System.out.println(estados);

        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;

        System.out.println("PB no dicionário? " + estados.containsKey("PB"));

        estados.put("PB", 4039277);

        System.out.println(estados);

        //Exiba a população PE;
        System.out.println(estados.get("PE"));

        //Exiba todos os estados e suas populações na ordem que foi informado;

        Map<String, Integer> estadosOrdemInformada = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};


        System.out.println(estadosOrdemInformada.toString());

        //Exiba os estados e suas populações em ordem alfabética;

        Map<String, Integer> estadosOrdemAlfabetica = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};


        System.out.println(estadosOrdemAlfabetica.toString());

        //Exiba o estado com o menor população e sua quantidade;
        Integer menorPopulacao = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
            }
        }
        System.out.println("Estado com menor população " + estadoMenorPopulacao + ": " +menorPopulacao);

        //Exiba o estado com a maior população e sua quantidade;
        Integer maiorPopulacao = Collections.max(estados.values());
        String estadoMaiorPopulacao = "";
        for(Map.Entry<String, Integer> entry: entries){
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
            }
        }
        System.out.println("Estado com maior população " + estadoMaiorPopulacao + ": " +maiorPopulacao);
        Integer somaPopulacao = 0;
        //Exiba a soma da população desses estados;
        for(Map.Entry<String, Integer> entry: entries){
            somaPopulacao += entry.getValue();
        }

        System.out.println("Soma população: " + somaPopulacao);


        //Exiba a média da população deste dicionário de estados;
        Double mediaPopulacao = Double.valueOf(somaPopulacao/estados.size());
        System.out.println("Média: " + mediaPopulacao);

        //Remova os estados com a população menor que 4.000.000;
        Iterator<Integer> iterator = estados.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next()<4000000){
                iterator.remove();
            }
        }
        System.out.println(estados);

        //Apague o dicionário de estados;
        estados.clear();

        //Confira se o dicionário está vazio.
        System.out.println(estados);

    }

}
