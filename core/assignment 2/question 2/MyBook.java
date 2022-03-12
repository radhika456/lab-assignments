
public class Mybook {

	public static void main(String[] args) {
		BookStore bookStore=new BookStore("Economics", 5);
		bookStore.sell("spring in action", 2);
		bookStore.display();
	}
}
