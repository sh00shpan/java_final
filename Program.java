package HomeWork7;

public class Program {

public static void main(String[] args) {
    JobAgency jobAgency = new JobAgency();

    Master master1 = new Master("Мастер 1", VacancyType.DEVELOPER);
    Master master2 = new Master("Мастер 2", VacancyType.TESTER);
    Student student1 = new Student("Студент 1", VacancyType.DEVELOPER);
    Student student2 = new Student("Студент 2", VacancyType.TESTER);
    Professional professional1 = new Professional("Профессионал 1");

    jobAgency.registerObserver(master1);
    jobAgency.registerObserver(master2);
    jobAgency.registerObserver(student1);
    jobAgency.registerObserver(student2);
    jobAgency.registerObserver(professional1);

    Company company1 = new Company("Компания 1", jobAgency);
    Company company2 = new Company("Компания 2", jobAgency);

    company1.needEmployee(VacancyType.DEVELOPER, 80000);
    company2.needEmployee(VacancyType.TESTER, 90000);
    company1.needEmployee(VacancyType.TESTER, 100000);

    Professional professional2 = new Professional("Профессионал 2");
    jobAgency.registerObserver(professional2);
    company2.needEmployee(VacancyType.TESTER, 95000);
}

}
