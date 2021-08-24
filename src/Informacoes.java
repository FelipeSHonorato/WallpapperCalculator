import java.util.Scanner;

public class Informacoes {
    Scanner scanner = new Scanner(System.in);

    private double somaMtQuadParedes;
    private double somaMtQuadPapel;

    public void paredesInformacoes() {
        Calculos calculos = new Calculos();

        System.out.println("Em quantas paredes você irá aplicar o papel de parede?");
        int qtdParedes = scanner.nextInt();

        double[] qtdMetros = new double[qtdParedes];

        double somaParcial = 0;

        for (int i = 0; i < qtdMetros.length; i++) {
            System.out.println("Insira o valor da altura da parede " + (i + 1) + " em METROS");
            double alturaParede = scanner.nextDouble();

            System.out.println("Insira o valor da largura da parede " + (i + 1) + " em METROS");
            double larguraParede = scanner.nextDouble();

            somaParcial += calculos.calcularMtQuadParede(alturaParede, larguraParede);

        }
        somaMtQuadParedes += somaParcial;
    }

    public void papelInformacoes() {
        Calculos calculos = new Calculos();

        System.out.println("Insira a largura do rolo de papel de parede em METROS");
        double larguraPapel = scanner.nextDouble();

        System.out.println("Insira a comprimento do rolo de papel de parede em METROS");
        double comprimentoPapel = scanner.nextDouble();

        somaMtQuadPapel = calculos.calcularMtQuadPapel(larguraPapel, comprimentoPapel);
    }

    public double getSomaMtQuadParedes() {
        return somaMtQuadParedes;
    }

    public double getSomaMtQuadPapel() {
        return somaMtQuadPapel;
    }

    public void infoCalculoFinal() {
        Calculos calculo = new Calculos();
        calculo.calcularQtdRolosNecessarios(somaMtQuadParedes, somaMtQuadPapel);
    }

}

