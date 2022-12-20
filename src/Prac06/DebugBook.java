package Prac06;

public class DebugBook
{
   protected int pages;
   public DebugBook(int pgs)
   {
      pages = pgs;
   }
   public int getPages()
   {
      return pages;
   }

   public static void main(String[] args){
      DebugBook book = new DebugBook(12);
      int page = book.getPages();
      System.out.println(page);

   }
}

