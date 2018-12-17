package com.example.joe.calculatortesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @BindView(R.id.tvResult)
    TextView tvResult;
    @BindView(R.id.tvNumberOne)
    EditText numberOne;
    @BindView(R.id.tvNumberTwo)
    EditText numberTwo;
    @BindView(R.id.btnAdd)
    Button add;
    @BindView(R.id.btnSubtract)
    Button subtract;
    @BindView(R.id.btnMultiply)
    Button multiply;
    @BindView(R.id.btnEquals)
    Button isEquals;

    private MainContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MainPresenter(new Calculator(), this);
    }

    @OnClick(R.id.btnAdd)
    public void onAddClicked(){
        presenter.onAddSelected(numberOne.getText().toString(), numberTwo.getText().toString());
    }

    @OnClick(R.id.btnSubtract)
    public void onSubtractCliscked(){
        presenter.onSubtractSelected(numberOne.getText().toString(), numberTwo.getText().toString());
    }
    @OnClick(R.id.btnMultiply)
    public void onMultiplyCliscked(){
        presenter.onMultiplySelected(numberOne.getText().toString(), numberTwo.getText().toString());
    }
    @OnClick(R.id.btnEquals)
    public void onIsEqualCliscked(){
        presenter.onIsEqualsSelected(numberOne.getText().toString(), numberTwo.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }

    @Override
    public void showError(String error) {

    }
}
