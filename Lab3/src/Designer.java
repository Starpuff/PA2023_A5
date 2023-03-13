import java.util.Date;

public class Designer extends Person{
    private String areaPreference;
    public Designer(String name, Date birthDate, String areaPreference) {
        super(name, birthDate);
        this.areaPreference = areaPreference;
    }
}
