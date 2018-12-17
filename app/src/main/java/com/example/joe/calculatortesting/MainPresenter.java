package com.example.joe.calculatortesting;

public class MainPresenter implements MainContract.Presenter {
    private final Calculator calculator;
    private final MainContract.View view;

    public MainPresenter(Calculator calculator, MainContract.View view){
        this.calculator = calculator;
        this.view = view;
    }
    @Override
    public void onAddSelected(String a, String b) {
        int numberOne = Integer.parseInt(a);
        int numberTwo = Integer.parseInt(b);

        int result = calculator.add(numberOne, numberTwo);
        view.showResult(String.valueOf(result));
    }

    @Override
    public void onSubtractSelected(String a, String b) {
        int numberOne = Integer.parseInt(a);
        int numberTwo = Integer.parseInt(b);

        int result = calculator.subtract(numberOne, numberTwo);
        view.showResult(String.valueOf(result));
    }

    @Override
    public void onMultiplySelected(String a, String b) {
        int numberOne = Integer.parseInt(a);
        int numberTwo = Integer.parseInt(b);

        int result = calculator.multiply(numberOne, numberTwo);
        view.showResult(String.valueOf(result));

    }

    @Override
    public void onIsEqualsSelected(String a, String b) {
        int numberOne = Integer.parseInt(a);
        int numberTwo = Integer.parseInt(b);

        boolean result = calculator.isEqual(numberOne, numberTwo);
        view.showResult(String.valueOf(result));
    }
}
