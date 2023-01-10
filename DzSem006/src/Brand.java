public class Brand {
    public String brand;
    public String country;
    public String language;
    public Brand(String brand, String country, String language){
        this.brand = brand;
        this.country = country;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Brand - " + brand + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
