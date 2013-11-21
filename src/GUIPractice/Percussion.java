package GUIPractice;

public class Percussion {
    private String type;
    private String brand;
    private int id;

    public Percussion(String type, String brand, int id) {
        this.type = type;
        this.brand = brand;
        this.id = id;
    }

    @Override
    public String toString() {
        return brand + " " + type;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Percussion other = (Percussion) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
