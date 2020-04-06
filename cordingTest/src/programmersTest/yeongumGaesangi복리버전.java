package programmersTest;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class yeongumGaesangi복리버전 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		DecimalFormat formatter = new DecimalFormat("###,###,###,###,###,###,###");
		System.out.println("본인의 생년월일을 입력 YYYYMMDD :");
		String myDay = sc.next();

		int myYear = Integer.parseInt(myDay.substring(0, 4));
		int myMonth = Integer.parseInt(myDay.substring(4, 6));
		int myDate =  Integer.parseInt(myDay.substring(6, 8));
		
		System.out.println("본인이 받고자 하는 연월일 입력 YYYYMMDD :");
		String getDay = sc2.next();
		int getYear = Integer.parseInt(getDay.substring(0, 4));
		int getMonth = Integer.parseInt(getDay.substring(4, 6));
		int getDate =  Integer.parseInt(getDay.substring(6, 8));		

		System.out.println("언제까지 받는걸 계산할지 입력 YYYYMMDD :");
		String whenDay = sc3.next();
		int whenYear = Integer.parseInt(whenDay.substring(0, 4));
		int whenMonth = Integer.parseInt(whenDay.substring(4, 6));
		int whenDate =  Integer.parseInt(whenDay.substring(6, 8));			

		LocalDate born = LocalDate.of(myYear, myMonth, myDate);
		LocalDate today = LocalDate.of(2020, 02, 04);		
		Period between = Period.between(born, today);
		
		System.out.println("");		
		System.out.println("");		
		System.out.println("");		
		System.out.println("");		
		System.out.println("");		

		System.out.println("현재 나이  : " + between.getYears()+"세 "+between.getMonths()+"개월");

		System.out.println("");		

		LocalDate wantDate = LocalDate.of(getYear, getMonth, getDate);
		LocalDate endDate = LocalDate.of(2025, 10, 24);	
		Period between2 = Period.between(wantDate, endDate);

		


		double totalPercent = 100;
		double howMany = (between2.getYears()*12) + (between2.getMonths());
		double monthsMinus = 0;
		
		if(howMany >= 60) {
			System.out.println("만63세까지 : " + between2.getYears()+"년 "+between2.getMonths()+"개월 ,");
			System.out.println("아직 못받음");
		}
		else {
			System.out.println("만63세까지 : " + between2.getYears()+"년 "+between2.getMonths()+"개월 ,");
			System.out.println("             "+howMany+"개월 남음");
			
			monthsMinus = totalPercent - (howMany * 0.5);
			if(monthsMinus >= 100) {
				monthsMinus = 100;				
			}
			System.out.println("원래 금액의 "+monthsMinus+"퍼센트 받을 수 있음");
			
		}
		
		LocalDate nowday = LocalDate.of(getYear, getMonth, getDate);
		LocalDate wanteday = LocalDate.of(whenYear, whenMonth, whenDate);		
		Period between3 = Period.between(nowday, wanteday);
		
		
		
		//받고자 하는 날부터 엔드데이트까지 기간
		LocalDate a = LocalDate.of(getYear, getMonth, getDate);
		LocalDate b = LocalDate.of(whenYear, whenMonth, whenDate);		
		Period c = Period.between(nowday, wanteday);
		
		int d = (c.getYears()*12) + (c.getMonths())  ;
		
		System.out.println("");		
		System.out.println("");		

		int howLongMonth = (between3.getYears()*12) + (between3.getMonths()) ;
		int longYears = between3.getYears();
		System.out.println(whenYear+"년"+whenMonth+"월"+whenDate+"일 까지 받을수 있는 개월 수 : " + howLongMonth + "개월");


	
		
		
		double primeMoney = 449000;
		double fuckMoney = 0;
		
		double bokriMoney = 0; 
		
		long fuckTotalMoney = 0;

		long um=0;
		
		fuckMoney = primeMoney * (monthsMinus/100); 
		System.out.println("");		

		System.out.println("정상 수령 시 원금 월 수령액 :"+ primeMoney);		
		System.out.println("조기 수령 시 월 수령액 :"+ fuckMoney);
		
		for (int i = 0 ; i<howLongMonth; i++) {
	
			bokriMoney =  fuckMoney ;
			for (int j = 0 ; j < 3; i++) {
				
				
			}
			
			if(i%12 ==0) {
				bokriMoney = bokriMoney * 1.01;
			}
			System.out.println(i);

			System.out.println(formatter.format(bokriMoney));
			um += bokriMoney * (monthsMinus/100);
			
		}
		
		System.out.println(formatter.format(bokriMoney));		
		System.out.println(um);		
		System.out.println("");		
	
		System.out.println(whenYear+"년"+whenMonth+"월"+whenDate+"일 까지 예상 총 수령액 :"+ formatter.format(fuckTotalMoney)+"원");

	}
	
}


