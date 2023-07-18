package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumber;
    private TextView tvResult;
    private Button btnRoot,btnFact,btnSquare,btnInverse,btnBracOpen,btnBracClose,btnLog10, btnShift,btnSin,btnCos,btnTan,btnLog,btnDel, btnAc, btnPercent, btnPlus, btnMinus, btnMulti, btnDivide, btnEqual, btnDecimal, btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    float mValueOne,mValueTwo;
    boolean Percent,Root,Fact,Square,Inverse,Addition,Subtract,Multiplication,Division,Sine,Cosine,Tangent,Log,Shift=false,Log10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        edtNumber = findViewById(R.id.edtNumber);
        edtNumber = findViewById(R.id.edtNumber);
        btnDel = findViewById(R.id.btnDel);
        btnAc = findViewById(R.id.btnAc);
        btnPercent = findViewById(R.id.btnPercent);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnDecimal = findViewById(R.id.btnDecimal);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnSin=findViewById(R.id.btnSin);
        btnCos=findViewById(R.id.btnCos);
        btnTan=findViewById(R.id.btnTan);
        btnLog=findViewById(R.id.btnLog);
        btnShift=findViewById(R.id.btnShift);
        btnShift.setBackgroundColor(Color.MAGENTA);
        btnSin.setBackgroundColor(Color.MAGENTA);
        btnCos.setBackgroundColor(Color.MAGENTA);
        btnTan.setBackgroundColor(Color.MAGENTA);
        btnBracClose=findViewById(R.id.btnBracClose);
        btnBracOpen=findViewById(R.id.btnBracOpen);
        btnLog10=findViewById(R.id.btnLog10);
        btnRoot=findViewById(R.id.btnRoot);
        btnFact=findViewById(R.id.btnFact);
        btnSquare=findViewById(R.id.btnSquare);
        btnInverse=findViewById(R.id.btnInverse);

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber==null)
                {
                    edtNumber.setText("");
                }

                else {
                    mValueOne=Float.parseFloat(edtNumber.getText()+"");
                    Percent=true;
                    edtNumber.setText((mValueOne/100)+"");
                }

            }
        });
        btnShift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shift=true;
            }
        });
        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("√");
                Root=true;
            }
        });
        btnFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   if(edtNumber==null)
                   {
                       edtNumber.setText("");
                   }

                 else {
                       Fact=true;
                       edtNumber.setText(edtNumber.getText()+"!");
                   }
            }
        });
        btnInverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNumber==null)
                {
                    edtNumber.setText("");
                }

                else {
                    mValueOne=Float.parseFloat(edtNumber.getText()+"");
                    Fact=true;
                    edtNumber.setText((1/mValueOne)+"");
                }
            }
        });
        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNumber==null)
                {
                    edtNumber.setText("");
                }

                else {
                    mValueOne=Float.parseFloat(edtNumber.getText()+"");
                    Square=true;
                    edtNumber.setText(edtNumber.getText()+"^2");
                }
            }
        });


        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Shift==false)
                {
                    edtNumber.setText("sin(");
                }
                else
                {
                    edtNumber.setText("sin-l(");
                }
                Sine=true;
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Shift==true)
                {
                    edtNumber.setText("cos-l(");

                }
                else {
                    edtNumber.setText("cos(");
                }

                Cosine=true;
            }
        });
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Shift==true)
                {
                    edtNumber.setText("tan-l(");

                }
                else {
                    edtNumber.setText("tan(");
                }
                Tangent=true;
            }
        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("ln");
                Log=true;
            }
        });
        btnLog10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText("log(");
                Log10=true;
            }
        });
        btnBracOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText(edtNumber.getText()+"(");
            }
        });
        btnBracClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumber.setText(edtNumber.getText()+")");
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                edtNumber.setText(edtNumber.getText()+".");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText()+"9");
            }
        });
        btnAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText("");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber==null) {
                    edtNumber.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtNumber.getText()+"");
                    Addition=true;
                    edtNumber.setText(null);
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber==null) {
                    edtNumber.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtNumber.getText()+"");
                    Subtract=true;
                    edtNumber.setText(null);
                }
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber==null) {
                    edtNumber.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtNumber.getText()+"");
                    Multiplication=true;
                    edtNumber.setText(null);
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber==null) {
                    edtNumber.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(edtNumber.getText()+"");
                    Division=true;
                    edtNumber.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numString= String.valueOf(edtNumber.getText());
                numString=numString.replaceAll("[^\\d.]+", "");


                mValueTwo=Float.parseFloat(numString);
                if(Addition==true)
                {
                    edtNumber.setText(mValueOne+mValueTwo+"");
                    Addition=false;
                }
                else if(Subtract==true)
                {
                    edtNumber.setText(mValueOne-mValueTwo+"");
                    Subtract=false;
                }
                else if(Multiplication==true)
                {
                    edtNumber.setText(mValueOne*mValueTwo+"");
                    Multiplication=false;
                }
                else if(Division==true)
                {
                    edtNumber.setText(mValueOne/mValueTwo+"");
                    Division=false;
                }
                else if(Sine==true)
                {
                    if(Shift==true)
                    {
                        edtNumber.setText(Math.toDegrees(Math.asin(mValueTwo))+"");
                        Shift=false;
                    }
                    else {
                        edtNumber.setText(Math.sin(Math.toRadians(mValueTwo))+"");
                    }

                    Sine=false;
                }
                else if(Cosine==true)
                {
                    if(Shift==true)
                    {
                        edtNumber.setText(Math.toDegrees(Math.acos(mValueTwo))+"");
                        Shift=false;
                    }

                    else
                    {
                        edtNumber.setText(Math.cos(Math.toRadians(mValueTwo))+"");
                    }
                    Cosine=false;
                }
                else if(Tangent==true)
                {
                    if(Shift==true)
                    {
                        edtNumber.setText(Math.toDegrees(Math.atan(mValueTwo))+"");
                        Shift=false;
                    }
                    else {
                        double val=Math.toRadians(mValueTwo);
                        edtNumber.setText(Math.tan(val)+"");
                    }

                    Tangent=false;
                }
                else if(Log==true)
                {
                    edtNumber.setText(Math.log(mValueTwo)+"");
                    Log=false;
                }
                else if(Log10==true)
                {
                    edtNumber.setText(Math.log10(mValueTwo)+"");
                    Log10=false;
                }
                else if(Root==true)
                {
                    edtNumber.setText(Math.sqrt(mValueTwo)+"");
                    Root=false;
                }
                else if(Fact==true)
                {
                    mValueTwo=(int)mValueTwo;
                    int ans= 1;
                    for (int i=1;i<=mValueTwo;i++)
                    {
                       ans=ans*i;
                    }
                    edtNumber.setText(ans+"");
                    Fact=false;

                }
                else if(Square==true)
                {
                    edtNumber.setText(Math.pow(mValueOne,2.0)+"");
                    Square=false;

                }
                else if(Inverse==true)
                {
                    edtNumber.setText((1/mValueOne)+"");
                }
            }
        });



    }
}

