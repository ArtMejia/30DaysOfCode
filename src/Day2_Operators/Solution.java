package Day2_Operators;

public class Solution {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double total_cost = (100+tip_percent+tax_percent) * meal_cost / 100;
        System.out.println(Math.round(total_cost));
        return;
    }
}
