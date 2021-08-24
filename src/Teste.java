/**
 *
 *  Programa de código aberto para cálculo de quantidade de papel de parede a ser utilizada em uma parede
 *
 * @version 1.0
 * @author Felipe Silva Honorato
 *
 * Testando modificador 1 utilizando Intellij
 *
 */

public class Teste {
    public static void main(String[] args) {

        Informacoes info = new Informacoes();

        info.paredesInformacoes();
        info.papelInformacoes();

        System.out.println(info.getSomaMtQuadPapel());
        System.out.println(info.getSomaMtQuadParedes());

        info.infoCalculoFinal();

        System.out.println(info.getSomaMtQuadPapel());
        System.out.println(info.getSomaMtQuadParedes());
    }
}
