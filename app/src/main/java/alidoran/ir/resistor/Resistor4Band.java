package alidoran.ir.resistor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Resistor4Band extends AppCompatActivity {

    Button btnresistor01black;
    Button btnresistor01brown;
    Button btnresistor01red;
    Button btnresistor01orange;
    Button btnresistor01yellow;
    Button btnresistor01green;
    Button btnresistor01blue;
    Button btnresistor01violet;
    Button btnresistor01gray;
    Button btnresistor01white;
    Button btnresistor02black;
    Button btnresistor02brown;
    Button btnresistor02red;
    Button btnresistor02orange;
    Button btnresistor02yellow;
    Button btnresistor02green;
    Button btnresistor02blue;
    Button btnresistor02violet;
    Button btnresistor02gray;
    Button btnresistor02white;
    Button btnresistor03black;
    Button btnresistor03brown;
    Button btnresistor03red;
    Button btnresistor03orange;
    Button btnresistor03yellow;
    Button btnresistor03green;
    Button btnresistor03blue;
    Button btnresistor03violet;
    Button btnresistor03gold;
    Button btnresistor03silver;
    Button btnresistor04brown;
    Button btnresistor04red;
    Button btnresistor04green;
    Button btnresistor04blue;
    Button btnresistor04violet;
    Button btnresistor04gray;
    Button btnresistor04gold;
    Button btnresistor04silver;
    ImageView resistor1rd;
    ImageView resistor2rd;
    ImageView resistor3rd;
    ImageView resistor4rd;
    short a = 0;
    short b = 0;
    double c = 1;
    float d = 0.1f;
    double answer;
    String unit = "Ω";


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_resistor4_band );

        resistor1rdchange ( );
        resistor2rdchange ( );
        resistor3rdchange ( );
        resistor4rdchange ( );


    }

    private void resistor1rdchange ( ) {
        btnresistor01black = findViewById ( R.id.resistor01black );
        btnresistor01brown = findViewById ( R.id.resistor01brown );
        btnresistor01red = findViewById ( R.id.resistor01red );
        btnresistor01orange = findViewById ( R.id.resistor01orange );
        btnresistor01yellow = findViewById ( R.id.resistor01yellow );
        btnresistor01green = findViewById ( R.id.resistor01green );
        btnresistor01blue = findViewById ( R.id.resistor01blue );
        btnresistor01violet = findViewById ( R.id.resistor01violet );
        btnresistor01gray = findViewById ( R.id.resistor01gray );
        btnresistor01white = findViewById ( R.id.resistor01white );
        resistor1rd = findViewById ( R.id.resistor01 );

        btnresistor01black.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02black );
                a = 0;
                setanswer ( );
            }
        } );
        btnresistor01brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02brown );
                a = 1;
                setanswer ( );
            }
        } );
        btnresistor01red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02red );
                a = 2;
                setanswer ( );
            }
        } );
        btnresistor01orange.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02orange );
                a = 3;
                setanswer ( );
            }
        } );
        btnresistor01yellow.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02yellow );
                a = 4;
                setanswer ( );
            }
        } );
        btnresistor01green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02green );
                a = 5;
                setanswer ( );
            }
        } );
        btnresistor01blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02blue );
                a = 6;
                setanswer ( );
            }
        } );
        btnresistor01violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02violet );
                a = 7;
                setanswer ( );
            }
        } );
        btnresistor01gray.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02gray );
                a = 8;
                setanswer ( );
            }
        } );
        btnresistor01white.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02white );
                a = 9;
                setanswer ( );
            }
        } );
    }

    private void resistor2rdchange ( ) {
        btnresistor02black = findViewById ( R.id.resistor02black );
        btnresistor02brown = findViewById ( R.id.resistor02brown );
        btnresistor02red = findViewById ( R.id.resistor02red );
        btnresistor02orange = findViewById ( R.id.resistor02orange );
        btnresistor02yellow = findViewById ( R.id.resistor02yellow );
        btnresistor02green = findViewById ( R.id.resistor02green );
        btnresistor02blue = findViewById ( R.id.resistor02blue );
        btnresistor02violet = findViewById ( R.id.resistor02violet );
        btnresistor02gray = findViewById ( R.id.resistor02gray );
        btnresistor02white = findViewById ( R.id.resistor02white );
        resistor2rd = findViewById ( R.id.resistor02 );

        btnresistor02black.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04black );
                b = 0;
                setanswer ( );
            }
        } );

        btnresistor02brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04brown );
                b = 1;
                setanswer ( );
            }
        } );
        btnresistor02red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04red );
                b = 2;
                setanswer ( );
            }
        } );
        btnresistor02orange.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04orange );
                b = 3;
                setanswer ( );
            }
        } );
        btnresistor02yellow.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04yellow );
                b = 4;
                setanswer ( );
            }
        } );
        btnresistor02green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04green );
                b = 5;
                setanswer ( );
            }
        } );
        btnresistor02blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04blue );
                b = 6;
                setanswer ( );
            }
        } );
        btnresistor02violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04violet );
                b = 7;
                setanswer ( );
            }
        } );
        btnresistor02gray.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04gray );
                b = 8;
                setanswer ( );
            }
        } );
        btnresistor02white.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04white );
                b = 9;
                setanswer ( );
            }
        } );
    }

    private void resistor3rdchange ( ) {
        btnresistor03black = findViewById ( R.id.resistor03black );
        btnresistor03brown = findViewById ( R.id.resistor03brown );
        btnresistor03red = findViewById ( R.id.resistor03red );
        btnresistor03orange = findViewById ( R.id.resistor03orange );
        btnresistor03yellow = findViewById ( R.id.resistor03yellow );
        btnresistor03green = findViewById ( R.id.resistor03green );
        btnresistor03blue = findViewById ( R.id.resistor03blue );
        btnresistor03violet = findViewById ( R.id.resistor03violet );
        btnresistor03gold = findViewById ( R.id.resistor03gold );
        btnresistor03silver = findViewById ( R.id.resistor03silver );
        resistor3rd = findViewById ( R.id.resistor03 );

        btnresistor03black.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06black );
                c = 1;
            }
        } );
        btnresistor03brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06brown );
                c = 10;
                setanswer ( );
            }
        } );
        btnresistor03red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06red );
                c = 100;
                setanswer ( );
            }
        } );
        btnresistor03orange.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06orange );
                c = 1000;
                setanswer ( );
            }
        } );
        btnresistor03yellow.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06yellow );
                c = 10000;
                setanswer ( );
            }
        } );
        btnresistor03green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06green );
                c = 100000;
                setanswer ( );
            }
        } );
        btnresistor03blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06blue );
                c = 1000000;
                setanswer ( );
            }
        } );
        btnresistor03violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06violet );
                c = 10000000;
                setanswer ( );
            }
        } );
        btnresistor03gold.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06gold );
                c = 0.1;
                setanswer ( );
            }
        } );
        btnresistor03silver.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06silver );
                c = 0.01;
                setanswer ( );
            }
        } );
    }

    private void resistor4rdchange ( ) {
        btnresistor04brown = findViewById ( R.id.resistor04brown );
        btnresistor04red = findViewById ( R.id.resistor04red );
        btnresistor04green = findViewById ( R.id.resistor04green );
        btnresistor04blue = findViewById ( R.id.resistor04blue );
        btnresistor04violet = findViewById ( R.id.resistor04violet );
        btnresistor04gray = findViewById ( R.id.resistor04gray );
        btnresistor04gold = findViewById ( R.id.resistor04gold );
        btnresistor04silver = findViewById ( R.id.resistor04silver );
        resistor4rd = findViewById ( R.id.resistor04 );


        btnresistor04brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08brown );
                d = 1f;
                setanswer ( );
            }
        } );
        btnresistor04red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08red );
                d = 2f;
                setanswer ( );
            }
        } );
        btnresistor04green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08green );
                d = 0.5f;
                setanswer ( );
            }
        } );
        btnresistor04blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08blue );
                d = 0.25f;
                setanswer ( );
            }
        } );
        btnresistor04violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08violet );
                d = 0.1f;
                setanswer ( );
            }
        } );
        btnresistor04gray.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08gray );
                d = 0.05f;
                setanswer ( );
            }
        } );
        btnresistor04gold.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08gold );
                d = 5f;
                setanswer ( );
            }
        } );
        btnresistor04silver.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor08silver );
                d = 10f;
                setanswer ( );
            }
        } );
    }

    private void setanswer ( ) {
        calculate ( );
        TextView txtanswer;
        TextView txttolerance;
        txtanswer = findViewById ( R.id.txtanswer );
        txttolerance = findViewById ( R.id.txttolerance );
        txtanswer.setText ( String.valueOf ( answer ) + unit );
        txttolerance.setText ( String.valueOf ( d ) );
    }

    private void calculate ( ) {
        answer = (((a * 10) + b) * c);
        if (answer >= 0 && answer < 1000) {
            unit = "Ω";
        } else if (answer >= 1000 && answer < 1000000) {
            answer = answer / 1000;
            unit = "KΩ";
        } else if
                (answer >= 1000000) {
            answer = answer / 1000000;
            unit = "MΩ";
        }
    }
}
