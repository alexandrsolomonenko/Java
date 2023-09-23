package hw14092023;


public class HomeWork14092023 {
    public static void main(String[] args) {

//        Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.
//                input:
//        arr[] = {1,2,3,5}
//        out: 4
//        arr[] = {6,1,2,8,3,4,7,10,5}
//        out: 9

        int[] arr1 = {1, 2, 3, 5};
        int n1 = arr1.length + 1;
        int missingNumber1 = findMissingNumber(arr1, n1);
        System.out.println("Missing number: " + missingNumber1);

        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int n2 = arr2.length + 1;
        int missingNumber2 = findMissingNumber(arr2, n2);
        System.out.println("Missing number: " + missingNumber2);

//        Сформировать строку, сходную с  SQL запросом, используя StringBuilder:
//
//        1) Берем исходную строку с данными из cars
//        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}
//        Если значение второго параметра равно null с каждой пары, то параметр не должен попадать в условие отбора, которое задается после ключевого слова WHERE в результирующей строке.
//        Пример: строка с данными из users: {"id", 1, "country", null, "city", "Helsinki", "year", null}
//        Результат, новая строка:  SELECT * FROM users WHERE id = '1'  AND city = 'Helsilnki';



        String[] data = {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", "true"};

        StringBuilder query = new StringBuilder("SELECT * FROM cars WHERE ");
        boolean isFirstCondition = true;

        for (int i = 0; i < data.length; i += 2) {
            String key = data[i];
            String value = data[i + 1];

            if (value != null) {
                if (!isFirstCondition) {
                    query.append(" AND ");
                }
                query.append(key).append(" = '").append(value).append("'");
                isFirstCondition = false;
            }
        }

        String result = query.toString();
        System.out.println(result);



    }
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return totalSum - arrSum;
    }




}