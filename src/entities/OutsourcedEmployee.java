package entities;

public class OutsourcedEmployee extends Employee {

	private Double AdditionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		AdditionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return AdditionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		AdditionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + AdditionalCharge * 1.1;
	}

}
