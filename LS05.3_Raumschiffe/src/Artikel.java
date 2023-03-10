
public class Artikel {
	private String bezeichnung;
	private int nummer;
	private double einkaufspreisInEuro;
	private double verkaufspreisInEuro;
	private int sollBestand;
	private int istBestand;
	
	public Artikel() {}
	
	public void bestellen() 
	{
		if(this.istBestand < this.sollBestand*0.8)
		{
			System.out.println("Es wird nachbestellt!");
			this.istBestand = this.sollBestand;
		}
		else
		{
			System.out.println("Der Bestand von "+this.bezeichnung+" ist noch oder gleich über 80%!");
		}
	}
	
	public double gewinnBerechen()
	{
		return (this.verkaufspreisInEuro - this.einkaufspreisInEuro)*this.istBestand;
	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public int getNummer() {
		return nummer;
	}
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	public double getEinkaufspreisInEuro() {
		return einkaufspreisInEuro;
	}
	public void setEinkaufspreisInEuro(double einkaufspreisInEuro) {
		this.einkaufspreisInEuro = einkaufspreisInEuro;
	}
	public double getVerkaufspreisInEuro() {
		return verkaufspreisInEuro;
	}
	public void setVerkaufspreisInEuro(double verkaufspreisInEuro) {
		this.verkaufspreisInEuro = verkaufspreisInEuro;
	}
	public int getSollBestand() {
		return sollBestand;
	}
	public void setSollBestand(int sollBestand) {
		this.sollBestand = sollBestand;
	}
	public int getIstBestand() {
		return istBestand;
	}
	public void setIstBestand(int istBestand) {
		this.istBestand = istBestand;
	}
	
	@Override
	public String toString() {
		return "Artikel [bezeichnung=" + bezeichnung + ", nummer=" + nummer + ", einkaufspreisInEuro="
				+ einkaufspreisInEuro + ", verkaufspreisInEuro=" + verkaufspreisInEuro + ", sollBestand=" + sollBestand
				+ ", istBestand=" + istBestand + "]";
	}
}
