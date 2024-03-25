package com.satya.book;

public class AllMain {

	public static void main(String[] args) {
		BookDao dao= new BookDao();
		//table create
	//	int createRsult=dao.createBookTable();
	//	System.out.println("table create status.."+createRsult);
		
	    Book book=new Book();
	    book.setBookId("112");
	    book.setBookName("core");
	    book.setPrice(100);
	    
	    int result=dao.saveBook(book);
	    if(result==1)
	    {
	    	System.out.println("data inserted successfull..."+result);
	    }
	    else
	    {
	    	System.out.println("data not inserted successfull..."+result);

	    }
	}

}
