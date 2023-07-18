package HomeWork7;

import java.util.Random;

public class Company {
    
    private static Random random = new Random();
    private String nameCompany;
    private Publisher jobAgency;

    public Company(String nameCompany, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType vacancyType, double maxSalary) {
        double salary = random.nextDouble(2500, maxSalary);
        jobAgency.sendVacancy(nameCompany, vacancyType, salary);
    }
}
