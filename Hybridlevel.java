package inheritance;
class abc{
 void play()
	{
		System.out.println("I love playing football in playground");
	}
}
class def extends abc{
	 void school()
	{
     System.out.println("I love playing chess in school");

	}
}
class ghi extends abc{
	 void playschool()
	{
     System.out.println("I love playing carroms in playschool");

	}
}

public class Hybridlevel {
    public static void main(String[] args) {
    	def t1= new def();
        t1.school();
    	t1.play();
    	ghi t = new ghi();
    	t.playschool();
    	t.play();
    	
    
    	
} 
}

