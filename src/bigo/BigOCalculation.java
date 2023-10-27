package bigo;

public class BigOCalculation {

    public int funChallenge(Object[] input) {
        var a = 10;                                 // O(1)
        a = 50 + 3;                                 // O(1)
        for (int i = 0; i < input.length; i++) {    // O(n)
         // anotherMethod()                         // O(n)
            var strange = true;                     // O(n)
            a++;                                    // O(n)
        }
        return a;                                   // O(1)
                                                    // BIG O(3+4n)
    }

    public void anotherFunChallenge(int input) {
        var a = 5;                                  // O(1)
        var b = 10;                                 // O(1)
        var c = 50;                                 // O(1)
        for (int i = 0; i < input; i++) {           // O(n)
            var x = i + 1;                          // O(n)
            var y = i + 2;                          // O(n)
            var z = i + 3;                          // O(n)
        }
        for (int j = 0; j < input; j++) {           // O(n)
            var p = j * 2;                          // O(n)
            var q = j * 2;                          // O(n)
        }
        var whoAmI = "I don't know";                // O(1)
                                                    // BIG O(4+7n)
    }
}
