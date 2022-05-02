import java.util.*;

public class ContactList {

	private String name;

	public ContactList (String name) {
		this.name = name;
	}

	public String displayContactList() {
		String toReturnContact = "\n+--------------------------------+" + "\n" + "|            CONTACTS          	 |" + "\n" + "+--------------------------------+";
		String toReturn = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < alphabet.length();i++) {
			char c = alphabet.charAt(i);
			if (c == name.charAt(name.indexOf(" ") + 1)) {
				toReturn += "\n+--------------------------------+" + "\n" + "|" + " " + name.charAt(name.indexOf(" ") + 1) + ":" + "                            |" + "\n" + "+--------------------------------+";
				toReturn += "\n" + " " + name + " ";
			}
		}
		return toReturnContact + toReturn;
	}

	public String toString() {
		String toReturn = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < alphabet.length();i++) {
			char c = alphabet.charAt(i);
			if (c == name.charAt(name.indexOf(" ") + 1)) {
				toReturn += "\n+--------------------------------+" + "\n" + "|" + " " + name.charAt(name.indexOf(" ") + 1) + ":" + "                            |" + "\n" + "+--------------------------------+";
				toReturn += "\n" + " " + name + " ";
			}
		}
		return toReturn;
	}
}

// toReturnContact = "\n+--------------------------------+" + "\n" + "|            CONTACTS          	 |" + "\n" + "+--------------------------------+";
// toReturnA = "\n+--------------------------------+" + "\n" + "| A:                            |" + "\n" + "+--------------------------------+";
// toReturnB = "\n+--------------------------------+" + "\n" + "| B:          					 |" + "\n" + "+--------------------------------+";
// toReturnC = "\n+--------------------------------+" + "\n" + "| C:          					 |" + "\n" + "+--------------------------------+";
// toReturnD = "\n+--------------------------------+" + "\n" + "| D:          					 |" + "\n" + "+--------------------------------+";
// toReturnE = "\n+--------------------------------+" + "\n" + "| E:          					 |" + "\n" + "+--------------------------------+";
// toReturnF = "\n+--------------------------------+" + "\n" + "| F:          					 |" + "\n" + "+--------------------------------+";
// toReturnG = "\n+--------------------------------+" + "\n" + "| G:          					 |" + "\n" + "+--------------------------------+";
// toReturnH = "\n+--------------------------------+" + "\n" + "| H:          					 |" + "\n" + "+--------------------------------+";
// toReturnI = "\n+--------------------------------+" + "\n" + "| I:          					 |" + "\n" + "+--------------------------------+";
// toReturnJ = "\n+--------------------------------+" + "\n" + "| J:          					 |" + "\n" + "+--------------------------------+";
// toReturnK = "\n+--------------------------------+" + "\n" + "| K:          					 |" + "\n" + "+--------------------------------+";
// toReturnL = "\n+--------------------------------+" + "\n" + "| L:          					 |" + "\n" + "+--------------------------------+";
// toReturnM = "\n+--------------------------------+" + "\n" + "| M:          					 |" + "\n" + "+--------------------------------+";
// toReturnN = "\n+--------------------------------+" + "\n" + "| N:          					 |" + "\n" + "+--------------------------------+";
// toReturnO = "\n+--------------------------------+" + "\n" + "| O:          					 |" + "\n" + "+--------------------------------+";
// toReturnP = "\n+--------------------------------+" + "\n" + "| P:          					 |" + "\n" + "+--------------------------------+";
// toReturnQ = "\n+--------------------------------+" + "\n" + "| Q:          					 |" + "\n" + "+--------------------------------+";
// toReturnR = "\n+--------------------------------+" + "\n" + "| R:          					 |" + "\n" + "+--------------------------------+";
// toReturnS = "\n+--------------------------------+" + "\n" + "| S:          					 |" + "\n" + "+--------------------------------+";
// toReturnT = "\n+--------------------------------+" + "\n" + "| T:          					 |" + "\n" + "+--------------------------------+";
// toReturnU = "\n+--------------------------------+" + "\n" + "| U:          					 |" + "\n" + "+--------------------------------+";
// toReturnV = "\n+--------------------------------+" + "\n" + "| V:          					 |" + "\n" + "+--------------------------------+";
// toReturnW = "\n+--------------------------------+" + "\n" + "| W:          					 |" + "\n" + "+--------------------------------+";
// toReturnX = "\n+--------------------------------+" + "\n" + "| X:          					 |" + "\n" + "+--------------------------------+";
// toReturnY = "\n+--------------------------------+" + "\n" + "| Y:          					 |" + "\n" + "+--------------------------------+";
// toReturnZ = "\n+--------------------------------+" + "\n" + "| Z:          					 |" + "\n" + "+--------------------------------+";














// System.out.println("+--------------------------------+");
// System.out.println("|            CONTACTS          	 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| A:          					 |");
// System.out.println("+--------------------------------+");
// System.out.println(" Xavier Agostino ");

// System.out.println("+--------------------------------+");
// System.out.println("| B:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| C:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| D:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| E:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| F:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| G:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| H:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| I:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| J:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| K:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| L:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| M:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| N:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| O:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| P:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| Q:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| R:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| S:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| T:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| U:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| V:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| W:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| X:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| Y:          					 |");
// System.out.println("+--------------------------------+");

// System.out.println("+--------------------------------+");
// System.out.println("| Z:          					 |");
// System.out.println("+--------------------------------+");
