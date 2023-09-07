package homework;

public class homework05092023Task1 {
    public static void main(String[] args) {

//        Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//                Реализует логический метод canBuy,  возвращающий boolean
//        Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//                Отобразите строку «Я могу купить еду, это ……» и значение.

        System.out.println("Я могу купить еду, это "+canBuy());

    }
    static boolean canBuy(){
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        return isEdekaOpen || isReweOpen;

    }
}
