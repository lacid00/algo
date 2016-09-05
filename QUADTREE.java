import java.util.*;
/*
4
w
xbwwb
xbwxwbbwb
xxwwwbxwxwbbbwwxxxwwbbbwwwwbb

w
xwbbw
xxbwwbbbw
xxwbxwwxbbwwbwbxwbwwxwwwxbbwb
 */

class QUADTREE {

	static int t,n;
	//static String str;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		sc.nextLine();
		for(int test_case=0; test_case< t; test_case++){
			String str = sc.nextLine();
			System.out.println( reverse(str));
		}
	}
	
	static String reverse(String pstr){
		String btm_left = new String() ;
		String btm_right = new String() ;
		String upp_left = new String();
		String upp_right = new String();
		
		if('x' != pstr.charAt(0) ){
			return pstr.charAt(0)+"";
		}else{
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
