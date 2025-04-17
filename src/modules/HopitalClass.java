package modules;

public class HopitalClass {
    private String date;
    private int cardio;
    private int radio;
    private int visit;

    public HopitalClass(String date, int cardio, int radio, int visit) {
        this.date = date;
        this.cardio = cardio;
        this.radio = radio;
        this.visit = visit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCardio() {
        return cardio;
    }

    public void setCardio(int cardio) {
        this.cardio = cardio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getVisit() {
        return visit;
    }

    public void setVisit(int visit) {
        this.visit = visit;
    }

    public String toString() {
        return  "The " + date + "\n" + 
                " - " + cardio + " visitors in cardiology\n" +
                " - " + radio + " visitors in radiology\n" +
                " - " + visit + " persons are visited familly\n\n";
    }

    public String toCSV() {
        return date + "," + cardio + "," + radio + "," + visit + "\n";
    }

}
