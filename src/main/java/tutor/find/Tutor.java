package tutor.find;

import java.util.*;

public class Tutor {

    private String name;
    private String subject;
    private int experienceYears;
    private double hourlyRate;
    private String location;
    private String education;
    private String availability;
    private String isOnline;
    private String teachingMethod;
    private String additionalInformation;

    public Tutor(String name, String subject, int experienceYears, double hourlyRate,
                 String location, String education, String availability, String isOnline,
                 String teachingMethod, String additionalInformation) {
        this.name = name;
        this.subject = subject;
        this.experienceYears = experienceYears;
        this.hourlyRate = hourlyRate;
        this.location = location;
        this.education = education;
        this.availability = availability;
        this.isOnline = isOnline;
        this.teachingMethod = teachingMethod;
        this.additionalInformation = additionalInformation;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String getLocation() {
        return location;
    }

    public String getEducation() {
        return education;
    }

    public String getAvailability() {
        return availability;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public String getTeachingMethod() {
        return teachingMethod;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public static List<Tutor> tutors = new ArrayList<>();

    public static void tutorAdd() {

        //Додавання репетиторів
        tutors.add(new Tutor("Іван Володимирович Дудуш", "Математика", 5, 300, "Київ", "Вища", "По буднях", "Так",
                "Індивідуальні", "Маю великий досвід роботи зі студентами."));
        tutors.add(new Tutor("Марина Валеріївна Сидорова", "Фізика", 3, 250, "Львів", "Вища", "По вихідних", "Ні",
                "Індивідуальні", "Займаюсь науковою діяльністю у галузі фізики."));
        tutors.add(new Tutor("Олексій Іванов Степанян", "Англійська", 7, 250, "Харків", "Вища", "Будь-який час", "Так",
                "Індивідуальні", "Маю сертифікати викладача англійської мови."));
        tutors.add(new Tutor("Тетяна Миколаївна Петренко", "Історія", 10, 280, "Одеса", "Вища", "По буднях", "Ні",
                "Групові", "Спеціалізуюсь на вивченні історії України."));
        tutors.add(new Tutor("Петро Вікторович Литвиненко", "Хімія", 8, 270, "Дніпро", "Вища", "Будь-який час", "Так",
                "Індивідуальні", "Маю власну лабораторію для занять."));
        tutors.add(new Tutor("Ірина Олександрівна Коваль", "Біологія", 6, 260, "Запоріжжя", "Магістр", "По вихідних", "Так",
                "Індивідуальні", "Займаюсь дослідницькою роботою у галузі біології."));
        tutors.add(new Tutor("Володимир Юрійович Савченко", "Інформатика", 4, 240, "Кривий Ріг", "Вища", "Будь-який час", "Так",
                "Індивідуальні", "Маю досвід роботи в сфері програмування."));
        tutors.add(new Tutor("Анна Сергіївна Мельник", "Географія", 9, 260, "Житомир", "Магістр", "По буднях", "Ні",
                "Індивідуальні", "Організовую екскурсії для учнів."));
        tutors.add(new Tutor("Олег Вікторович Гончаренко", "Економіка", 7, 280, "Вінниця", "Вища", "По буднях", "Ні",
                "Групові", "Маю досвід роботи в банківській сфері."));
        tutors.add(new Tutor("Маргарита Ігорівна Козлова", "Мови світу", 5, 300, "Київ", "Вища", "Будь-який час", "Так",
                "Індивідуальні", "Вивчаю мови світу та культури."));
        tutors.add(new Tutor("Вадим Вікторович Лисенко", "Музика", 8, 250, "Львів", "Магістр", "По вихідних", "Так",
                "Індивідуальні", "Викладаю теорію музики та гратиму на різних інструментах."));
        tutors.add(new Tutor("Євгенія Анатоліївна Шевченко", "Журналістика", 6, 270, "Харків", "Вища", "По буднях", "Ні",
                "Групові ", "Маю досвід роботи в медіа."));
        tutors.add(new Tutor("Віталій Олександрович Кравченко", "Філософія", 9, 290, "Одеса", "Магістр", "Будь-який час", "Так",
                "Індивідуальні", "Займаюсь філософським аналізом сучасних проблем."));
        tutors.add(new Tutor("Наталія Ігорівна Григоренко", "Психологія", 7, 260, "Дніпро", "Вища", "По вихідних", "Так",
                "Індивідуальні", "Маю практичний досвід роботи з клієнтами."));
        tutors.add(new Tutor("Сергій Петрович Іваненко", "Художня культура", 5, 280, "Кривий Ріг", "Магістр", "Будь-який час", "Ні",
                "Індивідуальні", "Вивчаю історію мистецтва та викладаю художню культуру."));

    }


}
