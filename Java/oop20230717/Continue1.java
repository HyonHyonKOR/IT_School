package oop20230717;

public class Continue1 {

	public static void main(String[] args) {
		// break;      ---> 반복문 빠져 나갈 때 (switch, while, for)
		// continue;      ---> 반복문 빠져 나갈 때 (switch, while, for)
		// 1(이상)~20(이하)까지의 자연수 중 
        // 2의 배수 또는 3의 배수를 "제외한" 자연수 출력
		for(int i = 1; i<= 20; i++){    
		   if(i%2==0 || i%3 ==0) continue;
		   else System.out.println(i);
		}
		
	}

}
