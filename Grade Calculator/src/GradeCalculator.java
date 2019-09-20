import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		gradeCalc();

	}

	private static void gradeCalc() {
		double tests = testGradeCalc();
		double quizzes = quizGradeCalc();
		double homework = hwGradeCalc();
//		double attendance = attendanceGradeCalc();
		double labs = labGradeCalc();
		double grade = tests + quizzes + homework + labs;
		System.out.println("Final Grade: "+grade+"%  (Not including final)");
		
//		 labGradeCalc(); 
	}

	private static double testGradeCalc() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp = 0;
		double weight = 0, sum = 0;
		String str = "";
		Boolean space = false;
		@SuppressWarnings("resource")
		Scanner scannie = new Scanner(System.in);
		System.out.println("Enter your Test Scores:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		for (int j = 0; j < str.length(); j++) {
			if ((str.charAt(j)) == ' ' || str.charAt(j) == '\n') {
				space = true;
				if (temp != 0) {
					arr.add(temp);
					temp = 0;
				}
			}
			if (str.charAt(j) != ' ')
				space = false;

			while (space != true) {
				if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
						|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
						|| str.charAt(j) == '9' || str.charAt(j) == '0') {
					int number = Character.getNumericValue(str.charAt(j));
					temp = temp * 10;
					temp = temp + number;
					break;
				}
			}
		}
		if (str.charAt(str.length() - 1) != ' ')
			arr.add(temp);
//		System.out.println(arr);

		System.out.println("Enter Test Grade Weight:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		temp = 0;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
					|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
					|| str.charAt(j) == '9' || str.charAt(j) == '0') {
				int number = Character.getNumericValue(str.charAt(j));
				temp = temp * 10;
				temp = temp + number;
			}
		}
		weight = temp;

		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		sum = sum / arr.size();
		weight = weight / 100;
		sum = sum * weight;
		sum = Math.floor(sum * 100) / 100;
		return sum;
	}
	private static double quizGradeCalc() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp = 0;
		double weight = 0, sum = 0;
		String str = "";
		Boolean space = false;
		@SuppressWarnings("resource")
		Scanner scannie = new Scanner(System.in);
		System.out.println("Enter your Quiz Scores:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		for (int j = 0; j < str.length(); j++) {
			if ((str.charAt(j)) == ' ' || str.charAt(j) == '\n') {
				space = true;
				if (temp != 0) {
					arr.add(temp);
					temp = 0;
				}
			}
			if (str.charAt(j) != ' ')
				space = false;

			while (space != true) {
				if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
						|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
						|| str.charAt(j) == '9' || str.charAt(j) == '0') {
					int number = Character.getNumericValue(str.charAt(j));
					temp = temp * 10;
					temp = temp + number;
					break;
				}
			}
		}
		if (str.charAt(str.length() - 1) != ' ')
			arr.add(temp);
//		System.out.println(arr);

		System.out.println("Enter Quiz Grade Weight:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		temp = 0;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
					|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
					|| str.charAt(j) == '9' || str.charAt(j) == '0') {
				int number = Character.getNumericValue(str.charAt(j));
				temp = temp * 10;
				temp = temp + number;
			}
		}
		weight = temp;

		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		sum = sum / arr.size();
		weight = weight / 100;
		sum = sum * weight;
		sum = Math.floor(sum * 100) / 100;
		return sum;
	}
	private static double hwGradeCalc() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp = 0;
		double weight = 0, sum = 0;
		String str = "";
		Boolean space = false;
		@SuppressWarnings("resource")
		Scanner scannie = new Scanner(System.in);
		System.out.println("Enter your Homework Scores:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		for (int j = 0; j < str.length(); j++) {
			if ((str.charAt(j)) == ' ' || str.charAt(j) == '\n') {
				space = true;
				if (temp != 0) {
					arr.add(temp);
					temp = 0;
				}
			}
			if (str.charAt(j) != ' ')
				space = false;

			while (space != true) {
				if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
						|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
						|| str.charAt(j) == '9' || str.charAt(j) == '0') {
					int number = Character.getNumericValue(str.charAt(j));
					temp = temp * 10;
					temp = temp + number;
					break;
				}
			}
		}
		if (str.charAt(str.length() - 1) != ' ')
			arr.add(temp);
//		System.out.println(arr);

		System.out.println("Enter Homework Grade Weight:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		temp = 0;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
					|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
					|| str.charAt(j) == '9' || str.charAt(j) == '0') {
				int number = Character.getNumericValue(str.charAt(j));
				temp = temp * 10;
				temp = temp + number;
			}
		}
		weight = temp;

		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		sum = sum / arr.size();
		weight = weight / 100;
		sum = sum * weight;
		sum = Math.floor(sum * 100) / 100;
		return sum;
	}
	private static double attendanceGradeCalc() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp = 0;
		double weight = 0, sum = 0;
		String str = "";
		Boolean space = false;
		@SuppressWarnings("resource")
		Scanner scannie = new Scanner(System.in);
		System.out.println("Enter your attendance Scores:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		for (int j = 0; j < str.length(); j++) {
			if ((str.charAt(j)) == ' ' || str.charAt(j) == '\n') {
				space = true;
				if (temp != 0) {
					arr.add(temp);
					temp = 0;
				}
			}
			if (str.charAt(j) != ' ')
				space = false;

			while (space != true) {
				if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
						|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
						|| str.charAt(j) == '9' || str.charAt(j) == '0') {
					int number = Character.getNumericValue(str.charAt(j));
					temp = temp * 10;
					temp = temp + number;
					break;
				}
			}
		}
		if (str.charAt(str.length() - 1) != ' ')
			arr.add(temp);
//		System.out.println(arr);

		System.out.println("Enter attendance Grade Weight:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		temp = 0;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
					|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
					|| str.charAt(j) == '9' || str.charAt(j) == '0') {
				int number = Character.getNumericValue(str.charAt(j));
				temp = temp * 10;
				temp = temp + number;
			}
		}
		weight = temp;

		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		sum = sum / arr.size();
		weight = weight / 100;
		sum = sum * weight;
		sum = Math.floor(sum * 100) / 100;
		return sum;
	}
	private static double labGradeCalc() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int temp = 0;
		double weight = 0, sum = 0;
		String str = "";
		Boolean space = false;
		@SuppressWarnings("resource")
		Scanner scannie = new Scanner(System.in);
		System.out.println("Enter your Lab Scores:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		for (int j = 0; j < str.length(); j++) {
			if ((str.charAt(j)) == ' ' || str.charAt(j) == '\n') {
				space = true;
				if (temp != 0) {
					arr.add(temp);
					temp = 0;
				}
			}
			if (str.charAt(j) != ' ')
				space = false;

			while (space != true) {
				if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
						|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
						|| str.charAt(j) == '9' || str.charAt(j) == '0') {
					int number = Character.getNumericValue(str.charAt(j));
					temp = temp * 10;
					temp = temp + number;
					break;
				}
			}
		}
		if (str.charAt(str.length() - 1) != ' ')
			arr.add(temp);
//		System.out.println(arr);

		System.out.println("Enter Lab Grade Weight:");
		while (scannie.hasNextLine()) {
			str = scannie.nextLine();
			if (str.contains(""))
				break;
		}
		temp = 0;
		for (int j = 0; j < str.length(); j++) {

			if (str.charAt(j) == '1' || str.charAt(j) == '2' || str.charAt(j) == '3' || str.charAt(j) == '4'
					|| str.charAt(j) == '5' || str.charAt(j) == '6' || str.charAt(j) == '7' || str.charAt(j) == '8'
					|| str.charAt(j) == '9' || str.charAt(j) == '0') {
				int number = Character.getNumericValue(str.charAt(j));
				temp = temp * 10;
				temp = temp + number;
			}
		}
		weight = temp;

		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		sum = sum / arr.size();
		weight = weight / 100;
		sum = sum * weight;
		sum = Math.floor(sum * 100) / 100;
		return sum;
	}
}
