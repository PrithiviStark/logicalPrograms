package com.qspider.mockTest;
class MyTime
{
	int hour;
	int minute;
	int second;
	MyTime(int hour, int minute, int second) 
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}	
}
public class TimeCalculator
{
	static int totalTimeInSeconds(MyTime time)
	{
		int total=time.second+time.minute*60+time.hour*60*60;
		return total;
	}
	public static void main(String[] args)
	{
		MyTime time1=new MyTime(9, 0, 0);
		MyTime time2=new MyTime(7, 30, 0);
		int time1Total=totalTimeInSeconds(time1);
		int time2Total=totalTimeInSeconds(time2);
		int diff= time1Total>time2Total ? time1Total-time2Total : time2Total-time1Total;
		int hours=diff/3600;
		int mins= diff/60;
		int secs=diff%60;
		if(mins>60)
		{
			int temp=mins/60;
			mins=mins-60*temp;
		}
		
		System.out.println(hours+" "+mins+" "+secs);
	}
}
