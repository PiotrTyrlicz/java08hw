public class Something {
    private String nazwa;
    private int dlugosc;
    private double waga;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getNazwa() {
        return nazwa;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }
    public int getDlugosc() {
        return dlugosc;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }
    public double getWaga() {
        return waga;
    }

    public Something(String nazwa, int dlugosc, double waga){
        this.nazwa=nazwa;
        this.dlugosc=dlugosc;
        this.waga=waga;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Something))
            return false;

        Something other = (Something) obj;
        if (nazwa == null) {
            if (other.nazwa != null)
                return false;
        } else if (!nazwa.equals(other.nazwa))
            return false;
        if (dlugosc != other.dlugosc)
            return false;
        if (waga != other.waga)
            return false;
        return true;
    }


}
