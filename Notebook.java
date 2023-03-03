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

public class Notebook {
    Integer id;
    String brand;
    String model;
    String color;
    Integer nbRAM;
    Integer nbHDDSDD;
    String system;
    Integer diagonal;
    Integer price;

    public Notebook(Integer id, String brand, String model, String color, Integer nbRAM, Integer nbHDDSDD, String system, Integer diagonal, Integer price){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbRAM = nbRAM;
        this.nbHDDSDD = nbHDDSDD;
        this.system = system;
        this.diagonal = diagonal;
        this.price = price;

    }
    
    public String toString(){
        return brand + ", " + model + ", " +  color + ", RAM: " + nbRAM + "Г, SDD: " + nbHDDSDD + "Г, " + diagonal + "\'\', " + price + "руб.";
    }
   
    
    
    

}   
