package test;

public class Answer {
	/*配列
	 * 1.
	 * public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        System.out.println("Sum is: " + sum);
    }
}
	   2.	
	 * public class MaxValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum value is: " + max);
    }
}
	  3.
	  public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false;
        for(int number : numbers) {
            if(number == toFind) {
                found = true;
                break;
            }
        }
        System.out.println(toFind + " is found: " + found);
    }
}

	  4.
	  public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for(int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}

	  5.
	  public class DuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 5};
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println("Duplicate element found: " + numbers[i]);
                }
            }
        }
    }
}

//-----------------------------------------------------------------------

	 * ループ構造
	 * 1.
	 * public class PrintNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
	  2.
	  public class PrintEvens {
    public static void main(String[] args) {
        int n = 10; // 例として10までの偶数を印刷
        for(int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}

	  3.
	  public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for(int element : array) {
            System.out.println(element);
        }
    }
}

	  4.
	  public class Countdown {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}

	  5.
	  import java.util.Scanner;

public class PrintHelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to print 'Hello, World!': ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Hello, World!");
        }
        scanner.close();
    }
}

//-----------------------------------------------------------------------

	 *メソッド、カプセル化
	 *
	 *1.メソッドは、クラス内に定義された一連の文で、特定のタスクを実行するためのコードブロックです。
	 *メソッドは引数を取ることができ、処理を行い、結果を返すことができます。
	 *
	 *2.カプセル化は、オブジェクト指向プログラミングの原則の一つで、
	 *データ（属性）とそのデータを操作するメソッドを組み合わせて一つのユニット、
	 *またはオブジェクトにするプロセスです。カプセル化により、オブジェクトの詳細を隠蔽し、
	 *外部から直接アクセスされることを防ぎます。
	 *
	 *3.メソッドオーバーローディングは、同じクラス内に同じ名前のメソッドを複数持つが、
	 *パラメータの型や数が異なることです。これにより、異なるパラメータで同じメソッドを呼び出すことができます。
	 *
	 *4.フィールド、メソッド、またはコンストラクタをクラス内部でのみアクセス可能にするために使用されます。
	 *これにより、クラスの外部からこれらの要素への直接アクセスを防ぐことができます。
	 *
	 *5.メソッドが値を返さない場合、void キーワードを使用します。これはメソッドが戻り値を持たないことを示します。
	 *
	 *
	 *-----------------------------------------------------------------------
	 *
	 *
	 *継承
	 *1.
	 *class Dog extends Animal { // Animalを継承する
    @Override
    void makeSound() { // makeSoundメソッドをオーバーライドする
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // DogクラスのmakeSoundメソッドを呼び出す
    }
}

	 * 2.
	 * class MountainBike extends Bicycle { // Bicycleを継承する
    int gear;

    MountainBike(int startSpeed, int startGear) {
        super(startSpeed); // 親クラスのコンストラクタを呼び出す
        this.gear = startGear; // gear属性を初期化する
    }
}

public class TestBike {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(10, 3);
        System.out.println(mb.gear); // MountainBikeのgearを出力する
    }
}

//-----------------------------------------------------------------------

	 * 例外
	 * 1.
	 * public class ExceptionTest {
    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = divideNumbers(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // ArithmeticExceptionをキャッチする
            System.out.println("0で割れません。"); // エラーメッセージを印刷する
        }
    }
}
	 *2.
	 *import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileReadTest {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistentfile.txt");
            // 他のファイル読み取り処理
        } catch (FileNotFoundException e) { // FileNotFoundExceptionをキャッチする
            System.out.println("ファイルがない。"); // エラーメッセージを印刷する
        }
    }
}
	 * */

}
