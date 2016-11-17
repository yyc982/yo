package com.jiuzhang.guojing.yo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 5 get View using findViewById
        // get the EditText, the Button and the TextView using findViewById
        final EditText editText = (EditText) findViewById(R.id.edit_text);

        // TODO 6 set OnClickListener of Button
        final TextView textView = (TextView) findViewById(R.id.text_view);
        // set the OnClickListener of the button so that when the button is clicked,
        // your program should set the text of TextView to be the value of the EditText
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                textView.setText(str);

            }
        });


//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                button1.startAnimation(animation);
//                Toast.makeText(MainActivity.this, button1.getText() + " " + nameEdit.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });
//

    }
}
