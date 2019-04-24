/**
 *File Name: Language.java 
 *Programmer: Jeffrey Ryan
 *jryan3
 *
 *Date: Sep 25, 2017
 *
 *Class: IT 179
 *Lecture Section 002
 *Lecture Instructor: Tonya Pierce
 */
package lakeTanganyika;

/**
 * This class gives the displayed text but it will change the language if the language is changed
 *
 *@author Jeffrey Ryan
 *
 */
public class Language
{
	
	public void getInfoItem(InfoBox self){
		//this is the outter switch statement and it goes based on the selected language. It can easily add more languages if necessary.
		switch(self.getLanguage()){
		//This is one of the inner switch statements. After the language is selected it finds the permaTitle of the infoBox and fills in
		//all the info in the newly selected language
		case("English"):
			switch(self.getPermaTitle()){
				//All case statements are nearly identical. Once the InfoBox is identified the case statement will change the necessary variables
				case("Air Temperature"):
					self.setTitle("Air Temperature");
					self.setDetails("This is Air temperature details");
					break;
				case("Dissolved Oxygen Concentration"):
					self.setTitle("Dissolved Oxygen Concentration");
					self.setDetails("This is Dissolved Oxygen Concentration details");
					break;
				case("Water Temperature"):
					self.setTitle("Water Temperature");
					self.setDetails("This is Water Temperature details");
					break;
				case("Precipitation Intensity"):
					self.setTitle("Precipitation Intensity");
					self.setDetails("This is Precipitation Intensity details");
					break;
				case("Barometric Pressure"):
					self.setTitle("Barometric Pressure");
					self.setDetails("This is Barometric Pressure details");
					break;
				case("Wind Speed"):
					self.setTitle("Wind Speed");
					self.setDetails("This is Wind Speed details");
					break;
				default:
					System.out.println("Error in the English switch statement in the language class");
				break;
					
			}
			break;
			
		//if language is Swihili...
		case("Swihili"):
			switch(self.getPermaTitle()){
			case("Air Temperature"):
				self.setTitle("SHVAir Temperature");
				self.setDetails("SHVThis is Air temperature details");
				self.setDetailHideLabel("SHVHide Details");
				self.setDetailLabel("SHVDetails");
				break;
			case("Dissolved Oxygen Concentration"):
				self.setTitle("SHVDissolved Oxygen Concentration");
				self.setDetails("SHVThis is Dissolved Oxygen Concentration details");
				break;
			case("Water Temperature"):
				self.setTitle("SHVWater Temperature");
				self.setDetails("SHVThis is Water Temperature details");
				break;
			case("Precipitation Intensity"):
				self.setTitle("SHVPrecipitation Intensity");
				self.setDetails("SHVThis is Precipitation Intensity details");
				break;
			case("Barometric Pressure"):
				self.setTitle("SHVBarometric Pressure");
				self.setDetails("SHVThis is Barometric Pressure details");
				break;
			case("Wind Speed"):
				self.setTitle("SHVWind Speed");
				self.setDetails("SHVThis is Wind Speed details");
				break;
			default:
				System.out.println("Erorr in the Swihili switch statement in language class");
				break;
				
			}
		default:
			System.out.println("Error in language class. langugage variable is not 'English' or 'Swihili'");
		
		break;
		
		
		}
		
	}
}
