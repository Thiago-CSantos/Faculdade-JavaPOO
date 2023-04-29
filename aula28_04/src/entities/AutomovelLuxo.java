package entities;

public class AutomovelLuxo extends Automovel{
	
	private boolean tetoSolar;
	private boolean cambioAutomatico;
	private boolean bancoCouro;
	
	public AutomovelLuxo(String modelo, String cor, String combustivel, boolean tetoSolar, boolean cambioAutomatico,
			boolean bancoCouro) {
		super(modelo, cor, combustivel);
		
		this.tetoSolar = tetoSolar;
		this.cambioAutomatico = cambioAutomatico;
		this.bancoCouro = bancoCouro;
	}

	public boolean isTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(boolean tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public boolean isCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}

	public boolean isBancoCouro() {
		return bancoCouro;
	}

	public void setBancoCouro(boolean bancoCouro) {
		this.bancoCouro = bancoCouro;
	}
	
	
	@Override
	public String toString() {
		String result = super.toString();
		if(tetoSolar) {
			result += "\nTeto solar:"+isTetoSolar();
		}
		if(cambioAutomatico) {
			result += "\nCambio automatico:"+isCambioAutomatico();
		}
		if(bancoCouro) {
			result += "\nBanco couro:"+isBancoCouro();
		}
		
		return result;
		
	}
	
	@Override
	public double quantoCusta(double quantoCusta) {
		if(this.tetoSolar) {
			quantoCusta = quantoCusta + 4800;
		}
		if(this.cambioAutomatico) {
			quantoCusta = quantoCusta + 3500;
		}
		if(this.bancoCouro) {
			quantoCusta = quantoCusta +3000;
		}
		return quantoCusta;
	}
	
}
