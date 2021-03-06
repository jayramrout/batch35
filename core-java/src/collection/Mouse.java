package collection;

public class Mouse {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    private String company;

    public Mouse(String company) {
        this.company = company;
    }

    public Mouse(String company, String color) {
        this.company = company;
        this.color = color;
    }


    @Override
    public String toString() {
        return "{"+this.company +" " + this.color+"}";
    }

    @Override
    public int hashCode() {
        return this.company.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return this.company.equals(((Mouse)obj).company);
    }
}
