package parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedReader;
import java.util.Scanner;

public class test1 {

	public static void main(String[] arg) throws Exception {
		
		
		
		String articleURL = "http://www.ilbe.com/10292553017";
		Document doc = Jsoup.connect(articleURL).get();
		
		//String title  = doc.title();
		Elements ele = doc.select(".replyContent");
		String str = ele.text();
		
		
		String arr[] = str.split(" ");
		
		for(int i =0; i<arr.length ; i++)
		{
		System.out.println(arr[i]);
		}
		
		Scanner a = new Scanner(System.in);
		System.out.println("�˻��� �ܾ �Է��ϼ���. : ");
		
		while(a.hasNextLine()){ //������ �Է� ���� ����
		
		String msg = a.nextLine(); //Ű���� �Է�
		
		
		if(str.contains(msg)){
			System.out.println("�ش� �ܾ ���Ե� ����� �ֽ��ϴ�.");
			System.out.println("���� �˻��� �ܾ �Է��ϼ���. : ");
			}
		else{
			System.out.println("�ش� �ܾ ���Ե� ����� �����ϴ�.");
			System.out.println("�˻� ����� �����ϴ�. �˻��� �ܾ �Է��ϼ���. : ");
		}				
		}
		/*
		if(str.indexOf("�ù�")>-1)
		{
			int sibal = str.indexOf("�ù�");
			String siball=str.substring(sibal,sibal+2);
			System.out.println("�ش� �ܾ ���Ե� ����� �ֽ��ϴ�.");
			System.out.println("�� :"+ siball);
		
		}*/
		
		
	
		}
	
}




