package HomeWork7;

public class VacancyType {
    public static final VacancyType TESTER = null;
    public static final VacancyType DEVELOPER = null;
    private String companyName;
    private VacancyType vacancyType;
    private double salary;

    public VacancyType(String companyName, VacancyType vacancyType, double salary) {
        this.companyName = companyName;
        this.vacancyType = vacancyType;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public double getSalary() {
        return salary;
    }
}