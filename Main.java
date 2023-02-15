public class Main {
    public static void main(String[] args)
    {

        Department facultet = new Department();
        String[] surnames = {"Берёзов", "Игитян", "Романов", "Плиев", "Хетагурова", "Мамаева", "Ли", "Петров", "Сокуров", "Смирнов"};
        String[] names = {"Артур", "Анастасия", "Олег", "Марат", "Диана", "Светлана", "Александр", "Сергей", "Давид", "Алексей"};
        boolean[] genders = {false, true, false, false, true, true, false, false, false, false};
        int[] courses = {4, 1, 4, 3, 2, 1, 1, 2, 3, 1};
        String[] groups = {"ПМ41", "ПМ11", "ПМ41", "ИВТ32", "Cyber23", "ПМ11", "ПМ12", "Cyber23", "ИВТ32", "ПМ11"};
        String[] directions = {"ПМиИ", "ПМиИ", "ПМиИ", "ИВТ", "Кибербезопасность", "ПМиИ", "ПМиИ", "Кибербезопасность", "ИВТ", "ПМиИ"};


        for(int i=0; i<10; i++) {
            facultet.matriculation(surnames[i], names[i], genders[i], courses[i], groups[i], directions[i]);
        }
        facultet.studentsListalphabetical();

    }
}