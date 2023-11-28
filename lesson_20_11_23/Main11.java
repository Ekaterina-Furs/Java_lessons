

/*
Каталог товаров книжного магаина сохранен в виде двумерного массива.
Так, что на 0-ой позиции внутреннего списка сохранен жанр, а на остальных - названия книг.
Напишите метод для заполнения данной структуры.
 */

import java.util.ArrayList;
import java.util.List;



 public class Main11 {
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook(shopBook, "Сказки", "Колобок");
        addBook(shopBook, "Роман", "Война и мир");
        addBook(shopBook, "Фэнтези", "Гарри Поттер");
        addBook(shopBook, "Фантастика", "Камешек в небе");
        addBook(shopBook, "Роман", "Мастер и Маргарита");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genre, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> bookshelf = shopBook.get(i);
            if (bookshelf.get(0).equals(genre)){
                bookshelf.add(nameBook);
                return;
            }
        }
        List<String> bookshelf = new ArrayList<>();
        bookshelf.add(genre);
        bookshelf.add(nameBook);
        shopBook.add(bookshelf);
    }
}