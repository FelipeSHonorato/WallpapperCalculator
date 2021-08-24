public class Calculos {

    public double calcularMtQuadParede(double alturaParede, double larguraParede) {
         return alturaParede * larguraParede;
    }

    public double calcularMtQuadPapel(double larguraPapel, double comprimentoPapel) {
         return larguraPapel * comprimentoPapel;
    }

    public void calcularQtdRolosNecessarios(double somaMtQuadParedes, double somMtQuadPapel) {
        double qtdRolos = Math.ceil(somaMtQuadParedes / somMtQuadPapel);
        System.out.println("A quantidade de rolos necessário é de: " + (int) qtdRolos);

    }

}
