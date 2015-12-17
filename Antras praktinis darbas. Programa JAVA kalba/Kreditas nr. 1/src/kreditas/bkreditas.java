package kreditas;

public class bkreditas extends KreditasMain {

    private double pa;

    public bkreditas(double a, double k, double l, double is, double pa) {
        super(a, k, l, is);
        this.pa = pa;
    }

    public bkreditas() {
        super(0, 0, 0, 0);
        this.pa = 0;
    }

    public void kreditas() {

        double Vimk, Ksum; //papildomi kintamieji

        if (this.getIs() < 5000) {
            if (pa <= 50) {
                Ksum = this.kreditosuma(this.getK(), this.getL());
                Vimk = imokosAp(Ksum, this.getL());
                if (this.suteikiamoKreditoPatikra(Vimk)) {
                    System.out.println("Kredita suteikti galima!" + " "
                            + "Viso grazinti reikes: " + Ksum + " "
                            + "Menesinio imoka bus: " + Vimk);
                } else {
                    System.out.println("Kredito suteikti negalime! ");
                }
            } else {
                System.out.println("Kredito suteikti negalime! Pastatas Persenas!");
            }
        } else {
            System.out.println("Kredito suteikti negalime! Jusu isiskolinimai per dideli");
        }

    }

   

}
