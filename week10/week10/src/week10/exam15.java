package week10;

import java.util.Arrays;

public class exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String[] tmp = Arrays.copyOf(args, args.length);
		System.out.print("tmp 배열에 저장된 내용은"+Arrays.toString(tmp)+"입니다.");
		
		for(int i = 0; i < args[0].length(); i++) {
			if(args[0].charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("모두"+count+"개의 단어가 있습니다.");
		Arrays.sort(tmp);
		System.out.println("======After Sort======");
		System.out.println(Arrays.toString(tmp));
		
		/*
		for(int i = 0 ; i < args[0].length(); i++) {
			char tmpchar = args[0].charAt(i);
			if(tmpchar == ",")
				count++;
		}
		System.out.print("모두"+count+"개의 단어가 있습니다.");
		*/
		/*
		for(int i = 0; i < args[0].length(); i++) {
			if(args[0].charAt(i) == ',')
				count++;
		}
		System.out.println("모두"+count+"개의 단어가 있습니다.");
		*/
	}

}
