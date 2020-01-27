package exercises;

public class BeginCurrencyConvertorService {
	CurrencyConvertor currencyConvertor = new CurrencyConvertor();
	
	public void begin() {
		beginReadValues();
	}
	
	public void beginReadValues() {
		currencyConvertor.readvalors();
		System.out.printf("Amount to be paid in reais: %.2f",
		currencyConvertor.convertDollarsToReais(currencyConvertor.getDollar(), currencyConvertor.getCotacao()));
	}
}
