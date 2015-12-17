package kreditas;

import java.util.Scanner;

public class ivedimas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        vkreditas VartClass = new vkreditas();
        bkreditas BustClass = new bkreditas();
        double Pajamos, PajamosB, skolos, Ksuma; // ivedimo
        int variantas, Svaiku, pam, laik;// ivedimo

        int sumavaik = 100;
        System.out.println(" ");
        System.out.println("Pasirinkite kredita: "
                + "Busto Kreditas - 1" + " "
                + "Vartojamasis Kreditas - 2");
        variantas = scan.nextInt();

        if (variantas <= 2) {
            if (variantas == 2) {
                System.out.println("iveskite vaiku skaiciu nuo 0 iki 10 :");
                Svaiku = scan.nextInt();
                System.out.println("iveskite pajamas atskaiciavus mokescius:");
                Pajamos = scan.nextDouble();
                System.out.println("iveskite isiskolinimu skaiciu:");
                skolos = scan.nextDouble();
                System.out.println("iveskite kredito laikotarpi iki 5 metu:");
                laik = scan.nextInt();
                System.out.println("iveskite kredito suma nuo 300 Eu iki 26000 Eu: ");
                Ksuma = scan.nextDouble();
                PajamosB = Pajamos - skolos - (Svaiku * sumavaik);
                VartClass.setDuom(PajamosB, Ksuma, laik, laik);
                VartClass.kreditas();
            } else {
                System.out.println("iveskite vaiku skaiciu nuo 0 iki 10 :");
                Svaiku = scan.nextInt();
                System.out.println("iveskite pajamas atskai�iavus mokes�ius:");
                Pajamos = scan.nextDouble();
                System.out.println("iveskite isiskolinimu skaiciu: ");
                skolos = scan.nextDouble();
                System.out.println("iveskite pastato amziu: ");
                pam = scan.nextInt();
                System.out.println("iveskite kredito laikotarpi: ");
                laik = scan.nextInt();
                System.out.println("iveskite kredito suma: ");
                Ksuma = scan.nextDouble();
                PajamosB = Pajamos - skolos - (Svaiku * sumavaik);
                BustClass.setDuom(PajamosB, Ksuma, laik, skolos, pam);
                BustClass.kreditas();
            }
        } else {
            System.out.println("Neteisingas parinktas parametras!");
        }

    }
}
