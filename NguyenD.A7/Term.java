public class Term{
	
	protected int coeff;
	protected int exp;
	
	Term (int c, int e){
		coeff = c;
		exp = e;
	}
	
	public boolean isGreater (Term t){
		
		if (this.exp > t.getExp()){
			return true;
		}
		else if (this.coeff > t.getCoeff() && this.exp > t.getExp()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int evaluate (int x){
	    return (int) (this.coeff * Math.pow (x, this.exp));
	}
	
	public String toString(){
		return this.coeff + "x^" + this.exp;
	}
	
	public int getCoeff(){
		return this.coeff;
	}
	
	public int getExp(){
		return this.exp;
	}
}

