package baselibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import excelutility.dataread_excel;

import waitutility.waitutility;

public class Baselibrary implements waitutility, dataread_excel{
	
	public static WebDriver driver;

	public void getlaunchurl(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Automation_testing\\drivers\\chromedriver.exe");
	               driver = new ChromeDriver();
	               driver.get(url);
	               driver.manage().window().maximize();
	               driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	               
	}

	@Override
	public void explicitwait(WebElement element, int time) {
		// TODO Auto-generated method stub
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
		

	@Override
	public String exceldata(String path, int sheetno, int rowno, int collno) {
		// TODO Auto-generated method stub
		String valu = "";
		
			try {
				FileInputStream File = new FileInputStream(path);
				
				try (XSSFWorkbook wb = new XSSFWorkbook(File)) {
					XSSFSheet Sheet = wb.getSheetAt(sheetno);
					valu=Sheet.getRow(rowno).getCell(collno).getStringCellValue();
				}
		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return valu;
			
		
		
	}
	
	public void getScreenshot(String foldername, String filename) throws IOException{
		
		try {
			String loc = System.getProperty("user.div");
			String filepath = loc +"\\.screenshot\\"+foldername+"\\"+filename+".png";
			
			File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(filepath));
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Issue in Get Screen shot");
		}
			}
	
	public void uploadflil(String path) {
		
		StringSelection fileup = new StringSelection(path);
		Clipboard clipfile = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipfile.setContents(fileup, null);
		
		try {
			Robot roclss = new Robot();
			roclss.delay(250);
			roclss.keyPress(KeyEvent.VK_ENTER);
			roclss.keyRelease(KeyEvent.VK_ENTER);
			roclss.delay(250);
			roclss.keyPress(KeyEvent.VK_CONTROL);
			roclss.keyPress(KeyEvent.VK_V);
			roclss.delay(250);
			roclss.keyRelease(KeyEvent.VK_V);
			roclss.keyRelease(KeyEvent.VK_CONTROL);
			roclss.delay(250);
			roclss.keyPress(KeyEvent.VK_ENTER);
			roclss.keyRelease(KeyEvent.VK_ENTER);
			
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
		
	}

	

