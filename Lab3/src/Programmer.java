import java.util.Date;

public class Programmer extends Person{
    private String mainProgrammingLanguage;
    public Programmer(String name, Date birthDate, String mainProgrammingLanguage) {
        super(name, birthDate);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }
    public String getMainProgrammingLanguage() {
        return mainProgrammingLanguage;
    }
    public void setMainProgrammingLanguage(String mainProgrammingLanguage) {
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }
}
