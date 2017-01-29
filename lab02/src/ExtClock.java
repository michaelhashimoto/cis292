// Class ExtClock
//   The purpose of this class is to add functionality to the Clock class by
//   adding methods to deal with the time zone

public class ExtClock extends Clock
{

	private int _zone; // store time zone

	// Contructor that includes the time zone
	public ExtClock(int hours, int minutes, int seconds, int zone) throws Exception
	{
		super(hours, minutes, seconds);

		setZone(zone);
	}

	// Contructor that excludes the time zone, it will assign a default time zone of UTC+0
	public ExtClock(int hours, int minutes, int seconds) throws Exception
	{
		this(hours, minutes, seconds, 0);
	}

	// Contructor that uses all default values
	public ExtClock() throws Exception
	{
		this(0, 0, 0, 0);
	}

	// Method to change the time zone, and adjust the hours accordingly
	public void changeZone(int zone) throws Exception
	{
		int hoursAdjustment = zone - _zone;

		_adjustHours(hoursAdjustment);

		setZone(zone);
	}

	// Method to get the current time zone
	public int getZone(int zone)
	{
		return _zone;
	}

	// Method to set the time zone, there are is some protection against an invalid value
	public void setZone(int zone) throws Exception
	{
		if ((zone < -12) || (zone > 12)) {
			throw new Exception("Invalid zone value " + _zoneToString(zone));
		}

		_zone = zone;
	}

	// Method that extends Clock#toString() method to include the time zone
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append(" " + _zoneToString(_zone));

		return sb.toString();
	}

	// PRIVATE Method to adjust the hours according to a particular time adjustment
	private void _adjustHours(int hoursAdjustment)
	{
		int hour = getHours() + hoursAdjustment;

		if (hour < 0) {
			hour += 24;
		}
		else if (hour > 23)
		{
			hour -= 24;
		}

		setTime(hour, getMinutes(), getSeconds());
	}

	// PRIVATE Method to get a formatted time zone for printing
	private String _zoneToString(int zone)
	{
		if (_zone >= 0) {
			return "UTC+" + zone;
		}

		return "UTC" + zone;
	}

}
