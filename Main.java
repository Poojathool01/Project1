package mypackage;

public class Main {

	public static void main(String[] args) {
		FileOperations.createMainFolderIfNotPresent("main");
		MenuOptions.printWelcomeScreen("Java Project", "Pooja ");
		HandleOptions.handleWelcomeScreenInput();


	}

}
