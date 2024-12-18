public class BookClient
{
    public static void main(String[] args)
    {
        Author collins = new Author("Suzanne Collins","Suzanne.Collins@mockingjay.com","female");
        Book awesome = new Book("Hunger Games",collins,9.99);
        
        awesome.setPrice(10.99);
        System.out.println("The name of the book is:\t" + awesome.getTitle());
        System.out.println("The price of the book is:\t$" + awesome.getPrice());
        System.out.println("The name of the author is:\t" + awesome.getAuthorName());        
        System.out.println("The author's email is:\t\t" + awesome.getAuthorEmail());
        System.out.println("The author's gender is:\t\t" + awesome.getAuthorGender());
    }
}
