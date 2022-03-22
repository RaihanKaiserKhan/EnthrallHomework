package hw15_part_01_Xpath;

public class Xpath {
	/*
	 * 1) Tag with a single attribute (https://www.prothomalo.com/)
	 *  //span[@class='content']
	 *  //img[@width='260']
	 *  //div[@class='hamburger hamburger-m__hamburger__2Oc5s']
	 *  //div[@class='uniformHeader-m__bell-container__2ZKnl uniformHeader-m__new-notifications-data__ZG-72']
	 *  //img[@class='login-m__palo-logo__-7QHx gm-observing gm-observing-cb']
	 *   
	 * 2) Tag with multiple attribute with 'or' logic(https://www.chase.com/)
	 *  
	 *   //input[@id='userId-text-input-field' or @name='userId' ]
	 *   //input[@id='password-text-input-field' or @name='password']
	 *   //input[@class='checkbox__input' or @id='input-rememberMe']
	 *   //a[@aria-label=' Forgot username/password? ' or @id='forgotPassword']
	 *   //a[@class='chaseanalytics-track-link' or @href='"https://locator.chase.com/?locale=en_US']
	 *     
	 *    
	 * 3)Tag with multiple attribute with 'and' logic (https://www.prothomalo.com/)
	 *   
	 *  //img[@width='260' and @height='65']
	 *  //img[@class='i-amphtml-fill-content i-amphtml-replaced-content' and @src='https://tpc.googlesyndication.com/daca_images/simgad/7211493721102863931' ]
	 *  //img[@class='login-m__palo-logo__-7QHx gm-observing gm-observing-cb' and @loading='lazy']
	 *  //img[@class='logo-style' and @src='https://read.pavscores.com/team_img/pusti.png' ]
	 *  //a[@class='storytitleInfo-m__sub-section-name__1SF6a' and @href='https://www.prothomalo.com/sports/cricket']
	 *    
	 *4)Tag with inner text [complete text] (https://www.chase.com/)
	 *  //span[text()='Sign in']
	 *  //p[text()='Refer friends now']
	 *  //a[text()='Use token']
	 *  //span[text()='Show Navigation Menu']
	 *  //span[text()=' Opens home page in the same window.'] 
	 *    
	 *5) Tag with partial inner text or use of  contains()method:(https://www.chase.com/)
	 *   //span[contains(text(),'Sign ')]
	 *   //p[contains(text(),'Refer friends now')]
	 *   //a[contains(text(),'Us')]
	 *   //span[contains(text(),'Show ')]
	 *   //span[contains(text(),' Opens h')]
	 *    
	 *6) Tag with attributes and use of contains: (https://www.chase.com/)
	 *  //a[contains(@class,'btn cta cta--primary cta--large')]
	 *  //a[contains(@class,'link-anchor ')]
	 *  //input[contains(@id,'us')]
	 *  //div[contains(@class,'primary-item-icon icon-b')]
	 *  //a[contains(@class,'chaseanalytics-track-link button c')]
	 *    
	 *7) Using Normalize space method -- eliminates leading and trailing spaces. (https://www.chase.com/)
	 *  //a[normalize-space(text())='Credit Cards']
	 *  //p[normalize-space(text())='Checking & Savings']
	 *  //a[normalize-space(text())='Home Loans']
	 *  //a[normalize-space(text())='Auto']
	 *  //a[normalize-space(text())='Investing by J.P. Morgan']
	 *    
	 *8) Starts-with() by text (https://www.chase.com/)
	 *  //span[starts-with(text(),'Sign in')]
	 *  //p[starts-with(text(),'Earn up to $500 cash ')]
	 *  //p[starts-with(text(),'Refer ')]
	 *  //a[starts-with(text(),'Us')]
	 *  //span[starts-with(text(),' Opens h')]
	 *    
	 *9) Starts-with() with attribute: (https://www.chase.com/)
	 *  //a[starts-with(@class,'btn cta cta--primary cta--large')]
	 *  //a[starts-with(@class,'link-anchor ')]
	 *  //input[starts-with(@id,'u')]
	 *  //div[starts-with(@class,'primary-item-icon icon-b')]
	 *  //a[starts-with(@class,'chaseanalytics-track-link button c')]   
	 */
}
