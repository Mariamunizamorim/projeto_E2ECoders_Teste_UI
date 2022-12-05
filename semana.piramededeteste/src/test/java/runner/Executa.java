package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import pages.Browser;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "steps",
		tags = "@executa",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/report-cucumber.html", "json:target/report.json"},
		snippets = SnippetType.CAMELCASE
		
)

public class Executa extends Browser{
	
	@AfterClass
	public static void fecharNavegador() {
		adriver().quit();
		System.out.println("---------- Teste Finalizado ---------");
	}
	
	

}
