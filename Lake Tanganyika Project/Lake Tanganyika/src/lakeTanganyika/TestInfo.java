/**
 *File Name: TestInfo.java 
 *Programmer: Jeffrey Ryan
 *jryan3
 *
 *Date: Oct 10, 2017
 *
 *Class: IT 179
 *Lecture Section 002
 *Lecture Instructor: Tonya Pierce
 */
package lakeTanganyika;

/**
 * <Insert class description here>
 *
 *@author Jeffrey Ryan
 *
 */
public class TestInfo
{
	int[] baseSensors=	{0,1,2,3};
	int[][] advSensors= new int[][] 
		{	
			{10,20,30,40},
			{100,200,300,400}
		};
	int[] historyTest={112,138,142,160,200};
		
	public int getBaseSensor(int sensor){
		return baseSensors[sensor];
	}
	
	public int[] getAdvancedSensor(int sensor){
		return advSensors[sensor];
	}
	public int[] getHistoryTest(){
		return historyTest;
	}
						
}
