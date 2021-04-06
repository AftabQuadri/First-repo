package quadri.aftab.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public  class MainActivity extends AppCompatActivity implements View.OnTouchListener {
TextView textView,vb_textView,backspace,decimal,binary;
Button clear,braces,percent,divide,multiply,minus,plus,equals,dot,sign,one,two,three,four,five,six,seven,eight,nine,zero;
   int maxLength=15;
   char op;
   public static BigDecimal var1= new BigDecimal(0),result=new BigDecimal(0),var2=new BigDecimal(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        vb_textView=findViewById(R.id.text_View);
        clear=findViewById(R.id.clear);
        braces=findViewById(R.id.braces);
        percent=findViewById(R.id.percent);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        equals=findViewById(R.id.equals);
        dot=findViewById(R.id.dot);
        sign=findViewById(R.id.sign);
        one=findViewById(R.id.one_btn);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        decimal=findViewById(R.id.decimal);
        binary=findViewById(R.id.binary);
        backspace=findViewById(R.id.backspace);
        String num=textView.getText().toString();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()>15)
                {
                    Toast.makeText(MainActivity.this,"Exceeded",Toast.LENGTH_SHORT).show();
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength){
                    textView.setText(textView.getText().toString()+"1");
                    vb_textView.setText(vb_textView.getText().toString()+"1");
                }
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength){
                    textView.setText(textView.getText().toString()+"2");
                    vb_textView.setText(vb_textView.getText().toString()+"2");

                }
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength){
                    textView.setText(textView.getText().toString()+"3");
                    vb_textView.setText(vb_textView.getText().toString()+"3");

                }
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength) {
                    textView.setText(textView.getText().toString() + "4");
                    vb_textView.setText(vb_textView.getText().toString() + "4");
                }
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength) {
                    textView.setText(textView.getText().toString() + "5");
                    vb_textView.setText(vb_textView.getText().toString() + "5");
                }
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength)
                {
                    textView.setText(textView.getText().toString()+"6");
                    vb_textView.setText(vb_textView.getText().toString()+"6");
                }
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength){
                    textView.setText(textView.getText().toString()+"7");
                    vb_textView.setText(vb_textView.getText().toString()+"7");
                }
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength){
                    textView.setText(textView.getText().toString()+"8");
                    vb_textView.setText(vb_textView.getText().toString()+"8");}
                else
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
                }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view)
            {
                if(textView.getText().toString().length()<maxLength){
                    textView.setText(textView.getText().toString()+"9");
                    vb_textView.setText(vb_textView.getText().toString()+"9");
                    }
                else
              {
                  Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();

              }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length()<maxLength){
                    if(!TextUtils.isEmpty(textView.getText().toString()))
                    {
                        textView.setText(textView.getText().toString()+"0");
                    vb_textView.setText(vb_textView.getText().toString()+"0");
                }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Maximum number of digits(15) exceeded",Toast.LENGTH_SHORT).show();
                    }
            }
        });
        backspace.setOnTouchListener(this);
//        backspace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(!TextUtils.isEmpty(vb_textView.getText().toString()))
//                {
//
//                    if(vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='/'||vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='x'||vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='-'||vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='+')
//                    {
//                        textView.setText(var1.toString()+"0");
//                        op = '\0';
//                    }
//                    if(!TextUtils.isEmpty(textView.getText().toString())) {
//                    }
//
//                    vb_textView.setText(vb_textView.getText().toString().substring(0,vb_textView.getText().toString().length()-1));
//                    textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() - 1));
//
//                }
//
//                else
//                {
//                    var1 = var2 = result = BigDecimal.valueOf(0.0);
//                }
//
//
//            }
//        });
        binary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(textView.getText().toString())) {
                    if(textView.getText().toString().contains(".")) {
                        BigDecimal bd = new BigDecimal(textView.getText().toString());
                        int index=textView.getText().toString().indexOf(".");
                        Long num =Long.parseLong(textView.getText().toString().substring(0,index));
                        bd = bd.subtract(new BigDecimal(num));
                        String str1 = Bin(String.valueOf(num));
                        String str2 = BinOfFraction(bd.toString());

                        if(str1.length()>36)
                        {
                            Toast.makeText(MainActivity.this,"Maximum number of Digits Exceeded",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            vb_textView.setText(str1+str2);
                            textView.setText(str1+str2);
                        }
                    }
                    else{

                      String str1=Bin(textView.getText().toString());
                      if(str1.length()>40)
                      {
                          Toast.makeText(MainActivity.this,"Maximum number of Digits Exceeded",Toast.LENGTH_SHORT).show();
                      }
                      else
                      {
                          vb_textView.setText(str1);
                          textView.setText(str1);

                      }
                    }
                   }

            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=textView.getText().toString();
                if (!TextUtils.isEmpty(str)) {
                    if (str.contains("9") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8")) {
                        Toast.makeText(MainActivity.this, "Please Enter Binary Number", Toast.LENGTH_SHORT).show();
                    } else {
                        if(str.contains("."))
                        {
                            int index=str.indexOf(".");
                            BigInteger val1=new BigInteger(str.substring(0,index));
                            String val2=str.substring(index+1);
                            BigInteger value=Decimal(val1);
                            String value2=fractionDecimal(val2);
                            String value1=String.valueOf(Double.parseDouble(String.valueOf(value))+Double.parseDouble(value2));
                            textView.setText(value1);
                            vb_textView.setText(value1);

                        }
                        else {
                            BigInteger number = new BigInteger(textView.getText().toString());
                            String value1=String.valueOf(Decimal(number));
                            textView.setText(String.valueOf(value1));
                            vb_textView.setText(String.valueOf(value1));
                        }
                    }

                }
                }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    vb_textView.setText("");
                    textView.setText("");
                    var1 = var2 = result = BigDecimal.valueOf(0);
                    op='\0';
                }

        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(textView.getText().toString()) )
                {
                    if(textView.getText().toString().charAt(textView.getText().toString().length()-1)=='+'||textView.getText().toString().charAt(textView.getText().toString().length()-1)=='+'||textView.getText().toString().charAt(textView.getText().toString().length()-1)=='%'||textView.getText().toString().charAt(textView.getText().toString().length()-1)=='+'||textView.getText().toString().charAt(textView.getText().toString().length()-1)=='-'||textView.getText().toString().charAt(textView.getText().toString().length()-1)=='x'||textView.getText().toString().charAt(textView.getText().toString().length()-1)=='/')
                    {
                        textView.setText(textView.getText().toString()+"0.");
                        vb_textView.setText(vb_textView.getText().toString()+"0.");
                       }
                    else
                    {if(!textView.getText().toString().contains("."))
                    {
                        textView.setText(textView.getText().toString()+".");
                        vb_textView.setText(vb_textView.getText().toString()+".");
                       }

                    }

                }
                else//empty
                {


                    textView.setText(textView.getText().toString()+"0.");
                    vb_textView.setText(vb_textView.getText().toString()+"0.");
                   }
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(textView.getText().toString()))
                {

                       if(textView.getText().charAt(0)=='-')
                    {
                        vb_textView.setText(vb_textView.getText().toString().substring(1,vb_textView.getText().toString().length()));
                        textView.setText(textView.getText().toString().substring(1,textView.getText().toString().length()));
                    }
                    else {
                        vb_textView.setText("-" + vb_textView.getText().toString());
                        textView.setText("-"+textView.getText().toString());
                   }

                }

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!TextUtils.isEmpty(textView.getText().toString())) {
                    String str= vb_textView.getText().toString();
                    if(textView.getText().toString().charAt(textView.getText().toString().length()-1)=='.')
                    {
                        textView.setText(textView.getText().toString());
                        vb_textView.setText(vb_textView.getText().toString());
                       }
                    else{

                    if(var1.compareTo(new BigDecimal(0))==0)
                    {
                        var1 = new BigDecimal(textView.getText().toString());
                       }
                    else {
                        var1=equalsTo();
                      }
                    vb_textView.setText(vb_textView.getText().toString() + "+");
                    textView.setText("");
                        op = '+';
                }

                }
            }
        });
       minus.setOnClickListener(new View.OnClickListener() {
           @Override

           public void onClick(View view) {
               if (!TextUtils.isEmpty(textView.getText().toString())) {
                       if (textView.getText().toString().charAt(textView.getText().toString().length() - 1) == '.') {
                           textView.setText(textView.getText().toString());
                           vb_textView.setText(vb_textView.getText().toString());
                       } else {
                           if (var1.compareTo(new BigDecimal(0)) == 0) {
                               var1 = new BigDecimal(textView.getText().toString());
                           } else {
                               var1 = equalsTo();
                               }
                           vb_textView.setText(vb_textView.getText().toString() + "-");
                           textView.setText("");
                           op = '-';
                       }

               }
           }
       });
       multiply.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (!TextUtils.isEmpty(textView.getText().toString())) {
                   if (textView.getText().toString().charAt(textView.getText().toString().length() - 1) == '.') {
                       textView.setText(textView.getText().toString());
                       vb_textView.setText(vb_textView.getText().toString());
                   } else {
                       if (textView.getText().toString().charAt(textView.getText().toString().length() - 1) == op) {
                           textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() - 2) + "*");
                       }
                       if (var1.compareTo(new BigDecimal(0)) == 0) {
                           var1 = new BigDecimal(textView.getText().toString());
                       } else {
                           var1 = equalsTo();

                       }
                       vb_textView.setText(vb_textView.getText().toString() + "x");
                       textView.setText("");
                       op = '*';
                   }
//                   temp_tv.setText("v1:"+var1+"v2:"+var2+"op:"+op+"r:"+result);
               }
           }




       });
       divide.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (!TextUtils.isEmpty(textView.getText().toString())) {
                   if (textView.getText().toString().charAt(textView.getText().toString().length() - 1) == '.') {
                       textView.setText(textView.getText().toString());
                       vb_textView.setText(vb_textView.getText().toString());
                   } else {

                       if (var1.compareTo(new BigDecimal(0)) == 0) {
                           var1 = new BigDecimal(textView.getText().toString());
                       } else {
                           var1 = equalsTo();

                       }
                       vb_textView.setText(vb_textView.getText().toString() + "/");
                       textView.setText("");
                       op = '/';
                   }
               }
           }
       });
       percent.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if (!TextUtils.isEmpty(textView.getText().toString())) {
                   if (textView.getText().toString().charAt(textView.getText().toString().length() - 1) == '.') {
                       textView.setText(textView.getText().toString());
                       vb_textView.setText(vb_textView.getText().toString());
                   } else {
                       var1 =new BigDecimal(textView.getText().toString());
                       vb_textView.setText(vb_textView.getText().toString() + "%x");
                       op = '%';
                       textView.setText("");
                   }
               }
            }
       });
       braces.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               clear();
            MainActivity.this.finish();
           }
       });
       equals.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                       if(!TextUtils.isEmpty(textView.getText().toString())) {
                           equalsTo();
                               String  result_1=String.valueOf(result);
                                if(result_1.endsWith(".0")) {
                                    result_1=result_1.substring(0,result_1.length()-2);
                                   }
                                else if(result_1.endsWith(".00"))
                                {

                                    result_1=result_1.substring(0,result_1.length()-3);
                                }
                                else if(result_1.endsWith(".000"))
                                {

                                    result_1=result_1.substring(0,result_1.length()-4);
                                }
                                else if(result_1.endsWith(".0000"))
                                {

                                    result_1=result_1.substring(0,result_1.length()-5);
                                }
                                else if(result_1.endsWith(".00000"))
                                {

                                    result_1=result_1.substring(0,result_1.length()-6);
                                }
                                else if(result_1.endsWith(".000000"))
                                {

                                    result_1=result_1.substring(0,result_1.length()-7);
                                }
                                else if(result_1.endsWith(".0000000")){
                                    result_1=result_1.substring(0,result_1.length()-8);
                                }
                           if(result_1.length()>36)
                           {
                               Toast.makeText(MainActivity.this,"Maximum number of Digits Exceeded",Toast.LENGTH_SHORT).show();
                           }
                           else
                           {
                               vb_textView.setText(result_1);
                               textView.setText(result_1);
                           }
                           var1=var2=result=BigDecimal.valueOf(0);
                           op='\0';


                       }
                   else
                   {
                       Toast.makeText(MainActivity.this,"Invalid input format",Toast.LENGTH_SHORT).show();
                   }

               }

       });
   }

    private BigInteger Decimal(BigInteger string) {
        BigInteger value = new BigInteger("0");
        for (int i = 0; i < textView.getText().toString().length(); i++) {
            value = value.add(string.remainder(new BigInteger("10")).multiply(new BigInteger("2").pow(i)));
            string = string.divide(new BigInteger("10"));
        }
        return value;
    }

    private String fractionDecimal(String string) {

        double str=0;
        for (int i=0;i<string.length();i++)
        {
            str+=Character.getNumericValue(string.charAt(i))*Math.pow(2, -(i+1));

        }

        return String.valueOf(str);
    }

    private String BinOfFraction(String bd) {
        double x=Double.parseDouble(bd);
        StringBuilder sb=new StringBuilder(".");
        while(x>0 && sb.length()<=11)
        {
            x*=2;
            if(x>=1)
            {
                x-=1;
                sb.append(1);

            }
            else
            {
                sb.append(0);

            }
        }
        return sb.toString();

    }

    private String Bin(String num) {
        String binValue = "";
        BigInteger number = new BigInteger(num);
        while (number.compareTo(new BigInteger("0")) == 1) {
            binValue += number.remainder(new BigInteger("2"));
            number = number.divide(new BigInteger("2"));
        }
        return new StringBuffer(binValue).reverse().toString();

    }

    private void clear() {
        var1=var2=result=new BigDecimal(0);
    }

    private BigDecimal equalsTo() {
        var2=new BigDecimal(textView.getText().toString());
        switch (op)
        {
            case '+':
                result=var1.add(var2);
                break;
            case '-':
                result=var1.subtract(var2);
                break;
            case '*':
                result=var1.multiply(var2);
                break;
            case '/':
                result=var1.divide(var2,7,RoundingMode.HALF_UP);
                break;
            case '%':
                result=(var1.divide(new BigDecimal(100),2,RoundingMode.HALF_UP)).multiply(var2);
                break;
            default:
                result=new BigDecimal(textView.getText().toString());

        }
        return result;
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(!TextUtils.isEmpty(vb_textView.getText().toString()))
        {

            if(vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='/'||vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='x'||vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='-'||vb_textView.getText().toString().charAt(vb_textView.getText().toString().length()-1)=='+')
            {
                textView.setText(var1.toString()+"0");
                op = '\0';
            }
            if(!TextUtils.isEmpty(textView.getText().toString())) {
                textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() - 1));
            }

            vb_textView.setText(vb_textView.getText().toString().substring(0,vb_textView.getText().toString().length()-1));
        }

        else
        {
            var1 = var2 = result = BigDecimal.valueOf(0.0);
        }
        return true;
        
    }
}