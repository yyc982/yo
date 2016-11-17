package com.jiuzhang.guojing.yo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 5 get View using findViewById
        // get the EditText, the Button and the TextView using findViewById
        EditText editText = (EditText) findViewById(R.id.edit_text);

        // TODO 6 set OnClickListener of Button
        // set the OnClickListener of the button so that when the button is clicked,
        // your program should set the text of TextView to be the value of the EditText
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String str = eText.getText().toString();
                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
                msg.show();
            }
        });



    }
}
