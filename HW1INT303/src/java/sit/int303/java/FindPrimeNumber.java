/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.java;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class FindPrimeNumber {

    public boolean LoopCheckPrimeNumber(int num) {
        for (int i = 2; i < (num / 2); i++) {
            if (i != num) {
                if (num % i == 0) {
                return false;
                }

            }
        }

        return true;
    }

}
