import java.util.Scanner;

public class CarbonFootprintApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        System.out.println("Welcome to the Carbon Footprint Calculator");
        System.out.println("Answer the following questions to estimate your environmental impact.\n");

        // Question 1 – Transport
        System.out.println("1. How do you usually travel short distances?");
        System.out.println("A) Walk or cycle");
        System.out.println("B) Public transport");
        System.out.println("C) Drive a car");

        String answer1 = scanner.nextLine().trim().toUpperCase();

        switch (answer1) {
            case "A":
                totalScore += 1;
                break;
            case "B":
                totalScore += 2;
                break;
            case "C":
                totalScore += 3;
                break;
            default:
                System.out.println("Invalid input, assuming average impact.");
                totalScore += 2;
        }

        // Question 2 – Home Energy Usage
        System.out.println("\n2. How do you primarily heat and power your home?");
        System.out.println("A) Renewable energy (e.g. solar, green tariff)");
        System.out.println("B) Standard electricity and gas");
        System.out.println("C) Inefficient or high energy usage");

        String answer2 = scanner.nextLine().trim().toUpperCase();

        switch (answer2) {
            case "A":
                totalScore += 1;
                break;
            case "B":
                totalScore += 2;
                break;
            case "C":
                totalScore += 3;
                break;
            default:
                System.out.println("Invalid input, assuming average energy usage.");
                totalScore += 2;
        }

        // Question 3 – Diet
        System.out.println("\n3. Which option best describes your diet?");
        System.out.println("A) Mostly plant-based");
        System.out.println("B) Mixed diet (meat and plant-based)");
        System.out.println("C) Meat-heavy diet");

        String answer3 = scanner.nextLine().trim().toUpperCase();

        switch (answer3) {
            case "A":
                totalScore += 1;
                break;
            case "B":
                totalScore += 2;
                break;
            case "C":
                totalScore += 3;
                break;
            default:
                System.out.println("Invalid input, assuming mixed diet.");
                totalScore += 2;
        }

        // Question 4 – Recycling Habits
        System.out.println("\n4. How often do you recycle household waste?");
        System.out.println("A) Always, and I separate materials properly");
        System.out.println("B) Sometimes");
        System.out.println("C) Rarely or never");

        String answer4 = scanner.nextLine().trim().toUpperCase();

        switch (answer4) {
            case "A":
                totalScore += 1;
                break;
            case "B":
                totalScore += 2;
                break;
            case "C":
                totalScore += 3;
                break;
            default:
                System.out.println("Invalid input, assuming occasional recycling.");
                totalScore += 2;
        }

        // Question 5 – Shopping Frequency
        System.out.println("\n5. How often do you buy new clothing or non-essential items?");
        System.out.println("A) Rarely or second-hand");
        System.out.println("B) Occasionally");
        System.out.println("C) Frequently");

        String answer5 = scanner.nextLine().trim().toUpperCase();

        switch (answer5) {
            case "A":
                totalScore += 1;
                break;
            case "B":
                totalScore += 2;
                break;
            case "C":
                totalScore += 3;
                break;
            default:
                System.out.println("Invalid input, assuming occasional shopping.");
                totalScore += 2;
        }

        System.out.println("\nThank you for completing the questionnaire.");

        System.out.println("\nYour total carbon footprint score is: " + totalScore);

        if (totalScore <= 7) {
            System.out.println("Low carbon footprint");
            System.out.println("Great job! Your choices are environmentally friendly.");
        } else if (totalScore <= 11) {
            System.out.println("Moderate carbon footprint");
            System.out.println("There are opportunities to reduce your impact.");
        } else {
            System.out.println("High carbon footprint");
            System.out.println("Consider making more sustainable lifestyle choices.");
        }

        System.out.println("\nSuggestions:");
        System.out.println("- Use public transport or cycle when possible");
        System.out.println("- Reduce energy consumption at home");
        System.out.println("- Recycle and reduce waste");
        System.out.println("- Consider more plant-based meals");

        scanner.close();
    }
}
