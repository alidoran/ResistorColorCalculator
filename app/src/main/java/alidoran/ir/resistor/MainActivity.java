package alidoran.ir.resistor;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    Button btnaboutus;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        LinearLayout lin4band;
        lin4band = findViewById ( R.id.lin4band );
        lin4band.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent ( MainActivity.this , Resistor4Band.class );
                startActivity ( intent );
            }
        } );

        LinearLayout lin5band;
        lin5band = findViewById ( R.id.lin5band );
        lin5band.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent ( MainActivity.this , Resistor5Band.class );
                startActivity ( intent );
            }
        } );
        ImageView imgaboutus;
        imgaboutus = findViewById ( R.id.imgaboutus );
        imgaboutus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View v ) {
                AlertDialog.Builder alertaboutus = new AlertDialog.Builder ( MainActivity.this );
                alertaboutus.setView ( R.layout.activity_aboutus );
                alertaboutus.setMessage ( "about us" );
                final AlertDialog dialogaboutus = alertaboutus.create ( );
                dialogaboutus.getWindow ( ).setBackgroundDrawable ( new ColorDrawable ( Color.TRANSPARENT ) );
                dialogaboutus.show ( );
                btnaboutus=dialogaboutus.findViewById ( R.id.btnaboutus );
                btnaboutus.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick ( View v ) {
                        dialogaboutus.dismiss ();
                    }
                } );
            }
        } );




        ActionBar actionBar = getSupportActionBar ( );
        actionBar.setTitle ( "Resistor Color Calculate" );
        actionBar.setDisplayHomeAsUpEnabled ( false );







    }


    public boolean onOptionsItemSelected ( MenuItem item ) {
        if (item.getItemId ( ) == android.R.id.home) {
            onBackPressed ( );
            return true;
        }
        return super.onOptionsItemSelected ( item );
    }


}


