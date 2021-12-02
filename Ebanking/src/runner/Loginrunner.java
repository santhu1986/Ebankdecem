package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"E:\\MrngNovSel\\Ebanking\\src\\feature\\Login.feature",
                          "E:\\MrngNovSel\\Ebanking\\src\\feature\\Role.feature"},
                                glue="stepdefination",monochrome=true,
                  plugin= {"pretty","json:Target/Report/Role.json"})
public class Loginrunner 
{

}