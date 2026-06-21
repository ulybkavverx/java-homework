package practice_java.practice_7.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // массив, индекс = номер месяца
    private ArrayList<Double> costPerMonth;


    public CostCounter() {
        this.costPerMonth = new ArrayList<>();
    }

    // метод добавления значения по номеру месяца (от 1 до 12) и расходам в этом месяце
    public void addCost(int month, Double costs) {
        costPerMonth.add(month-1, costs);
    }

    // метод получения значения расхода по месяцу
    public Double getCosts(int month) {
        return costPerMonth.get(month-1);
    }

    // считать мин расход за месяц
    public Double minCostsPerMonth() {
        AtomicReference<Double> min = new AtomicReference<>(costPerMonth.getFirst());
        costPerMonth.forEach(
                costsPerMonth -> {
                    if (costsPerMonth < min.get()) {
                        min.set(costsPerMonth);
                    }
                }
        );
        return min.get();
    }

}
