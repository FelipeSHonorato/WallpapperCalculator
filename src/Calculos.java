public class Calculos {

    double areaParede;
    double areaPapel;
    double qtdRolos;

    public void metrosQuadradosParede(double alturaParede, double larguraParede) {
        areaParede = alturaParede * larguraParede;
        System.out.println("Sua parede tem: " + areaParede);
    }

    public void metrosQuadradosPapel(double larguraPapel, double comprimentoPapel) {
        areaPapel = comprimentoPapel * larguraPapel;
        System.out.println("Seu rolo de papel de parede tem: " + areaPapel);
    }

    public void qtdRolosNecessarios() {
        qtdRolos = Math.round(areaParede / areaPapel);
        System.out.println("A quantidade de rolos necessário é de: " + (int) qtdRolos);

    }

}
