	class Numero {
	    private int n1;
	    private int n2;
	    private int n3;

	    public Numero(int n1, int n2, int n3) {
	        this.n1 = n1;
	        this.n2 = n2;
	        this.n3 = n3;
	    }
	    public double x (){
	    	return (n1 + n2 + n3) / 3.0;
	    }

	    public int getN1() {
	    	return n1;
	    	}
	    public int getN2() {
	    	return n2;
	    	}
	    public int getN3() {
	    	return n3;
	    	}
	}
	   
	 public class Aritmetica{
	    public static void main(String[] args) {
	      
	        Numero n = new Numero (5,7,9);
	        
	        System.out.println("O resultado da média aritmética dos números é: " + n.x());
	 }
	    }
	 
	 
	 