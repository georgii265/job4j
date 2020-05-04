package ru.job4j.poly;

public class Service {
    private DbStore store;

    /**
     * В метод Service мы передаем переменную DbStore store.
     * Чтобы отличить переменную DbStore store из класса Service,от переменной DbStore store из метода Service.
     * Для решения этой проблемы и было введено ключевое слово this,
     * которое в данном случае укажет, что нужно вызывать переменную не метода, а класса Service.
     * @param store
     */
    public Service(DbStore store) {
        this.store = store;
    }

    /**
     * Вызываем метод save из экземпляра store.
     */
    public void extract() {
        store.save("Georgi Morgunov");
    }

    /**
     * Создаем обьект store типа DbStore
     * Создаем обьект service типа Service передаем параметры переменной store.
     * Вызываем метод extract из экземпляра service.
     * Теперь в  классе service DbStore store = new DbStore(); можно заменить на DbStore store = new FileStore();
     * тем самы мы сделали приведение типов.
     *
     * Когда мы с помощью interface Store за implements два класса DbStore и FileStore :
     * вносим изменения теперь в этих строчках кода : DbStore store = new FileStore();
     *                                               Service service = new Service(store);
     *                                               service.extract();
     *   и заменяем ее на : Store store = new DbStore();
     * Теперь все классы не связаны между собой.
     * Это позволяет заменить одну часть программы на другую без переписывания кода.
     * @param args
     */
    public static void main(String[] args) {
        Store store = new DbStore();
    }
}

