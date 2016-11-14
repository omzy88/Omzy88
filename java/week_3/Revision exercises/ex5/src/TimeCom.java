
public class TimeCom {

	private int hour;
	private int minute;
	private int second;
	
	TimeCom(){
		this.hour = 1;
		this.minute = 1;
		this.second = 1;
	}
	TimeCom(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	//getters and setters
	public void setHour(int hour){
		this.hour = hour;
		if (this.hour > 23 || this.hour < 0){
			this.hour = 0;
		}		
	}
	public void setMinute(int minute){
		this.minute = minute;
		if (this.minute > 59 || this.minute < 0){
			this.minute = 0;
		}
	}
	public void setSecond(int second){
		this.second = second;
		if (this.second > 59 || this.second < 0){
			this.second = 0;
		}
	}
	public int getHour(){
		return this.hour;
	}
	public int getMinute(){
		return this.minute;
	}
	public int getSecond(){
		return this.second;
	}
	
	public String toString(){
		return hour+":"+minute+":"+second; 
	}
	
	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
}
