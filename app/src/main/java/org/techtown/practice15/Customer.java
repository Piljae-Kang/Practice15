package org.techtown.practice15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Customer extends AppCompatActivity {
    EditText name;
    EditText age;
    EditText birthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        Button button = findViewById(R.id.button2);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        birthday = findViewById(R.id.birthday);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = name.getText().toString();
                String str2 = age.getText().toString();
                String str3 = birthday.getText().toString();
                
                finish();
                overridePendingTransition(R.anim.entry_back, R.anim.exit_back);
            }
        });


    }
}