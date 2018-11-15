	class StringEx {
		public static void main(String[] args) {
			String firstName = "Tom";
			String lastName = "Cruise";
			
			System.out.println(firstName + lastName); //결과 TomCruise
			
			int num = 10;
			String number = "10";
			
			System.out.println(num + number); // 결과  1010 (문자처럼, 20이 아니다)
			
			String name = "Ja" + "va";
			String str  = name + 8.0;

			System.out.println(name);
			System.out.println(str);
			System.out.println(7 + " ");
			System.out.println(" " + 7);
			System.out.println(7 + "");
			System.out.println("" + 7);
			System.out.println("" + "");
			System.out.println(7 + 7 + "");
			System.out.println("" + 7 + 7);
			
			// 한줄복사 : ctrl+alt+화살키 아래방향
			System.out.println("" + (7 + 7)); // ():우선순위 연산자
		}
	}
