package services;


import controllers.AccountController;

public class Initialize {
	Menu menu  = new Menu();
	AccountController controller = new AccountController();
	
	public void begin() {
		initializeMenu();
	}
	
	public void initializeMenu() {
		int opcao = 0;
		do {
			opcao = menu.getOpcao();
			switch(opcao) {
			case 1:
				controller.createAccount();
				break;
			case 2:
				controller.alterAccount();
				break;
			case 3:
				controller.deleteAccount();
				break;
			case 4:
				controller.seeAccount();
				break;
			case 5:
				controller.depositAccount();
				break;
			case 6:
				controller.withdrawAccount();
				break;
			default: break;
			}
		}while(opcao != 7);
	}
	
}
