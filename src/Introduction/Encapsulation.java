public class Encapsulation {
    /*
     * Create a class Author with the following information.
     * Member variables : name (String), email (String), and gender (char)
     * Parameterized Constructor: To initialize the variablesCreate a class Book
     * with the followinginformation.
     * Member variables : name (String), author (of the class Author you
     * have just created), price (double), and qtyInStock (int)[Assumption: Each
     * book will be written by exactly one Author]
     * Parameterized Constructor: To initialize the variables
     * Getters and Setters for all the member variables
     * In the main method, create a book object and print all details of the book
     * (including the author details)
     */

    static class Author {
        String name;
        String email;
        char gender;

        Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String toString() {
            return name + " (" + gender + "), " + email;
        }
    }

    static class Book {
        private String name;
        private Author author;
        private double price;
        private int qtyInStock;

        Book(String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

        // getter method
        void getDetails() {
            System.out.println("Book: " + name);
            System.out.println("Author: " + author.toString());
            System.out.println("Price: " + price);
            System.out.println("Quantity in stock: " + qtyInStock);
        }

        // setter method
        void setDetails(String name, Author author, double price, int qtyInStock) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }

    }

    public static void main(String[] args) {
        Author author = new Author("Srinivas", "sm@gmail.com", 'M');
        Book book = new Book("Java Basics", author, 499.99, 10);
        book.getDetails();

    }
}
