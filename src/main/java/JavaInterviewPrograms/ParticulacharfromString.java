package JavaInterviewPrograms;

public class ParticulacharfromString {
	
	public static char particularchar(String s,int index) {
		
		return s.charAt(index);
		
	}

	
	public static void main(String[] args) {

		String s = " dileep bandi";
		int index = 5;
		
	

		
	char c=	s.charAt(index);
	
	System.out.println(c);
        
	
	System.out.println(particularchar(s, 3));

	}

}
