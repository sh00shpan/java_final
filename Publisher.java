package HomeWork7;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, double salary);

}
