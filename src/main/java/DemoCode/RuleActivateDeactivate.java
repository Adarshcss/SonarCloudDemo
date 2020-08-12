package DemoCode;

import java.math.BigDecimal;

public class RuleActivateDeactivate {

 public void name() {
	
	 for (int i = 0; i < 2; i++) {
		i=i-1;
	}
	 
}
	
 public void name1() {
	int alpha=-1;
	alpha+=1;
	 System.out.println(alpha);
}
 
 public void big() {
	 double d = 1.1;

	 BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
	 BigDecimal bd2 = new BigDecimal("1.1"); // Noncompliant; same result
	 System.out.println(bd1);
	 System.out.println(bd2);
	 
	 

}
 
}
