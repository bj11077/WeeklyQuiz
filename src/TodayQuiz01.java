import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class TodayQuiz01 {

	public static void main(String[] args) throws IOException {
		
	/*
	 quiz.txt파일을 읽어서 과일수의 통계를 answer.txt로 저장하기
	 ex)  개수  과일
	  	   10, 배 
	 	    5, 배	 --->   배 15개
	*/
		//파일경로설정
		File file02 = new File("");
		
		// 프로젝트절대경로가져오기
		String AbPath = file02.getAbsolutePath();
		
		File file = new File(AbPath+"\\quiz.txt");
		System.out.println(AbPath);
		
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fileReader);
		
		String[] compare = null;
		
		String line = "";
		int bananaSum = 0;
		int appleSum = 0;
		int pearSum = 0;
		while((line = br.readLine()) != null) {
			compare = line.split(",");
			switch (compare[1]) {
			case "바나나":
					bananaSum += Integer.parseInt(compare[0]);
				break;
			case "사과":
				appleSum += Integer.parseInt(compare[0]);
				break;
			
			case "배":
				pearSum += Integer.parseInt(compare[0]);
				break;
			}
		}
		
		System.out.println("바나나 : " + bananaSum);
		System.out.println("사과 : " + appleSum);
		System.out.println("배 : " + pearSum);
		
		
		
	}
}
