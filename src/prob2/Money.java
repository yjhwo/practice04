package prob2;

public class Money {
	private int amount;
	
    public Money(int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add( Money money ) {
    	return new Money(amount + money.getAmount());
    }
	
    public Money minus( Money money ) {
    	return new Money(amount - money.getAmount());
    }
    
    public Money multiply( Money money ) {
    	return new Money(amount * money.getAmount());
    }
    
    public Money devide( Money money ) {
    	return new Money(amount / money.getAmount());
    }
    
	@Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    

}
