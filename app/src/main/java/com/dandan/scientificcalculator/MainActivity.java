package com.dandan.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaring the buttons and textViews
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsin,bcos,btan,blog,bac,bc,bb1,bb2,bln,bfact,bsquare,bsqrt,binv,bdiv,bmul,bsub,badd,bequal,bpi,bdot;
    TextView tvmain,tvsec;
    String pi = "3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the buttons and textViews
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        binv = findViewById(R.id.binv);
        bdiv = findViewById(R.id.bdiv);
        bmul = findViewById(R.id.bmul);
        bsub = findViewById(R.id.bsub);
        badd = findViewById(R.id.badd);
        bequal = findViewById(R.id.bequal);
        bpi = findViewById(R.id.bpi);
        bdot = findViewById(R.id.bdot);

        tvsec = findViewById(R.id.tvsec);
        tvmain = findViewById(R.id.tvmain);

        //onclick listeners for all the buttons
        b0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b0.getText().toString());
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b1.getText().toString());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b2.getText().toString());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b3.getText().toString());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b4.getText().toString());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b5.getText().toString());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b6.getText().toString());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b7.getText().toString());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b8.getText().toString());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                tvmain.setText(val+b9.getText().toString());
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.contains("."))
                {
                    tvmain.setText(val+bdot.getText().toString());
                }
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    val = val.substring(0, val.length() - 1);
                    tvmain.setText(val);
                }
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val+badd.getText().toString());
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (last!='-')
                {
                    tvmain.setText(val+bsub.getText().toString());
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                char last = val.charAt(val.length() -1);
                if (!val.equals(""))
                {
                    tvmain.setText(val+bmul.getText().toString());
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                if (!val.equals(""))
                {
                    tvmain.setText(val+bdiv.getText().toString());
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                String result = String.valueOf(r);
                tvmain.setText(result);
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
               tvmain.setText(tvmain.getText()+"(");
            }
        });
        bb2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+pi);
                tvsec.setText(bpi.getText());
                //hold
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });
        binv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText().toString()+"^"+"(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(tvmain.getText().toString());
                int fact = factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d = Double.parseDouble(tvmain.getText().toString());
                double square = d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText().toString()+"log");
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText().toString()+"ln");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = tvmain.getText().toString();
                String replacedString = val.replace('÷','/').replace('×', '*');
                double result = eval(replacedString);
                String r = String.valueOf(result);
                tvmain.setText(r);
                tvsec.setText(val);
            }
        });
    }

    int factorial(int n){
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }

    //evaluation

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

}