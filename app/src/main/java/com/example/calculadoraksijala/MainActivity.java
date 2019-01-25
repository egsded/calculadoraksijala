package com.example.calculadoraksijala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int con=0;
    String x="", y="";
    int opera;
    TextView txv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void igual(View v){
        double res;
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        switch (opera) {

            case 1:res = a + b;
            txv.setText(String.valueOf(res));
            con = 0;
            break;
            case 2: res = a-b;
                txv.setText(String.valueOf(res));
                con = 0;
                break;
            case 3:res = a*b;
                txv.setText(String.valueOf(res));
                con = 0;
                break;
            case 4:res = a/b;
                txv.setText(String.valueOf(res));
                con = 0;
                break;
            case 5: res = Math.pow(a,b);
                    txv.setText(String.valueOf(res));
                    con = 0;
                    break;
        }
    }
    public void suma(View v){
        con++;
        opera =1;
    }
    public void resta(View v){
        con++;
        opera =2;
    }
    public void multiplicar(View v){
        con++;
        opera =3;
    }
    public void dividir(View v){
        con++;
        opera = 4;
    }
    public void exponente(View v){
        con++;
        opera = 5;
    }
    public void uno(View v){
        if(con==0){
            x=x+"1";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y=y+"1";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void dos(View v){
        if(con==0){
            x=x+"2";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y +"2";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void tres(View v){
        if(con==0){
            x= x +"3";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "3";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void cuatro(View v){
        if(con==0){
            x= x + "4";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "4";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void cinco(View v){
        if(con==0){
            x= x + "5";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "5";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void seis(View v){
        if(con==0){
            x= x + "6";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "6";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void siete(View v){
        if(con==0){
            x= x + "7";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "7";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void ocho(View v){
        if(con==0){
            x= x + "8";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "8";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void nueve(View v){
        if(con==0){
            x= x + "9";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "9";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void cero(View v){
        if(con==0){
            x= x + "0";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
        }
        else{
            y= y + "0";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(y);
        }
    }
    public void punto(View v){
         x=x + ".";
            txv = (TextView)findViewById(R.id.ET1);
            txv.setText(x);
    }
    public void se(View v){
        x="";
        y="";
        con=0;
        txv.setText("");
    }

}
