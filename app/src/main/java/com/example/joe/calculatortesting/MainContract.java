package com.example.joe.calculatortesting;

public interface MainContract {
    interface View{
        void showResult(String result);
        void showError(String error);
    }

    interface Presenter{
        void onAddSelected(String a, String b);
        void onSubtractSelected(String a, String b);
        void onMultiplySelected(String a, String b);
        void onIsEqualsSelected(String a, String b);
    }
}
