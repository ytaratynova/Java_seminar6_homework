// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.



package seminar6_homework;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class task01 {
    //процедура считывает данные
    public static String stringScann(Scanner iScanner){
        String input = iScanner.nextLine();
        return input;

    }
    //процедура выводит основное меню
    public static Integer userMenu(Scanner iScanner){
        String text = "\n1 - Посмотреть полный список ноутбуков:\n" + 
                      "2 - Выбрать ноутбук по критерию\n" + 
                      "3 - Завершить работу\n";  
        System.out.println(text);
        String input = stringScann(iScanner);
        return Integer.parseInt(input);
    }
    //процедура запрашивает у пользователя критерий
    public static Integer askFiltr(Scanner iScanner){
        String text = "Введите цифру, соответствующему необходимому критерию:\n" + 
                        "1 - производитель\n" + 
                        "2 - цвет\n" +
                        "3 - оперативная память\n" +
                        "4 - жесткий диск\n" +
                        "5 - операционная система\n" +
                        "6 - диагональ\n" +
                        "7 - цена\n";
        System.out.println(text);
        String input = stringScann(iScanner);
        return Integer.parseInt(input);
    }

    // фильтр по бренду
    public static void filtrBrand(Set<Notebook> someSet, Scanner iScanner){
        Set<String> brandTree = new TreeSet<>();
        for (Notebook notebook : someSet) {
            brandTree.add(notebook.brand);
            }
         
        System.out.printf("Выберите Производителя из списка: ");
        System.out.println(brandTree);
        String answer = stringScann(iScanner);
        System.out.println("\nНоутбуки согласно критерию:");
        int count = 0;
        for (Notebook notebook : someSet) {
            if (notebook.brand.equals(answer)){
                System.out.println(notebook.toString());
                count ++;
            };
            }  
        if (count == 0){
            System.out.println("не найдены!");
        }
    }

    // фильтр по цвету
    public static void filtrColor(Set<Notebook> someSet, Scanner iScanner){
        Set<String> colorTree = new TreeSet<>();
                
                for (Notebook notebook : someSet) {
                    colorTree.add(notebook.color);
                    }
                System.out.printf("Выберите желаемый цвет ноутбука из списка: ");
                System.out.println(colorTree);
                String answer = stringScann(iScanner);
                System.out.println("\nНоутбуки согласно критерию:");
                int count = 0;
                for (Notebook notebook : someSet) {
                    if (notebook.color.equals(answer)){
                        System.out.println(notebook.toString());
                        count ++;
                    };
                    }
                if (count == 0){
                    System.out.println("не найдены!");
                }
    }

    // фильтр по оперативке
    public static void filtrRAM(Set<Notebook> someSet, Scanner iScanner){
        Set<Integer> ramTree = new TreeSet<>();
                
                for (Notebook notebook : someSet) {
                    ramTree.add(notebook.nbRAM);
                    }
                System.out.printf("Выберите минимально необходимый объем оперативной памяти из списка, Г: ");
                System.out.println(ramTree);
                Integer answer = Integer.parseInt(stringScann(iScanner));
                System.out.println("\nНоутбуки согласно критерию:");
                int count = 0;
                for (Notebook notebook : someSet) {
                    if (notebook.nbRAM >= answer){
                        System.out.println(notebook.toString());
                        count ++;
                    }
                    }
                if (count == 0){
                    System.out.println("не найдены!");
                }
    }

    // фильтр по жескому диску
    public static void filtrHDD(Set<Notebook> someSet, Scanner iScanner){
        Set<Integer> hddTree = new TreeSet<>();
                
                for (Notebook notebook : someSet) {
                    hddTree.add(notebook.nbHDDSDD);
                    }
                System.out.printf("Выберите миимально необходимый объем жесткого диска из списка, Г: ");
                System.out.println(hddTree);
                Integer answer = Integer.parseInt(stringScann(iScanner));
                System.out.println("\nНоутбуки согласно критерию:");
                int count = 0;
                for (Notebook notebook : someSet) {
                    if (notebook.nbHDDSDD >= answer){
                        System.out.println(notebook.toString());
                        count ++;
                    }
                }
                if (count == 0){
                    System.out.println("не найдены!");
                }
               
    }

    // фильтр по операционной системе
    public static void filtrSystem(Set<Notebook> someSet, Scanner iScanner){
        Set<String> systemTree = new TreeSet<>();
                
                for (Notebook notebook : someSet) {
                    systemTree.add(notebook.system);
                    }
                System.out.printf("Выберите желаемую операционную систему из списка: ");
                System.out.println(systemTree);
                String answer = stringScann(iScanner);
                System.out.println("\nНоутбуки согласно критерию:");
                int count = 0;
                for (Notebook notebook : someSet) {
                    if (notebook.system.equals(answer)){
                        System.out.println(notebook.toString());
                        count ++;
                    }
                }
                if (count == 0){
                    System.out.println("не найдены!");
                }   
        }

    // фильтр по диагонали
    public static void filtrDiagonal(Set<Notebook> someSet, Scanner iScanner){
        Set<Integer> diagonalTree = new TreeSet<>();
                
            for (Notebook notebook : someSet) {
                diagonalTree.add(notebook.diagonal);
                }
            System.out.printf("Выберите желаемую диагональ ноутбука из списка, '': ");
            System.out.println(diagonalTree);
            Integer answer = Integer.parseInt(stringScann(iScanner));
            System.out.println("\nНоутбуки согласно критерию:");
            int count = 0;
            for (Notebook notebook : someSet) {
                if (notebook.diagonal == answer){
                    System.out.println(notebook.toString());
                    count ++;
                }
            }
            if (count == 0){
                System.out.println("не найдены!");
            }
    }

    // фильтр по цене
    public static void filtrPrice(Set<Notebook> someSet, Scanner iScanner){
            
        System.out.printf("Выберите максимальную ожидаемую стоимость ноутбука из списка: ");
            Integer answer = Integer.parseInt(stringScann(iScanner));
            System.out.println("\nНоутбуки согласно критерию:");
            int count = 0;
            for (Notebook notebook : someSet) {
                if (notebook.price <= answer){
                    System.out.println(notebook.toString());
                    count ++;
                }
            } 
            if (count == 0){
                System.out.println("не найдены!");   
            }
    
    }
    

    public static void main(String[] args){
    
        Notebook nb01 = new Notebook(1, "ASUS", "Zenbook", "black", 8, 512, 
                                     "Windows 11 Home", 14, 84000);
        Notebook nb02 = new Notebook(2, "Apple", "MacBook Air M1", "white", 8, 256, 
                                     "macOS", 13, 83000);
        Notebook nb03 = new Notebook(3, "HP", "Omen", "black", 16, 1024, 
                                     "Windows 11 Home", 16, 220000);   
        Notebook nb04 = new Notebook(4, "ASUS", "VivoBook", "black", 16, 512, 
                                     "Windows 11 Home", 17, 121000);                          
        Notebook nb05 = new Notebook(5, "HUAWEI", "MateBook", "black", 16, 1024, 
                                     "Windows 11 Home", 14, 140000);
        Notebook nb06 = new Notebook(6, "Lenovo", "Ideapad", "black", 16, 512, 
                                     "Windows 11 Home", 16, 60000);
        Notebook nb07 = new Notebook(7, "Acer", "Aspire", "black", 12, 512, 
                                     "Windows 11 Home", 16, 55000);
        Notebook nb08 = new Notebook(8, "HP", "Victus", "black", 16, 512, 
                                     "Windows 11 Home", 16, 101000);   
        Notebook nb09 = new Notebook(9, "Xiaomi", "Redmibook", "black", 16, 512, 
                                     "Windows 11 Home", 15, 95000);                          
        Notebook nb10 = new Notebook(10, "MSI", "Katana", "black", 8, 256, 
                                     "Windows 11 Home", 17, 67000);   

        
        
         
        Set<Notebook> setNB = new HashSet<>();
        setNB.add(nb01);
        setNB.add(nb02);
        setNB.add(nb03);
        setNB.add(nb04);
        setNB.add(nb05);
        setNB.add(nb06);
        setNB.add(nb07);
        setNB.add(nb08);
        setNB.add(nb09);
        setNB.add(nb10);

        Scanner iScanner = new Scanner(System.in);
        
        while (true){
        switch (userMenu(iScanner)){
            case 1:
            for (Notebook notebook: setNB){
                System.out.println(notebook.toString());
            }
                break;
            case 2:
                Integer filter = askFiltr(iScanner);
                switch (filter){
                    case 1:
                        filtrBrand(setNB, iScanner);
                        continue;
                    case 2:
                        filtrColor(setNB, iScanner);
                        continue;
                    case 3:
                        filtrRAM(setNB, iScanner);
                        continue;
                    case 4:
                        filtrHDD(setNB, iScanner);
                        continue;
                    case 5:
                        filtrSystem(setNB, iScanner);
                        continue;
                    case 6:
                        filtrDiagonal(setNB, iScanner);
                        continue;
                    case 7:
                        filtrPrice(setNB, iScanner);
                        continue;
                }
            case 3:
                System.exit(0);

        }

        }


    }
 
}
