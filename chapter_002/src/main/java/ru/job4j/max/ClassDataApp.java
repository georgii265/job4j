package ru.job4j.max;

public class ClassDataApp {

    public static void main(String[] args) {
        int maxSize = 100; //размер массива
        ClassDataArray arr = new ClassDataArray(maxSize); //создание ссылки на массив,создание массива

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.displayA(); //вывод массива

        String searchKey = "Stimson"; //поиск элемента
        Person found;
        found = arr.find(searchKey);
        if (found != null)
        {
            System.out.print("Found");
            found.displayPerson();
        }
        else
            System.out.println("Can't find " + searchKey);


        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith"); //удаление трех элментов
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.displayA(); //повторный вывод содержимого
    }

}
