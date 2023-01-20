package academy.devdojo.maratonajava.javacore.Ycollections.dominio;

public class Smartphone {

    private String serialNumber;
    private String marca;
    //Reflexivo: x.equals(x) tem que ser true para tudo q for diferente de null
    //Simetrico: para x e y diferentes null, se x.equals(y) == true, logo y.equals(x) == true
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //para x diferente de null, x.equals(null) tem que retornar false
    @Override
    public boolean equals(Object obj) {
        if(obj == null ) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber!= null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
