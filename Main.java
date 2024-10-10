import java.util.Scanner;

import static javafx.application.Platform.exit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] book =new Book[5];
        Scanner sc=new Scanner(System.in);
        int i=0;
        int j;
        int k;
        int number=0;
        while(true){
            System.out.println("1.) Display\n2.) Add Book\n3.) Delete Book\n4.) Update Book\n5.) Search Book\n6.) Exit");
            int option;
            System.out.println("Enter your option");
            
            option=sc.nextInt();
            switch (option){
                case 1:
                    for (j = 0; j < i ; j++) {
                        System.out.println(book[j].getBookID()+"\t"+book[j].getBookName()+"\t"+book[j].getAuthor()+"\t"+book[j].getBookPrice());
                    }
                    System.out.println("Book displayed successfully");
                    break;
                case 2:

                    System.out.println("Enter how many books you want to enter");
                    int n= sc.nextInt();;
                    number=number+n;
                    for (j=i; j < number; j++,i++) {

                        System.out.println("Enter Book ID, Book Name, Author Name and Book Price");
                        String bookID=sc.nextLine();
                        //sc.reset();
                        String bookName=sc.nextLine();
                        //sc.reset();
                        String author=sc.nextLine();
                        //sc.reset();
                        sc.nextLine();
                        float bookPrice=sc.nextFloat();
                        //sc.close();
                        book[j]=new Book(bookID,bookName,author,bookPrice);

                    }
                    System.out.println("Book added successfully");
                    break;
                case 3:

                    System.out.println("Enter Book ID to be deleted");
                    //sc.reset();

                    String bookID=sc.next();
                    for (k = 0; k < number; k++) {
                        if(bookID.equals(book[k].getBookID())){
                            break;
                        }
                    }
                    System.out.println(k);
                    System.out.println("Book deleted successfully");
                    break;
                case 4:
                    System.out.println("Book updated successfully");
                    break;
                case 5:
                    System.out.println("Book details : ");
                    System.out.println("Enter Book ID to print details : ");
                    bookID=sc.next();
                    for (int m = 0; m <number ; m++) {
                        String bid=book[m].getBookID();

                        if (bookID.equals(bid)){
                            System.out.println(book[m].getBookID()+"\t"+book[m].getBookName()+"\t"+book[m].getAuthor()+"\t"+book[m].getBookPrice());
                            break;
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Entered wrong option");
            }
        }
    }
}