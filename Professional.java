package HomeWork7;

public class Professional implements Observer {
    private String name;
    private double minSalary;

    public Professional(String name) {
        this.name = name;
        minSalary = 100000; // минимальная зарплата для профессионала
    }

    @Override
    public void receiveOffer(VacancyType vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("Профессионал %s (%f) >>> Мне нужна эта работа! (%s - %f)\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
            minSalary = vacancy.getSalary();
        } else {
            System.out.printf("Профессионал %s (%f) >>> Я найду работу получше! (%s - %f)\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
        }
    }

    @Override
    public void receiveOffer(String nameCompany, double salary) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receiveOffer'");
    }
}