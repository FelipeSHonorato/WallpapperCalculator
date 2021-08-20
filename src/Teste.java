import java.util.Scanner;

/**
 *  Programa de código aberto para cálculo de quantidade de papel de parede a ser utilizada em uma parede
 *
 * @version 1.1
 * @author Felipe Silva Honorato
 *
 */

public class Teste{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Informacoes info= new Informacoes();
        Calculos calculos = new Calculos();

        System.out.println("Insira o valor da altura da parede em METROS");
        double alturaParede = scanner.nextDouble();
        info.setAlturaParede(alturaParede);

        System.out.println("Insira o valor da largura da parede em METROS");
        double larguraParede = scanner.nextDouble();
        info.setLarguraParede(larguraParede);

        System.out.println("Insira a largura do rolo de papel de parede em METROS");
        double larguraPapel = scanner.nextDouble();
        info.setLarguraPapel(larguraPapel);

        System.out.println("Insira a comprimento do rolo de papel de parede em METROS");
        double comprimentoPapel = scanner.nextDouble();
        info.setComprimentoPapel(comprimentoPapel);

        calculos.metrosQuadradosPapel(info.larguraPapel, info.comprimentoPapel);

        calculos.metrosQuadradosParede(info.larguraParede, info.alturaParede);

        calculos.qtdRolosNecessarios();

    }
}
