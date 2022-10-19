package DesignPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

    private String shopName;
    private List<Book> bookList;



    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadData(){

        bookList = new ArrayList<>();
        for(int i = 0 ; i<10;i++){
            Book book = new Book();
            book.setName("Book Name " + i);
            book.setAuthor("Book Author " + i);
            bookList.add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        BookShop shop = new BookShop();
        shop.setBookList(new ArrayList<>());
        for(Book b : this.getBookList())
            shop.getBookList().add(b);
        return shop;
    }
}
