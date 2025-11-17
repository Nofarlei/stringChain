package stringCahin.stringCahin;



public class B {
	 private C next;

	public B(C next) {
	   this.next = next;
	}

	public String process(String prefix) {
	  
	   String updated = next.process(prefix + "E");
	   
	   return prefix + "E";

	   
	}}