package HomeWork7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(VacancyType vacancy) {
        for (Observer observer : observers) {
            if (observer instanceof Student) {
                Student student = (Student) observer;
                if (student.getPreferredVacancyType() == vacancy.getVacancyType()) {
                    student.receiveOffer(vacancy);
                }
            } else if (observer instanceof Master) {
                Master master = (Master) observer;
                if (master.getPreferredVacancyType() == vacancy.getVacancyType()) {
                    master.receiveOffer(vacancy);
                }
            } else if (observer instanceof Professional) {
                Professional professional = (Professional) observer;
                professional.receiveOffer(vacancy);
            }
        }
    }
        public void sendVacancy(String companyName, VacancyType vacancyType, double salary) {
        VacancyType vacancy = new VacancyType(companyName, vacancyType, salary);
        sendOffer(vacancy);
    }

        @Override
        public void sendOffer(String nameCompany, double salary) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'sendOffer'");
        }
}