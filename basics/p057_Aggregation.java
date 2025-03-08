public class p057_Aggregation {
    public static void main(String[] args) {
        // Aggregation represents has-a relationship between objects. One Object contains another object as part of its structure, but the contained object/s can exist independently
        Book book1 = new Book("The Sandman, Vol. 1: Preludes & Nocturnes", 320);
        Book book2 = new Book("The Sandman, Vol. 2: The Doll's House", 340);
        Book book3 = new Book("The Sandman, Vol. 3: Dream Country", 342);

        Book[] books = {book1, book2, book3};
        

        Library lib = new Library("new Library", 2025, books);

        lib.displayInfo();

    }
    
}

class Book {
    String title;
    int pages;

    Book(String title , int pages){
        this.title = title;
        this.pages = pages;
    }
    String displayInfo(){
        return this.title + " (" + this.pages + ") pages";
    }

}

class Library {
    String name;
    int year;
    Book[] books;

    Library(String name,int year,Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " "+ this.name);
        System.out.println("Books Available: ");
        for(Book book:books){
            System.out.println(book.displayInfo());
        }
    }


    
}
