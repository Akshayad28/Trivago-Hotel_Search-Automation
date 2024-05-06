package Automation.HotelBooking;

import org.openqa.selenium.By;



public class xpaths{





                public static final By SignIn  = By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/header/nav/ul/li[3]/div/button/span[2]/span");

                public static final By EmailID  = By.xpath("//input[@id='email']");
                public static final By Password  = By.xpath("//input[@id='password']");
                public static final By ContinueButton  = By.xpath("//*[@type='submit']");
                //button[@data-testid='search-form-calendar-checkin']    date

                public static final By DATE  = By.xpath("//*[@data-testid='search-form-calendar-checkin']");

                public static final By Destination = By.xpath("//input[@id='input-auto-complete']");  

                public static final By NextMonth = By.xpath("//*[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span"); 

                public static final By AdultCount = By.xpath("//input[@data-testid='adults-amount']"); 
                public static final By ChildCount = By.xpath("//input[@data-testid='children-amount']"); 
                public static final By RoomCount = By.xpath("//input[@data-testid='rooms-amount']"); 
                public static final By ApplyBTN = By.xpath("//*[@data-testid='guest-selector-apply']"); 
                
                  public static final By HotelName =By.xpath("//*[@class='item-name_button__1e5cV truncate_truncate__vCzPM']/span");
                  public static final By Type = By.xpath("//*[@data-testid='accommodation-type']"); 
                  public static final By Distance = By.xpath("//*[@class='block text-left w-11/12 text-m']"); 
                  public static final By Rating = By.xpath("//*[@class='leading-none']/span"); 
                  public static final By Reviews = By.xpath("//span[contains(text(), 'reviews')]");                   
                  public static final By BookingSite1 = By.xpath("//*[@class='text-s leading-tight advertiser-name-placeholder']");
                  public static final By Prices = By.xpath("//*[@class='Price_price__gzSVe Price_large__cM2EH Price_bold__cJ2IU']");
                  public static final By TotalStayPrice = By.xpath("//*[@class='PriceSubtitle_priceSubtitleLabel__n44j7']");
                  public static final By BookingSite2 = By.xpath("//*[@class='font-bold truncate']");
                  public static final By OtherPrices = By.xpath("//*[@class='Price_price__gzSVe Price_medium__lZwKi Price_bold__cJ2IU']");
                  public static final By StayPrice = By.xpath("//*[@data-testid='price-label']//span[3]");                
                  public static final By BookingSite3 = By.xpath("//*[@class='truncate font-bold']");
                  public static final By OtherPrices2 = By.xpath("//*[@data-testid='cheapest-price-label']//span/span/span");
                  public static final By StayPrice2 = By.xpath("//*[@data-testid='cheapest-price-label']//span[3]"); 
                
                  
                  
                  
               

                  //*[@class='font-bold truncate']

                  //*[@class='truncate font-bold']
                  //*[@class='pt-1/2 LowestPriceLabel_labelWidthWithIcon__4ORTd']/span/span/span


                 


}
