package parssing;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;

public class jsoupparssing {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String articleURL = "http://www.ilbe.com/10292553017";
		Document doc = Jsoup.connect(articleURL).get();
		
		Elements ele = doc.select(".replyContent");
		String str = ele.text();
		
String arr[] = str.split(" ");
		
		for(int i =0; i<arr.length ; i++)
		{
		System.out.println(arr[i]);
		}
		
		Scanner a = new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요. : ");
		
		while(a.hasNextLine()){ //다음줄 입력 여부 결정
		
		String msg = a.nextLine(); //키보드 입력
		
		
		if(str.contains(msg)){
			System.out.println("해당 단어가 포함된 댓글이 있습니다.");
			System.out.println("다음 검색할 단어를 입력하세요. : ");
			}
		else{
			System.out.println("해당 단어가 포함된 댓글이 없습니다.");
			System.out.println("검색 결과가 없습니다. 검색할 단어를 입력하세요. : ");
		}				
		}
	
	}

}
