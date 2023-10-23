package task_1;

public class Calculator {
  // Обобщенный метод для сложения
  public static <T extends Number> T sum(T num1, T num2) {
    if (num1 instanceof Integer) {
      return (T) Integer.valueOf(num1.intValue() + num2.intValue());
    } else if (num1 instanceof Double) {
      return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
    } else {
      throw new IllegalArgumentException("Unsupported data type");
    }
  }

  // Обобщенный метод для умножения
  public static <T extends Number> T multiply(T num1, T num2) {
    if (num1 instanceof Integer) {
      return (T) Integer.valueOf(num1.intValue() * num2.intValue());
    } else if (num1 instanceof Double) {
      return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
    } else {
      throw new IllegalArgumentException("Unsupported data type");
    }
  }

  // Обобщенный метод для деления
  public static <T extends Number> T divide(T num1, T num2) {
    if (num1 instanceof Integer) {
      return (T) Double.valueOf(num1.intValue() / num2.intValue());
    } else if (num1 instanceof Double) {
      return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
    } else {
      throw new IllegalArgumentException("Unsupported data type");
    }
  }

  // Обобщенный метод для вычитания
  public static <T extends Number> T subtract(T num1, T num2) {
    if (num1 instanceof Integer) {
      return (T) Integer.valueOf(num1.intValue() - num2.intValue());
    } else if (num1 instanceof Double) {
      return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
    } else {
      throw new IllegalArgumentException("Unsupported data type");
    }
  }

  public static void main(String[] args) {
    // Примеры использования
    int intSumResult = Calculator.sum(10, 23);
    double doubleDivideResult = Calculator.divide(21.7, 2.0);
    int intSubtractResult = Calculator.subtract(43, 21);
    double doubleMultiplyResult = Calculator.multiply(4.5, 2.0);

    System.out.println("Сумма: " + intSumResult);
    System.out.println("Результат деления: " + doubleDivideResult);
    System.out.println("Разность: " + intSubtractResult);
    System.out.println("Произведение: " + doubleMultiplyResult);
  }
}

