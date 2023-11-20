package tutor.find;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TutorSearch {

    private static String subjectToSearch;

    public static String getSubjectToSearch() {
        return subjectToSearch;
    }

    private static String locationToSearch;

    public static String getLocationToSearch() {
        return locationToSearch;
    }

    private static String educationToSearch;

    public static String getEducationToSearch() {
        return educationToSearch;
    }

    private static String availabilityToSearch;

    public static String getAvailabilityToSearch() {
        return availabilityToSearch;
    }

    private static String isOnlineToSearch;

    public static String getIsOnlineToSearch() {
        return isOnlineToSearch;
    }

    private static String teachingMethodToSearch;

    public static String getTeachingMethodToSearch() {
        return teachingMethodToSearch;
    }

    static List<Tutor> foundTutors = new ArrayList<>();

    public static void search() {

        Tutor.tutorAdd();

        userInput();

        // Додаємо знайдених репетиторів до списку знайдених
        foundTutors = searchTutorsByAttributes();

        searchResult();

    }

    private static void userInput() {

        //Ввод користувача
        Scanner scanner = new Scanner(System.in);
        System.out.print("Уведіть предмет з якого вам потрібен репетитор: ");
        subjectToSearch = scanner.nextLine();
        System.out.print("Уведіть місто: ");
        locationToSearch = scanner.nextLine();
        System.out.print("Уведіть освіту, яку ви хочете бачити у репетитора: ");
        educationToSearch = scanner.nextLine();
        System.out.print("Уведіть час, у який ви хотіли б займатися (по буднях, по вихідних, будь-який час) ");
        availabilityToSearch = scanner.nextLine();
        System.out.print("Чи розглядаєте ви онлайн заняття: ");
        isOnlineToSearch = scanner.nextLine();
        System.out.print("Який формат занять вас цікавить (індивідуальні, групові, і т.п.): ");
        teachingMethodToSearch = scanner.nextLine();;
    }

    private static List<Tutor> searchTutorsByAttributes() {

        List<Tutor> filteredTutors = new ArrayList<>();

        for (Tutor tutor : Tutor.tutors) { //Якщо всі параметри підійшли
            if (tutor.getSubject().equalsIgnoreCase(getSubjectToSearch()) &&
                    tutor.getLocation().equalsIgnoreCase(getLocationToSearch()) &&
                    tutor.getEducation().equalsIgnoreCase(getEducationToSearch()) &&
                    tutor.getAvailability().equalsIgnoreCase(getAvailabilityToSearch()) &&
                    tutor.getIsOnline().equalsIgnoreCase(getIsOnlineToSearch()) &&
                    tutor.getTeachingMethod().equalsIgnoreCase(getTeachingMethodToSearch())){
                filteredTutors.add(tutor);
            }

        }

        return filteredTutors;

    }

    public static void searchResult() {

        //Виведення результатів пошуку
        if (foundTutors.isEmpty()) {
            System.out.println("Репетиторів за обраним предметом не знайдено :(");
        } else {
            System.out.println("Знайдені репетитори:");
            for (Tutor tutor : foundTutors) {
                System.out.println("--------------------" +
                        "\nІніціали: " + tutor.getName() +
                        "\nПредмет: " + tutor.getSubject() +
                        "\nДосвід (роки): " + tutor.getExperienceYears() +
                        "\nЦіна за годину (грн): " + tutor.getHourlyRate() +
                        "\nМісто: " + tutor.getLocation() +
                        "\nОсвіта: " + tutor.getEducation() +
                        "\nОнлайн заняття: " + tutor.getAvailability() +
                        "\nВаріант проводження занять: " + tutor.getTeachingMethod());
            }
        }

    }

}
