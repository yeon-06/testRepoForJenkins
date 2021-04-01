package testProject;

import java.util.Arrays;

public class OrderTest {

	public static void main(String[] args) {
		String[] orders = { "ABCFG", "AC", "CDE", "BCFG", "ACDE","ACDEH" };
		int[] cnt = {2,3,4};
		
		String menu = getSingleList(orders);
		
		
	}
	
	public static String getSingleList (String[] orders) {
		String menu = "";
		
		for(String order:orders) {
			String[] single = order.split("");
			for(String s: single) {
				if(!menu.contains(s)) menu+=s;
			}
		} return menu;
	}
	
	// 미완성
	public static int orderCnt (String course, String[] orders) {
		int cnt = 0;
		String[] single = course.split("");
		
		for(String o: orders) {
			for(String s: single) {
				if(!o.contains(s)) break;
			}
		}
		return cnt;
	}
}
