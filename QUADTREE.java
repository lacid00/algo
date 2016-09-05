import java.util.*;

/*
  * test case
3
xbwwb
xbwxwbbwb
xxwwwbxwxwbbbwwxxxwwbbbwwwwbb
 */
public class QUADTREE {

	static int t,n;
	//static String str;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		
		for(int test_case=0; test_case< t; test_case++){
			String str = sc.next();
			String result = reverse(str);
			System.out.println(" #result: " + result);
		}
	}
	
	static String reverse(String pstr){
		
		String head = pstr.charAt(0)+"";
		
		//System.out.println(" #pstr: " + pstr);
		//System.out.println(" #head: " + head);
		String btm_left ="",btm_right="",upp_left="", upp_right="";
		
		if("b".equals(head) || "w".equals(head)){
			return head;
		}
		
		
		if("x".equals(head)){
			int begin_idx =1;
			upp_left =reverse(pstr.substring(begin_idx));
			begin_idx +=upp_left.length();
			
			upp_right =reverse(pstr.substring(begin_idx));
			begin_idx +=upp_right.length();
			
			btm_left = reverse(pstr.substring(begin_idx));
			begin_idx +=btm_left.length();
			
			btm_right =reverse(pstr.substring(begin_idx));
		}
		return "x"+btm_left+btm_right+upp_left+upp_right;
	}

}
