	class StringEx {
		public static void main(String[] args) {
			String firstName = "Tom";
			String lastName = "Cruise";
			
			System.out.println(firstName + lastName); //��� TomCruise
			
			int num = 10;
			String number = "10";
			
			System.out.println(num + number); // ���  1010 (����ó��, 20�� �ƴϴ�)
			
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
			
			// ���ٺ��� : ctrl+alt+ȭ��Ű �Ʒ�����
			System.out.println("" + (7 + 7)); // ():�켱���� ������
		}
	}
