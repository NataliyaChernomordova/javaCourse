package lesson_12.additional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Specialist specialist1 = new Specialist("Василий", 10000, Specialty.DEVELOPER);
        Specialist specialist2 = new Specialist("Виктор", 23000, Specialty.DEVOPS);
        Specialist specialist3 = new Specialist("Александр", 100000, Specialty.PROJECT_MANAGER);
        Specialist specialist4 = new Specialist("Игорь", 12000, Specialty.DEVELOPER);
        Specialist specialist5 = new Specialist("Василий", 50000, Specialty.DEVELOPER);
        Specialist specialist6 = new Specialist("Василий", 5000, Specialty.DEVOPS);

        List<Specialist> specs = new ArrayList<>();
        specs.add(specialist1);
        specs.add(specialist2);
        specs.add(specialist3);
        specs.add(specialist4);
        specs.add(specialist5);
        specs.add(specialist6);

//        specs.forEach(specialist -> System.out.println(specialist));
//
//        Util.oldFindByName(specs, "Вас");
//        Util.newFindByName(specs,"Ник").forEach(x -> System.out.println(x));
//        Util.oldSortByName(specs).forEach(x-> System.out.println(x));
//
//        Map<Specialty, List<Specialist>> map = Util.groupingBySpecialty(specs);
//
//        Util.newSortByName(specs).forEach(x-> System.out.println(x));

//        System.out.println(Util.matchAllSpecialistAreDevops(specs));


        String login = null;
        if (login != null) {
            System.out.println(login.length());
        }
        Scanner scanner = new Scanner(System.in);
        login = scanner.nextLine();

        System.out.println(Util.matchAllSpecialistsSalaryMoreThan10000(specs));

    }
}
