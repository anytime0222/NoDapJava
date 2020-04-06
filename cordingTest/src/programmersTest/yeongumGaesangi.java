package programmersTest;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class yeongumGaesangi {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
				
		LocalDate born = LocalDate.of(1962, 10, 24);
		LocalDate today = LocalDate.of(2020, 02, 04);		
		Period between = Period.between(born, today);

		
		System.out.println("언제까지 받는걸 계산할지 입력 YYYYMMDD :");		

		LocalDate nowday = LocalDate.of(2025, 10, 25);
		LocalDate wanteday = LocalDate.of(2026, 12, 25);		
		Period between3 = Period.between(nowday, wanteday);
		
		System.out.println("");		
		System.out.println("");		
		System.out.println("");		
		System.out.println("");		
		System.out.println("");		

		System.out.println("현재 나이  : " + between3.getYears()+"세 "+between3.getMonths()+"개월");
	  
	}
	
}


