package practice_java.practice_7.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCost(1, 123.51);
        costCounter.addCost(2, 162.47);
        costCounter.addCost(3, 1624.00);
        costCounter.addCost(4, 256.01);
        costCounter.addCost(5, 1589.25);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());
    }
}
