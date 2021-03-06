package day18;

public class Rating {
	enum MovieRating {Excelent, Average, Bad};
	public static void main(String[] args) {
		System.out.println(getRatingMsg(MovieRating.Excelent));
		
		MovieRating r = MovieRating.Average;
		System.out.println(getRatingMsg(r));
		
		System.out.println(getRatingMsg(MovieRating.Bad));
	}
	
	public static String getRatingMsg(MovieRating rating) {
		String msg;
		
		switch(rating) {
		case Excelent:
			msg = "You must see this movie!";
			break;
		case Average:
			msg = "This movie is OK, but not great.";
			break;
		case Bad:
			msg = "Skip it.";
			break;
		default:
			msg = "Something went wrong";
		}
		
		return msg;
	}
}