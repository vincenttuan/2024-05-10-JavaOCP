package day10;

public class Supervisor extends Manager {
	private double stockOptions;

	public Supervisor() {
		System.out.println("建立 Supervisor 物件");
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
