import javax.swing.plaf.synth.SynthOptionPaneUI;

import ganit.Sama;


public class NamasteDuniya {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Namaskar Duniya");
		int first = 10;
		int two =20;
		
		Sama firstSama = new Sama(first,two);
		
		System.out.println("the classs value in Strng " +firstSama.toString()) ;
		System.out.println("the value of addition is "+firstSama.getSamaFloat());
	}

}
