package qaacademy_selenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasseSelenium {
@Test
	public void testeLogin() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.americanas.com.br/?epar=bp_br_00_go_sch_brand_americanas_202002&utm_medium=buscappc&utm_source=google&utm_campaign=marca:acom%3bmidia:buscappc%3bformato:branding%3bsubformato:00%3bidcampanha:sch_brand_americanas_202002&opn=YZMEZP&WT.srch=1&gclid=CjwKCAjwz_WGBhA1EiwAUAxIcdT0_pYqx3HHW3wec0oXPDRkDdzPx6SHp2gAaDaXFbOc8udInH1hbBoCndoQAvD_BwE");
		
	}
	
}
