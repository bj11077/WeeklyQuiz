import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class TodayQuiz01 {

	public static void main(String[] args) throws IOException {
		
	/*
	 quiz.txt파일의 내용을 한줄씩 읽어서 과일수의 통계를 출력하기
	 ex)  개수  과일
	  	   10, 배 
	 	    5, 배	 --->   배 : 15
	 	    3, 사과
	 	    2, 사과   --->   사과 : 5 	    
	*/
		
		//각 과일의 총합
		int bananaSum = 0;
		int appleSum = 0;
		int pearSum = 0;
		
		
		
		
		//결과 출력
		System.out.println("바나나 : " + bananaSum);
		System.out.println("사과 : " + appleSum);
		System.out.println("배 : " + pearSum);
		
		
		
	}
}
