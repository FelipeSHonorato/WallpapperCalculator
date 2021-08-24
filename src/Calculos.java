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

    public void calcularQtdCola(double somaMtQuadParedes){
        double qtdCola = Math.ceil(somaMtQuadParedes / 0.3);
        System.out.println("Você irá precisar de " + (int)qtdCola + " gramas de cola para papel de parede.");
    }

}
