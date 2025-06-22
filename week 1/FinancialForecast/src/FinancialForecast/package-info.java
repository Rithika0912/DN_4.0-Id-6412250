package FinancialForecast;
public class FinancialForecast{
    public static double futureValueRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValueRecursive(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optional: Iterative version for comparison
    public static double futureValueIterative(double presentValue, double growthRate, int years) {
        for (int i = 0; i < years; i++) {
            presentValue *= (1 + growthRate);
        }
        return presentValue;
    }

    public static void main(String[] args) {
        // Sample input values
        double presentValue = 10000.0;     // ₹10,000 initial investment
        double growthRate = 0.08;          // 8% annual growth
        int years = 5;                     // Number of years

        // Calculate future value using recursion
        double recursiveResult = futureValueRecursive(presentValue, growthRate, years);
        System.out.printf("📈 Future Value (Recursive) after %d years: ₹%.2f\n", years, recursiveResult);

        // Calculate future value using iteration
        double iterativeResult = futureValueIterative(presentValue, growthRate, years);
        System.out.printf("📊 Future Value (Iterative) after %d years: ₹%.2f\n", years, iterativeResult);
    }
}
