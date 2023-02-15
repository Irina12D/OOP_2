public class Main {
    public static void main(String[] args)
    {

        Department facultet = new Department();
        String[] surnames = {"Берёзов", "Игитян", "Романов", "Плиев", "Хетагурова", "Мамаева", "Ли", "Петров", "Сокуров", "Смирнов"};
        String[] names = {"Артур", "Анастасия", "Олег", "Марат", "Диана", "Светлана", "Александр", "Сергей", "Давид", "Алексей"};
        boolean[] genders = {false, true, false, false, true, true, false, false, false, false};
        int[] courses = {4, 1, 4, 3, 2, 1, 1, 2, 3, 1};
        int[] groups = {41, 11, 41, 32, 23, 11, 12, 23, 32, 11};
        String[] directions = {"ПМиИ", "ПМиИ", "ПМиИ", "ИВТ", "Кибербезопасность", "ПМиИ", "ПМиИ", "Кибербезопасность", "ИВТ", "ПМиИ"};


        for(int i=0; i<10; i++) {
            facultet.matriculation(surnames[i], names[i], genders[i], courses[i], groups[i], directions[i]);
        }
        facultet.studentsListalphabetical();

        System.out.println();

        facultet.studentsList();

    }
}