/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.java;

import java.util.ArrayList;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class ProgramMath implements ProgramMathI {

    private int num;

    public ProgramMath(int num) {
        this.num = num;
    }

    public ProgramMath() {
    }

    @Override
    public boolean getLoopCheckPrimeNumber() {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= (num / 2); i++) {
            if (i != num) {
                if (num % i == 0) {
                    return false;
                }

            }
        }

        return true;
    }

    @Override
    public ArrayList<Integer> FindFactor(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean OodOrEven(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
