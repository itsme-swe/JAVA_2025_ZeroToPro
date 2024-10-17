package StringsInJava;

public class printfMethod {
  public static void main(String[] args) {

    int age = 32;

    float weight = 68.5f;

    String name = "Harsh";

    char n = 'H';

    System.out.printf("I am %s my age is %d and I weigh at %.1f and my name first letter is '%c' %n", name, age, weight,
        n);

  }
}

/*
 * output ⇒ I am Harsh my age is 32 and I weigh at 68.5 and my name first letter
 * is 'H'.
 * 
 * 🍁 Some Common Format Specifiers
 * 1️⃣ %d stands for decimal integer
 * 2️⃣ %f stands for floating point number
 * 3️⃣ %s stands for string
 * 4️⃣ %c stands for character
 * 5️⃣ %n stands for new line character
 */