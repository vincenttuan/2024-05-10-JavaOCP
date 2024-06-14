package day10;

public class Supervisor extends Manager {
	private double stockOptions;

	public Supervisor() {
		
	}

	public double getStockOptions() {
		return stockOptions;
	}

	public void setStockOptions(double stockOptions) {
		this.stockOptions = stockOptions;
	}

	@Override
	public String toString() {
		return "Supervisor [stockOptions=" + stockOptions + "]";
	}

	
}
