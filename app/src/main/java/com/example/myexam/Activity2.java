package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.widget.Toast.LENGTH_LONG;

public class Activity2 extends AppCompatActivity {

   private Button login;
    EditText username, password;
    String correct_username = "admin";
    String correct_password = "Password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                openActivity2();

                if (TextUtils.isEmpty(username.getText().toString()) && TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(Activity2.this, "Puste dane", LENGTH_LONG).show();

                } else if (username.getText().toString().equals(correct_username)) {
                    if (password.getText().toString().equals(correct_password)) {
                        Toast.makeText(Activity2.this, "Udane logowanie", LENGTH_LONG).show();

                        }
                        {

                        }
                    } else {
                        Toast.makeText(Activity2.this, "Niepoprawny login/hasło", LENGTH_LONG).show();
                    }
                }



        });
}
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}

