import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* QUESTAO 01
        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");

        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1, q2));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q2);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        //questão 1_2
        afd.definirTransicoes(q0, '0', q1);
        afd.definirTransicoes(q0, '1', q2);
        afd.definirTransicoes(q1, '0', q2);
        afd.definirTransicoes(q1, '1', q0);
        afd.definirTransicoes(q2, '0', q2);
        afd.definirTransicoes(q2, '1', q2);

        afd.verificarCadeia("01010010");

        /*

        QUESTAO-02

        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");





        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1, q2));

        Estado estadoInicial = q0;

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q2);

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        afd.definirTransicoes(q0,'1',q0);
        afd.definirTransicoes(q0,'0',q1);
        afd.definirTransicoes(q1,'1',q0);
        afd.definirTransicoes(q1,'0',q2);
        afd.definirTransicoes(q2,'1',q2);
        afd.definirTransicoes(q2,'0',q2);


        afd.verificarCadeia("01010100");
         */

/*
        QUESTAO-03

        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");


        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1, q2));

        Estado estadoInicial = q0;

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q1);

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        afd.definirTransicoes(q0, '0', q1);
        afd.definirTransicoes(q0, '1', q2);
        afd.definirTransicoes(q1, '1', q1);
        afd.definirTransicoes(q1, '0', q1);
        afd.definirTransicoes(q2, '1', q2);
        afd.definirTransicoes(q2, '0', q2);


        afd.verificarCadeia("1010100");

 */

        /* QUESTAO 04
        Estado q0 = new Estado("q0");

        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(null);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        //questão 3
        afd.definirTransicoes(q0, '0', q0);
        afd.definirTransicoes(q0, '1', q0);


        afd.verificarCadeia("11001010010");

*/

/*

 QUESTAO-05
        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");

        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q0);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        //questão 4
        afd.definirTransicoes(q0, '0', q1);
        afd.definirTransicoes(q0, '1', q1);
        afd.definirTransicoes(q1, '0', q1);
        afd.definirTransicoes(q1, '1', q1);


        afd.verificarCadeia("0");

 */
/* QUESTAO-06
        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");

        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q1);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        //questão 5
        afd.definirTransicoes(q0, '0', q1);
        afd.definirTransicoes(q0, '1', q1);
        afd.definirTransicoes(q1, '0', q1);
        afd.definirTransicoes(q1, '1', q1);


        afd.verificarCadeia("1");

 */
/* QUESTAO-07
        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");
        Estado q3 = new Estado("q3");

        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1, q2, q3));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q3);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        //questão 6
        afd.definirTransicoes(q0, '0', q1);
        afd.definirTransicoes(q0, '1', q0);
        afd.definirTransicoes(q1, '0', q0);
        afd.definirTransicoes(q1, '1', q2);
        afd.definirTransicoes(q2, '0', q3);
        afd.definirTransicoes(q2, '1', q0);
        afd.definirTransicoes(q3, '0', q3);
        afd.definirTransicoes(q3, '1', q3);


        afd.verificarCadeia("101011000");


 */
        /*
        QUESTAO-08

        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");
        Estado q3 = new Estado("q3");
        Estado q4 = new Estado("q4");

        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1, q2, q3, q4));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q3);
        estadosFinais.add(q1);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        //questão 7
        afd.definirTransicoes(q0, '0', q3);
        afd.definirTransicoes(q0, '1', q1);
        afd.definirTransicoes(q1, '0', q2);
        afd.definirTransicoes(q1, '1', q1);
        afd.definirTransicoes(q2, '0', q2);
        afd.definirTransicoes(q2, '1', q1);
        afd.definirTransicoes(q3, '0', q3);
        afd.definirTransicoes(q3, '1', q4);
        afd.definirTransicoes(q4, '0', q4);
        afd.definirTransicoes(q4, '1', q3);


        afd.verificarCadeia("0101");
         */
/*

QUESTAO-09
        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");

        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1, q2));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q1);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        //questão 8
        afd.definirTransicoes(q0, '0', q0);
        afd.definirTransicoes(q0, '1', q1);
        afd.definirTransicoes(q1, '0', q1);
        afd.definirTransicoes(q1, '1', q2);
        afd.definirTransicoes(q2, '0', q2);
        afd.definirTransicoes(q2, '1', q1);


        afd.verificarCadeia("111");

 */
/*

QUESTAO-10

        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");


        Set<Estado> estados = new HashSet<>();
        estados.addAll(Arrays.asList(q0, q1));

        Set<Estado> estadosFinais = new HashSet<>();
        estadosFinais.add(q1);

        Estado estadoInicial = q0;

        Set<Character> alfabeto = new HashSet<>();
        alfabeto.addAll(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        afd.definirTransicoes(q0, '0', q1);
        afd.definirTransicoes(q0, '1', q0);
        afd.definirTransicoes(q1, '0', q1);
        afd.definirTransicoes(q1, '1', q1);

        afd.verificarCadeia("00101");



 */

         Set<Estado> estados;
         Set<Character> alfabeto;
         Estado estadoInicial;
         Set<Estado> estadosFinal;
         Map<Estado, Map<Character, Estado>> funcaoDeTransicao;

        Estado q0 = new Estado("q0");

        /*
        perae pai...
         */

    }


}
