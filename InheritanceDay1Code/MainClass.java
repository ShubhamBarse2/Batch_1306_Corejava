package InheritanceDay1Code;

public class MainClass {

	public static void main(String[] args) {
		System.err.println("Instagram Welcome page ... !");
		Instagram insta = new Instagram();

		insta.myRegister();
		insta.myLogin();
		insta.addStroy();
		insta.uploadReels();
		insta.myLogout();

		System.out.println("------------------------------");

		System.err.println("FaceBook Welcome page ... !");
		FaceBook fb = new FaceBook();

		fb.myRegister();
		fb.myLogin();
		fb.addPost();
		fb.addComment();
		fb.myLogout();

	}

}
