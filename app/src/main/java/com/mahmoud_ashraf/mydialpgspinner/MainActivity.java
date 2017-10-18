package com.mahmoud_ashraf.mydialpgspinner;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Example");
        String[] types = {"By Zip", "By Category"};
        b.setItems(types, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
                switch(which){
                    case 0:
                        Toast.makeText(getApplicationContext(),"SMILE MY FRIEND :))",Toast.LENGTH_LONG).show();
                        break;
                    case 1:

                        break;
                }
            }

        });

        b.show();
    }
}
