package com.multicampus.custmgr;

import java.util.Scanner;

public class custMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CustomerModel model = CustomerModel.getInstance();
		CustomerView view = new CustomerView();
		CustomerController controller = new CustomerController(model,view,scan);
		String menu;

		while (true) {
			controller.menuSelect();
			menu = scan.next();
			menu = menu.toLowerCase(); // 입력한 문자열을 모두소문자로 변환

			switch (menu.charAt(0)) {
			case 'i':
				System.out.println("고객정보 입력을 시작합니다.");
				controller.insertCustomerData();
				System.out.println("고객정보를 저장했습니다.");
				break;
			case 'p':
				System.out.println("이전 데이터를 출력합니다.");
				if (controller.index <= 0) {
					System.out.println("이전 데이터가 존재하지 않습니다.");
				} else {
					controller.index--;
					controller.printCustomerData();
				}
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if (controller.index >= controller.count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				} else {
					controller.index++;
					controller.printCustomerData();
				}
				break;
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if ((controller.index >= 0) && (controller.index < controller.count)) {
					controller.printCustomerData();
				} else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if ((controller.index >= 0) && (controller.index < controller.count)) {
					System.out.println(controller.index + "번째 데이터를 수정합니다.");
					controller.updateCustomerData();
				} else {
					System.out.println("수정할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if ((controller.index >= 0) && (controller.index < controller.count)) {
					System.out.println(controller.index + "번째 데이터를 삭제합니다.");
					controller.deleteCustomerData();
				} else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 's':
				if (controller.count <= 0) {
					System.out.println("데이터가 없습니다.");
				} else {
					controller.specificCustomer();
				}
				break;
			case 'q':
				System.out.println("저장중..");
				controller.saveCustomerData();
				System.out.println("프로그램을 종료합니다.");
				scan.close(); // Scanner 객체를 닫아준다.
				System.exit(0); // 프로그램을 종료시킨다.
				break;
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
			}// end switch

		} // end while

	}// end main

}// end class