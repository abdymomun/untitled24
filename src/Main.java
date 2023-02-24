public class Main {
    public static void main(String[] args) {
       Author author = new Author("чингиза айтматова ","atmatov@gmail.com  ",'m');
        System.out.println("name "+author.getName()+"email "+author.getEmail()+"gender "+author.getGender());
author.toString();
       Book book = new Book(" Ак Кеме ","Чынгыз Айтматов",600,5);
       Book book1 = new Book(" Саманчынын жолу   ","Чынгыз Айтматов",700,5);
       Book book2 = new Book("Биринчи Мугалим ","Чынгыз Айтматов",800,5);
       Book book3 = new Book("  Джамиля ","Чынгыз Айтматов",1500,5);
       Book book4 = new Book("Жараланган турналар","Чынгыз Айтматов",2000,5);
       Book [] books = {book,book1,book2,book3,book4};
        for (Book b: books) {
            System.out.println(b);

        }

    }}
