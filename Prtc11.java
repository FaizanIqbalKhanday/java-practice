// object composation
import java.util.ArrayList;

class Book{
    private int id;
    private String bookName;
    private String author;
    private ArrayList<Review>review =new ArrayList<>();

    public void addReviews(Review review){
        this.review.add(review);
    }
   


    public Book(int id, String bookName, String author) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }  
    public String toString(){
        return "id : "+id+", book name : "+bookName+", Author :"+author+", review : "+review;
    } 
}
class Review{
    private int id;
    private String discruption;
    private int stars;
    public Review(int id, String discruption, int stars) {
        this.id = id;
        this.discruption = discruption;
        this.stars = stars;
    }
    public String toString(){
        return id+ "  "+discruption+ " "+stars;
    }
    
}
public class Prtc11 {
    public static void main(String[] args) {
        Review review=  new Review(10, "awesome",4);
        Book newBook =new Book(123, "java", "Faizan");
        newBook.addReviews(review);
        System.out.println(newBook);
        
        
    }
}
