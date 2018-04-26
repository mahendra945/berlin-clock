package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		
		String timeParts[] = aTime.split(":");
		
		return TimeUtils.getSeconds(timeParts[2])+"\r\n"
			   + TimeUtils.getTopLineHours(timeParts[0])+"\r\n"
			   + TimeUtils.getBottomLineHours(timeParts[0])+"\r\n"
			   + TimeUtils.getTopLineMinutes(timeParts[1])+"\r\n"
			   + TimeUtils.getBottomLineMinutes(timeParts[1]);
	}

}
