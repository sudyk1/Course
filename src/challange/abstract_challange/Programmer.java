package challange.abstract_challange;

public class Programmer extends Employee {

    private String languages;

    public Programmer() {
        this.languages = "unknown";
    }

    public Programmer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", languages='" + languages + '\'' +
                '}';
    }
}
