package org.acl.aclcompetition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *  Author : Drabo Constantin
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boutonabout;
    Button boutonprofile;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boutonabout = (Button) findViewById(R.id.buttonaboutacl);
        boutonabout.setOnClickListener(this);
        boutonprofile = (Button) findViewById(R.id.buttonprofile);
        boutonprofile.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonaboutacl:
                intent  = new Intent(this,Aboutactivity.class);
                startActivity(intent);
                break;
            case R.id.buttonprofile:
                intent  = new Intent(this,Myprofileactivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
