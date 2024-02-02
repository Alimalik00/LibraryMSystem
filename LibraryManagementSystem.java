class Library{
    String [] availableBooks = new String[5];
    String [] issuedBooks = new String[5];

    public void addBooks(String[] books) {
        for (int i = 0; i < this.availableBooks.length; i++) {
            this.availableBooks[i] = books[i];
        }
    }
    public void getAvailableBooks(){
        for(int i=0; i< this.availableBooks.length; i++){
            System.out.println(this.availableBooks[i]);
        }
    }
    public void getIssuedBooks(){
        for(int i=0; i< this.issuedBooks.length; i++){
            System.out.println(this.issuedBooks[i]);
        }
    }

    public void issueBook(String bookname){
        for(int i=0; i<this.issuedBooks.length; i++){
            if(this.issuedBooks[i] == null) {
                this.issuedBooks[i] = bookname;
                break;
            }
        }
        for(int i=0; i< this.availableBooks.length;i++){
            if(this.availableBooks[i] == bookname){
                this.availableBooks[i] = "";
                break;
            }
        }
        System.out.println("The book " + bookname + " is issued successfully!");
    }

    public void returnBook(String bookname){
        for(int i=0; i<this.issuedBooks.length; i++){
            if(this.issuedBooks[i] == bookname){
                this.issuedBooks[i] = "";
                break;
            }
        }
        for(int i=0; i<this.availableBooks.length; i++){
            if(this.availableBooks[i] == ""){
                this.availableBooks[i] = bookname;
                break;
            }
        }

        System.out.println("The book "+ bookname + " is returned successfully!");
    }

}


public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library l1 = new Library();
        String[] myBooks = {"harry potter", "Why Nations Fail", "Allama Iqbal poetry",
                "Lord of the Rings", "Andrew Tate"};

        l1.addBooks(myBooks);
        l1.issueBook("Andrew Tate");
        l1.getAvailableBooks();
        l1.getIssuedBooks();
        l1.issueBook("Lord of the Rings");
        l1.getIssuedBooks();
        l1.returnBook("Andrew Tate");
        l1.getAvailableBooks();

    }
}
