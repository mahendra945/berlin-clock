package com.ubs.opsit.interviews;

public class TimeUtils {

	/** Util method to get seconds for Berlin Clock.
	 * @param seconds
	 * @return seconds in O or Y 
	 */
	public static String getSeconds(String seconds) {
		
		int intSeconds = Integer.valueOf(seconds);
		
		if (intSeconds % 2 == 0)
			return "Y";
		else
			return "O";
	}

	/** Util method to get hours from hour top line for Berlin Clock.
	 * @param hours
	 * @return Hours for top line
	 */
	public static String getTopLineHours(String hours) {
		int intHours = Integer.valueOf(hours);
		return getLampOnOffFlag(4, getTopNumberOfOnSigns(intHours));
	}

	/** Util method to get hours from hour bottom line for Berlin Clock.
	 * @param hours
	 * @return Hours for bottom line
	 */
	public static String getBottomLineHours(String hours) {
		
		int intHours = Integer.valueOf(hours);
		return getLampOnOffFlag(4, intHours % 5);
	}

	/** Util method to get hours from first top line for Berlin Clock.
	 * @param minutes
	 * @return Minutes for top line
	 */
	public static String getTopLineMinutes(String minutes) {
		
		int intMinutes = Integer.valueOf(minutes);
		return getLampOnOffFlag(11, getTopNumberOfOnSigns(intMinutes), "Y").replaceAll("YYY", "YYR");
	}

	/** Util method to get hours from first top line for Berlin Clock.
	 * @param minutes
	 * @return Minutes for bottom line
	 */
	public static String getBottomLineMinutes(String minutes) {
		
		int intMinutes = Integer.valueOf(minutes);
		return getLampOnOffFlag(4, intMinutes % 5, "Y");
	}

	/**  Util method to get On/Off Flag with R signs
	 * @param lamps
	 * @param onSigns
	 * @return On/Off in R sign
	 */
	private static String getLampOnOffFlag(int lamps, int onSigns) {
		return getLampOnOffFlag(lamps, onSigns, "R");
	}

	/** Util method to get On/Off Flag with R/Y signs
	 * @param lamps
	 * @param onSigns
	 * @param onSign
	 * @return On/Off in R/Y signs
	 */
	private static String getLampOnOffFlag(int lamps, int onSigns, String onSign) {
		String out = "";
		for (int i = 0; i < onSigns; i++) {
			out += onSign;
		}
		for (int i = 0; i < (lamps - onSigns); i++) {
			out += "O";
		}
		return out;
	}

	/** Util method to get On Flag counts
	 * @param number
	 * @return no of On Signs
	 */
	private static int getTopNumberOfOnSigns(int number) {
		return (number - (number % 5)) / 5;
	}

}
