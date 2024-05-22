package AggregationDemo;

public class Book {
	
	int pages;
	String bname;
	Author au;
	
	
	public Book(int pages,String bname,Author au)
	{
		this.pages=pages;
		this.bname=bname;
		this.au=au;
	}
	
	public void print()
	{
		System.out.println("Number of pages is " +pages);
		System.out.println("Name of book " +bname);
		System.out.println("Author is  " +au.Aname);
		System.out.println("Age is " +au.age);
		System.out.println("count of books is " +au.countOfBooks);
	}
	
	public static void main(String agrs[])
	{
		Author aut=new Author("Abdul Kalam",45,500);
		Book bo=new Book(250,"Wings of fires",aut);
		bo.print();
	}

}
