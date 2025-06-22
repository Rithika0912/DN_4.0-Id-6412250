package FinancialForecast;
import java.util.Scanner;
public class FinancialForecasting {
    public static double futureValueRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) return initialValue;
        return futureValueRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
    public static double futureValueMemo(double initialValue, double growthRate, int years, double[] memo) {
        if (years == 0) return initialValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = futureValueMemo(initialValue, growthRate, years - 1, memo) * (1 + growthRate);
        return memo[years];
    }
    public static double futureValueIterative(double initialValue, double growthRate, int years) {
        double value = initialValue;
        for (int i = 1; i <= years; i++) {
            value *= (1 + growthRate);
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial investment amount: ₹");
        double initialValue = scanner.nextDouble();
        System.out.print("Enter annual growth rate (e.g. 5% as 0.05): ");
        double growthRate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        double recursiveResult = futureValueRecursive(initialValue, growthRate, years);
        System.out.printf("Future Value (Recursive) after %d years: ₹%.2f%n", years, recursiveResult);
        double[] memo = new double[years + 1];
        double memoResult = futureValueMemo(initialValue, growthRate, years, memo);
        System.out.printf("Future Value (Memoized) after %d years: ₹%.2f%n", years, memoResult);
        double iterativeResult = futureValueIterative(initialValue, growthRate, years);
        System.out.printf("Future Value (Iterative) after %d years: ₹%.2f%n", years, iterativeResult);
scanner.close();
    }
}

