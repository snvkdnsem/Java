import java.util.*; // ScannerŬ������ ����ϱ� ���� �߰�

class FlowEx2 {
	public static void main(String[] args) {  
		int input;

		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");	
		}

		if(input!=0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�."); // if�� �߰�ȣ ��� �����ݷ� ���������� Ȱ�� ����		
			System.out.println("�Է��Ͻ� ���ڴ� "+ input +"�Դϴ�."); // ���� ���ǰ� ������� �׳� �����°��̴�.
	
			some();
			
	} // main�� ��
	
	static void some() {
		if(true) { // �׻� true �̴ϱ� ���� if�� �Ƚᵵ �ȴ�.
			System.out.println("Hello");
		}
		
		if(true) {
			System.out.println("World!");
		}
	}
}