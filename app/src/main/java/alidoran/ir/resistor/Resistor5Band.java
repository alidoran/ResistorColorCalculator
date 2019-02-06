package alidoran.ir.resistor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Resistor5Band extends AppCompatActivity {

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
    Button btnresistor03gray;
    Button btnresistor03white;
    Button btnresistor04black;
    Button btnresistor04brown;
    Button btnresistor04red;
    Button btnresistor04orange;
    Button btnresistor04yellow;
    Button btnresistor04green;
    Button btnresistor04blue;
    Button btnresistor04violet;
    Button btnresistor04gold;
    Button btnresistor04silver;
    Button btnresistor05brown;
    Button btnresistor05red;
    Button btnresistor05green;
    Button btnresistor05blue;
    Button btnresistor05violet;
    Button btnresistor05gray;
    Button btnresistor05gold;
    Button btnresistor05silver;
    ImageView resistor1rd;
    ImageView resistor2rd;
    ImageView resistor3rd;
    ImageView resistor4rd;
    ImageView resistor5rd;
    short a = 0;
    short b = 0;
    short c =0;
    double d = 1;
    float e = 0.1f;
    double answer;
    String unit = "";

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_resistor5_band );

        Bresistor1rdchange ( );
        Bresistor2rdchange ( );
        Bresistor3rdchange ( );
        Bresistor4rdchange ( );
        Bresistor5rdchange ( );

    }

    private void Bresistor1rdchange ( ) {
        btnresistor01black = findViewById ( R.id.Bresistor01black );
        btnresistor01brown = findViewById ( R.id.Bresistor01brown );
        btnresistor01red = findViewById ( R.id.Bresistor01red );
        btnresistor01orange = findViewById ( R.id.Bresistor01orange );
        btnresistor01yellow = findViewById ( R.id.Bresistor01yellow );
        btnresistor01green = findViewById ( R.id.Bresistor01green );
        btnresistor01blue = findViewById ( R.id.Bresistor01blue );
        btnresistor01violet = findViewById ( R.id.Bresistor01violet );
        btnresistor01gray = findViewById ( R.id.Bresistor01gray );
        btnresistor01white = findViewById ( R.id.Bresistor01white );
        resistor1rd = findViewById ( R.id.Bresistor01 );

        btnresistor01black.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02black );
                a = 0;
                Bsetanswer ( );
            }
        } );
        btnresistor01brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02brown );
                a = 1;
                Bsetanswer ( );
            }
        } );
        btnresistor01red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02red );
                a = 2;
                Bsetanswer ( );
            }
        } );
        btnresistor01orange.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02orange );
                a = 3;
                Bsetanswer ( );
            }
        } );
        btnresistor01yellow.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02yellow );
                a = 4;
                Bsetanswer ( );
            }
        } );
        btnresistor01green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02green );
                a = 5;
                Bsetanswer ( );
            }
        } );
        btnresistor01blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02blue );
                a = 6;
                Bsetanswer ( );
            }
        } );
        btnresistor01violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02violet );
                a = 7;
                Bsetanswer ( );
            }
        } );
        btnresistor01gray.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02gray );
                a = 8;
                Bsetanswer ( );
            }
        } );
        btnresistor01white.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor1rd.setImageResource ( R.mipmap.resistor02white );
                a = 9;
                Bsetanswer ( );
            }
        } );
    }

    private void Bresistor2rdchange ( ) {
        btnresistor02black = findViewById ( R.id.Bresistor02black );
        btnresistor02brown = findViewById ( R.id.Bresistor02brown );
        btnresistor02red = findViewById ( R.id.Bresistor02red );
        btnresistor02orange = findViewById ( R.id.Bresistor02orange );
        btnresistor02yellow = findViewById ( R.id.Bresistor02yellow );
        btnresistor02green = findViewById ( R.id.Bresistor02green );
        btnresistor02blue = findViewById ( R.id.Bresistor02blue );
        btnresistor02violet = findViewById ( R.id.Bresistor02violet );
        btnresistor02gray = findViewById ( R.id.Bresistor02gray );
        btnresistor02white = findViewById ( R.id.Bresistor02white );
        resistor2rd = findViewById ( R.id.Bresistor02 );

        btnresistor02black.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04black );
                b = 0;
                Bsetanswer ( );
            }
        } );

        btnresistor02brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04brown );
                b = 1;
                Bsetanswer ( );
            }
        } );
        btnresistor02red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04red );
                b = 2;
                Bsetanswer ( );
            }
        } );
        btnresistor02orange.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04orange );
                b = 3;
                Bsetanswer ( );
            }
        } );
        btnresistor02yellow.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04yellow );
                b = 4;
                Bsetanswer ( );
            }
        } );
        btnresistor02green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04green );
                b = 5;
                Bsetanswer ( );
            }
        } );
        btnresistor02blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04blue );
                b = 6;
                Bsetanswer ( );
            }
        } );
        btnresistor02violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04violet );
                b = 7;
                Bsetanswer ( );
            }
        } );
        btnresistor02gray.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04gray );
                b = 8;
                Bsetanswer ( );
            }
        } );
        btnresistor02white.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor2rd.setImageResource ( R.mipmap.resistor04white );
                b = 9;
                Bsetanswer ( );
            }
        } );
    }

    private void Bresistor3rdchange ( ) {
        btnresistor03black = findViewById ( R.id.Bresistor03black );
        btnresistor03brown = findViewById ( R.id.Bresistor03brown );
        btnresistor03red = findViewById ( R.id.Bresistor03red );
        btnresistor03orange = findViewById ( R.id.Bresistor03orange );
        btnresistor03yellow = findViewById ( R.id.Bresistor03yellow );
        btnresistor03green = findViewById ( R.id.Bresistor03green );
        btnresistor03blue = findViewById ( R.id.Bresistor03blue );
        btnresistor03violet = findViewById ( R.id.Bresistor03violet );
        btnresistor03gray = findViewById ( R.id.Bresistor03gray );
        btnresistor03white = findViewById ( R.id.Bresistor03white );
        resistor3rd = findViewById ( R.id.Bresistor03 );

        btnresistor03black.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06black );
                c = 0;
                Bsetanswer ( );
            }
        } );

        btnresistor03brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06brown );
                c = 1;
                Bsetanswer ( );
            }
        } );
        btnresistor03red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06red );
                c = 2;
                Bsetanswer ( );
            }
        } );
        btnresistor03orange.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06orange );
                c = 3;
                Bsetanswer ( );
            }
        } );
        btnresistor03yellow.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06yellow );
                c = 4;
                Bsetanswer ( );
            }
        } );
        btnresistor03green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06green );
                c = 5;
                Bsetanswer ( );
            }
        } );
        btnresistor03blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06blue );
                c = 6;
                Bsetanswer ( );
            }
        } );
        btnresistor03violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06violet );
                c = 7;
                Bsetanswer ( );
            }
        } );
        btnresistor03gray.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06gray );
                c = 8;
                Bsetanswer ( );
            }
        } );
        btnresistor03white.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor3rd.setImageResource ( R.mipmap.resistor06white );
                c = 9;
                Bsetanswer ( );
            }
        } );
    }

    private void Bresistor4rdchange ( ) {
        btnresistor04black = findViewById ( R.id.Bresistor04black );
        btnresistor04brown = findViewById ( R.id.Bresistor04brown );
        btnresistor04red = findViewById ( R.id.Bresistor04red );
        btnresistor04orange = findViewById ( R.id.Bresistor04orange );
        btnresistor04yellow = findViewById ( R.id.Bresistor04yellow );
        btnresistor04green = findViewById ( R.id.Bresistor04green );
        btnresistor04blue = findViewById ( R.id.Bresistor04blue );
        btnresistor04violet = findViewById ( R.id.Bresistor04violet );
        btnresistor04gold = findViewById ( R.id.Bresistor04gold );
        btnresistor04silver = findViewById ( R.id.Bresistor04silver );
        resistor4rd = findViewById ( R.id.Bresistor04 );

        btnresistor04black.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072black );
                d = 1;
                Bsetanswer ();
            }
        } );
        btnresistor04brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072brown );
                d = 10;
                Bsetanswer ( );
            }
        } );
        btnresistor04red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072red );
                d = 100;
                Bsetanswer ( );
            }
        } );
        btnresistor04orange.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072orange );
                d = 1000;
                Bsetanswer ( );
            }
        } );
        btnresistor04yellow.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072yellow );
                d = 10000;
                Bsetanswer ( );
            }
        } );
        btnresistor04green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072green );
                d = 100000;
                Bsetanswer ( );
            }
        } );
        btnresistor04blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072blue );
                d = 1000000;
                Bsetanswer ( );
            }
        } );
        btnresistor04violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072violet );
                d = 10000000;
                Bsetanswer ( );
            }
        } );
        btnresistor04gold.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072gold );
                d = 0.1;
                Bsetanswer ( );
            }
        } );
        btnresistor04silver.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor4rd.setImageResource ( R.mipmap.resistor072silver );
                d = 0.01;
                Bsetanswer ( );
            }
        } );
    }

    private void Bresistor5rdchange ( ) {
        btnresistor05brown = findViewById ( R.id.Bresistor05brown );
        btnresistor05red = findViewById ( R.id.Bresistor05red );
        btnresistor05green = findViewById ( R.id.Bresistor05green );
        btnresistor05blue = findViewById ( R.id.Bresistor05blue );
        btnresistor05violet = findViewById ( R.id.Bresistor05violet );
        btnresistor05gray = findViewById ( R.id.Bresistor05gray );
        btnresistor05gold = findViewById ( R.id.Bresistor05gold );
        btnresistor05silver = findViewById ( R.id.Bresistor05silver );
        resistor5rd = findViewById ( R.id.Bresistor05 );


        btnresistor05brown.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08brown );
                e = 1f;
                Bsetanswer ( );
            }
        } );
        btnresistor05red.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08red );
                e = 2f;
                Bsetanswer ( );
            }
        } );
        btnresistor05green.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08green );
                e = 0.5f;
                Bsetanswer ( );
            }
        } );
        btnresistor05blue.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08blue );
                e = 0.25f;
                Bsetanswer ( );
            }
        } );
        btnresistor05violet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08violet );
                e = 0.1f;
                Bsetanswer ( );
            }
        } );
        btnresistor05gray.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08gray );
                e = 0.05f;
                Bsetanswer ( );
            }
        } );
        btnresistor05gold.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08gold );
                e = 5f;
                Bsetanswer ( );
            }
        } );
        btnresistor05silver.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                resistor5rd.setImageResource ( R.mipmap.resistor08silver );
                e = 10f;
                Bsetanswer ( );
            }
        } );
    }

    private void Bsetanswer ( ) {
        Bcalculate ( );
        TextView txtanswer;
        TextView txttolerance;
        txtanswer = findViewById ( R.id.Btxtanswer );
        txttolerance = findViewById ( R.id.Btxttolerance );
        txtanswer.setText ( String.valueOf ( answer ) + unit );
        txttolerance.setText ( String.valueOf ( e ) );
    }

    private void Bcalculate ( ) {
        answer = (((a * 100) + (b*10) + c) * d);
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