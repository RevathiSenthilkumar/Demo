package samples;

import org.openqa.selenium.By;

import com.example.BaseUI;

public class BrowserCommands extends BaseUI {
	// static WebDriver driver;

	static By subject = By.id("subject");
	static By marketing = By.name("email_to[]");
	static By email = By.id("email");
	static By name1 = By.name("q1");
	static By name2 = By.name("q2");
	static By dropdown = By.id("q3");

	static By name5 = By.name("q5");
	static By date = By.id("ui-datepicker-div");
	static By datemonthyear = By.cssSelector("input#q7");

	static By na4 = By.xpath("//input[@value='Third Option']");
	static By na5 = By.xpath("//input[@value='Fourth Option']");
	static By sales = By.xpath("//input[@value='1']");
	static By states = By.xpath("//select[@id='q8']//option[@value='WA']");
	static By country = By.xpath("//select[@id='q9']//option[@value='India']");
	static By canadian = By.xpath("//select[@id='q10']//option[@value='Northwest Territories']");
	static By multichoice1 = By.xpath("//input[@value='First Check Box']");
	static By multichoice4 = By.xpath("//input[@value='Fourth Check Box']");
	static By multichoice5 = By.xpath("//input[@value='Fifth Check Box']");
	static By gender = By.xpath("//select[@value='Ms.']");
	static By firstName = By.name("q11_first");
	static By lastName = By.name("//*[@id=\'contactForm\']/table/tbody/tr[14]/td/input[3]");
	// By.cssSelector("input[name=q11_last]");
	static By photo = By.id("attach4589");
	static By verificationImg = By.xpath("//*[@id='verification_image']");
	static By verification = By.xpath("//*[@id='visver_code]");
	//// *[@id="visver_code"]
	static By radioButton = By.xpath("//*[@id='q4']");
	static By check_button = By.xpath("//input[@type='checkbox']");
	static By textbox = By.xpath("//input[@type='text']");
	static By img = By.xpath("//*[@id=\'right_col_bottom\']/img");
	static By month = By.xpath("//select[@name='q12_month']//option[@value='9']");
	static By date12 = By.xpath("//select[@name='q12_day']//option[@value='12']");
	static By year = By.xpath("//select[@name='q12_year']//option[@value='2003']");
	static By uploadfile = By.xpath("//*[@id='attach4589']");
	static By tagname = By.tagName("select");
	///// select
	static By submit = By.xpath("//input[@name='submit']");

	public static void main(String[] args) {
		driver = BrowserConfiguration.browserSetup("https://www.google.com");

		driver.navigate().to("https://www.mycontactform.com");

		driver.findElement(By.linkText("Sample Forms")).click();
		ClickMultiAnswer(radioButton);
		ClickMultiAnswer(check_button);
		ClickMultiAnswer(textbox);
		ClickMultiAnswer(img);
		clicking(marketing);
		clicking(sales);
		sendtexttofield(subject, "reva");

		sendtexttofield(email, "krish@gmail.com");
		sendtexttofield(name1, "Event Calender");
		sendtexttofield(name2, "Hello EV-ER-Y-ONE!!! This event is not" + " reserved for only our kids and " + ""
				+ "I’d LOVE to see all of your faces  ");

		dropdown(dropdown, "Third Option");
		clicking(na4);
		clicking(na5);
		sendtexttofieldDate(datemonthyear, "04-14-2023");
		clicking(multichoice1);
		clicking(multichoice4);
		clicking(multichoice5);

		clicking(states);
		clicking(country);
		clicking(canadian);
		clicking(month);
		clicking(date12);
		clicking(year);
		ClickMultiAnswer(tagname);

		sendtexttofieldDate(firstName, "Revathi");
		sendtexttofield(lastName, "Senthil");
		sendtexttofieldDate(verification, "04-14-2023");
		sendtexttofield(uploadfile,
				"C:\\Users\\revat\\JavaWorkspace\\SeleniumDemos\\src\\test\\java\\downloadrose.png");
		System.out.println();
		// sendtexttofieldDate(verification);
		// xx1(submit);
		close();

	}

}

//xx1( multichoice4);  //input[@name='submit']
// xx1( multichoice5);

//sendtexttofield(photo, "\"C:\\Users\\revat\\Downloads\\downloadrose.jfif\"");

//.browserSetup("https://www.google.com");
//static By datePicker = By.className("ui-state-default ui-state-active");
// static By MonthPicker = By.className("ui-datepicker-month");
// static By yearPicker = By.className("ui-datepicker-year");
/*
 * //checkbox static By checkbox= By.cssSelector("input[value='checkbox']");
 * static By multichoice1= By.cssSelector("input[value='First Check Box']");
 * static By multichoice4= By.cssSelector("input[value='Fourth Check Box']");
 * static By checkbox= By.xpath("input[value='checkbox']");
 * //driver.findElement() Fifth Check Box
 */
