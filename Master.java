package HomeWork7;

import java.util.Random;

public class Master implements Observer {
    private static Random random = new Random();
    private String name;
    private double minSalary;
    private VacancyType preferredVacancyType;

    public Master(String name, VacancyType preferredVacancyType) {
        this.name = name;
        this.preferredVacancyType = preferredVacancyType;
        minSalary = random.nextDouble(80000, 100000);
    }

    public VacancyType getPreferredVacancyType() {
        return preferredVacancyType;
    }

    public void setPreferredVacancyType(VacancyType preferredVacancyType) {
        this.preferredVacancyType = preferredVacancyType;
    }

    @Override
    public void receiveOffer(VacancyType vacancy) {
        if (preferredVacancyType == vacancy.getVacancyType() && minSalary <= vacancy.getSalary()) {
            System.out.printf("Мастер %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
            minSalary = vacancy.getSalary();
        } else {
            System.out.printf("Мастер %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
        }
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveOffer'");
    }
}
