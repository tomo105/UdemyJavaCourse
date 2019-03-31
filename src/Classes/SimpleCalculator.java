package Classes;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;
    public double getFirstNumber(){
        return firstNumber;

    }
    public  double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        return firstNumber +secondNumber;
    }
    public  double getSubtractionResult() {
        return secondNumber - firstNumber;
    }
    public  double getMultiplicaationResult() {
        return firstNumber * secondNumber;
    }
    public  double getDivisionresult() {
        if(secondNumber == 0)
            return 0;
        return  firstNumber/secondNumber;
    }
}

