package entities;

public class AutomovelBasico extends Automovel{

	private boolean vidros;
	private boolean travasEletricas;
	private boolean bancoRegulagem;
	private boolean sensorEstacionamento;
	
	public AutomovelBasico(String modelo, String cor, String combustivel, boolean vidros, boolean travasEletricas,
			boolean bancoRegulagem, boolean sensorEstacionamento) {
		super(modelo, cor, combustivel);
		
		this.vidros = vidros;
		this.travasEletricas = travasEletricas;
		this.bancoRegulagem = bancoRegulagem;
		this.sensorEstacionamento = sensorEstacionamento;
		
	}

	public boolean isVidros() {
		return vidros;
	}

	public void setVidros(boolean vidros) {
		this.vidros = vidros;
	}

	public boolean isTravasEletricas() {
		return travasEletricas;
	}

	public void setTravasEletricas(boolean travasEletricas) {
		this.travasEletricas = travasEletricas;
	}

	public boolean isBancoRegulagem() {
		return bancoRegulagem;
	}

	public void setBancoRegulagem(boolean bancoRegulagem) {
		this.bancoRegulagem = bancoRegulagem;
	}

	public boolean isSensorEstacionamento() {
		return sensorEstacionamento;
	}

	public void setSensorEstacionamento(boolean sensorEstacionamento) {
		this.sensorEstacionamento = sensorEstacionamento;
	}

	@Override
	public String toString() {
		String result = super.toString();
		if(vidros) {
			result += "\nVidros:"+isVidros();
		}
		if(travasEletricas) {
			result += "\nTravas eletricas:"+isTravasEletricas();
		}
		if(bancoRegulagem) {
			result += "\nBanco regulagem:"+isBancoRegulagem();
		}
		if(sensorEstacionamento) {
			result += "Sensor estacionamento:"+isSensorEstacionamento(); 
		}
	
		return result;
		
	}
	
	
	@Override
	public double quantoCusta(double quantoCusta) {
		if(this.vidros) {
			quantoCusta = quantoCusta + 2200.00;
		}
		if(this.bancoRegulagem) {
			quantoCusta = quantoCusta + 1380.00;
		}
		if(sensorEstacionamento) {
			quantoCusta = quantoCusta + 1812.00;
		}
		
		return quantoCusta;
	}
	
	
}
