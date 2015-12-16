/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktinistrys;

/**
 *
 * @author ASUS
 */
public class Kreditai {

    double paskolosSuma;
    double sutartiesSudarymoMokestisAtsakymas;
    double atsakymas1 = 0;
    double atsakymas2 = 0;

    double paskolosSuma2;
    double laikotarpis;
    double bendrosGrazintinosSumosApskaiciavimasAtsakymas;

    double kreditoMenesineImokaApskaiciavimas;

    double realiosMenesinesPajamos;
    double seimosPajamosAtskaiciusMokescius;
    double seimosFinansiniaiIsipareigojimai;
    double vaikuSkaiciusSeimoje;
    
  public boolean ivestu_duomenu_patikra_bustas() {
        return vaikuSkaiciusSeimoje > 0 && vaikuSkaiciusSeimoje < 10 && seimosPajamosAtskaiciusMokescius > 0 
        && seimosPajamosAtskaiciusMokescius < 10000 && seimosFinansiniaiIsipareigojimai > 0 
        && seimosFinansiniaiIsipareigojimai < 5000 && paskolosSuma2 > 300 && paskolosSuma2 < 26000 && laikotarpis <= 5;
    }
 
    public boolean ivestu_duomenu_patikra_vartojimas() {
       return vaikuSkaiciusSeimoje > 0 && vaikuSkaiciusSeimoje < 10 && seimosPajamosAtskaiciusMokescius > 0
               && seimosPajamosAtskaiciusMokescius < 30000 && seimosFinansiniaiIsipareigojimai > 0 
               && seimosFinansiniaiIsipareigojimai < 15000 && laikotarpis < 40;
    }
    public double getPaskolosSuma() {
        return paskolosSuma;
    }

    public double getSutartiesSudarymoMokestisAtsakymas() {
        return sutartiesSudarymoMokestisAtsakymas;
    }

    public double getAtsakymas1() {
        return atsakymas1;
    }

    public double getAtsakymas2() {
        return atsakymas2;
    }

    public double getPaskolosSuma2() {
        return paskolosSuma2;
    }

    public double getLaikotarpis() {
        return laikotarpis;
    }

    public double getBendrosGrazintinosSumosApskaiciavimasAtsakymas() {
        return bendrosGrazintinosSumosApskaiciavimasAtsakymas;
    }

    public double getKreditoMenesineImokaApskaiciavimas() {
        return kreditoMenesineImokaApskaiciavimas;
    }

    public double getRealiosMenesinesPajamos() {
        return realiosMenesinesPajamos;
    }

    public double getSeimosPajamosAtskaiciusMokescius() {
        return seimosPajamosAtskaiciusMokescius;
    }

    public double getSeimosFinansiniaiIsipareigojimai() {
        return seimosFinansiniaiIsipareigojimai;
    }

    public double getVaikuSkaiciusSeimoje() {
        return vaikuSkaiciusSeimoje;
    }

    public void setPaskolosSuma(double paskolosSuma) {
        this.paskolosSuma = paskolosSuma;
    }

    public void setSutartiesSudarymoMokestisAtsakymas(double sutartiesSudarymoMokestisAtsakymas) {
        this.sutartiesSudarymoMokestisAtsakymas = sutartiesSudarymoMokestisAtsakymas;
    }

    public void setAtsakymas1(double atsakymas1) {
        this.atsakymas1 = atsakymas1;
    }

    public void setAtsakymas2(double atsakymas2) {
        this.atsakymas2 = atsakymas2;
    }

    public void setPaskolosSuma2(double paskolosSuma2) {
        this.paskolosSuma2 = paskolosSuma2;
    }

    public void setLaikotarpis(double laikotarpis) {
        this.laikotarpis = laikotarpis;
    }

    public void setBendrosGrazintinosSumosApskaiciavimasAtsakymas(double bendrosGrazintinosSumosApskaiciavimasAtsakymas) {
        this.bendrosGrazintinosSumosApskaiciavimasAtsakymas = bendrosGrazintinosSumosApskaiciavimasAtsakymas;
    }

    public void setKreditoMenesineImokaApskaiciavimas(double kreditoMenesineImokaApskaiciavimas) {
        this.kreditoMenesineImokaApskaiciavimas = kreditoMenesineImokaApskaiciavimas;
    }

    public void setRealiosMenesinesPajamos(double realiosMenesinesPajamos) {
        this.realiosMenesinesPajamos = realiosMenesinesPajamos;
    }

    public void setSeimosPajamosAtskaiciusMokescius(double seimosPajamosAtskaiciusMokescius) {
        this.seimosPajamosAtskaiciusMokescius = seimosPajamosAtskaiciusMokescius;
    }

    public void setSeimosFinansiniaiIsipareigojimai(double seimosFinansiniaiIsipareigojimai) {
        this.seimosFinansiniaiIsipareigojimai = seimosFinansiniaiIsipareigojimai;
    }

    public void setVaikuSkaiciusSeimoje(double vaikuSkaiciusSeimoje) {
        this.vaikuSkaiciusSeimoje = vaikuSkaiciusSeimoje;
    }

}
