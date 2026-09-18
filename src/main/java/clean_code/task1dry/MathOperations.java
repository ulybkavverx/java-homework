package clean_code.task1dry;

//Нарушение DRY (Don't Repeat Yourself) – дублирование кода
//Задача: Устраните дублирование кода,
//применив перегрузку методов или использование массива аргументов.

public class MathOperations {

    public int add(int... numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}