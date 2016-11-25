package org.acttos.jtv.basic;

/**
 * @author <a href="mailto:acttosma@gmail.com">Acttos</a>
 * @version 1.0.0
 */
public class BasicVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//You must convert 3.4 to float by adding "(float)";
		float f = (float) 3.4;
		short s1 = 1;
		//You must make the number 1 to be short from int; all the variable are going uper to calculate.eg. short -> int, int -> double.
		s1 = (short) (s1 + 1);
		//This line below just convert number 1 to short automatically.
		s1 += 1;
		
		//Math.round() 四舍五入
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.5));
		
		

	}

}
