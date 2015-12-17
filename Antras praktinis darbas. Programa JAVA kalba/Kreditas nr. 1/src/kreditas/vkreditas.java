package kreditas;

public class vkreditas extends KreditasMain {

    public vkreditas(double a, double k, double l, double is) {
        super(a, k, l, is);
    }

    public vkreditas() {
        super(0, 0, 0, 0);
    }

    public void kreditas() {

        double Vimk, Ksum; //papildomi kintamieji, taip pat palukanu norma

        if (this.getIs() < 15000) {
            if (this.getK() >= 300 && this.getK() <= 260000) {
                if (this.getL() <= 5) {
                    Ksum = kreditosuma(this.getK(), this.getL());
                    Vimk = imokosAp(Ksum, this.getL());
                    if (((Vimk / this.getA()) * 100) <= 40) {
                        System.out.println("Kreditu suteikti galima!" + " "
                                + "Viso grazinti reikes: " + Ksum + " "
                                + "Menesine imoka bus: " + Vimk);
                    } else {
                        System.out.println("Kredito suteikti negalime! ");
                    }
                } else {
                    System.out.println("Kredito suteikti negalime! Perilgas terminas!");
                }
            } else {
                System.out.println("Kredito suteikti negalime! Prasoma suma yra permaza arba per didele!");
            }
        } else {
            System.out.println("Kredito suteikti negalime! Jusu isiskolinimai per dideli");
        }

    }
}
