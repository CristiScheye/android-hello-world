package cristi.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvHello;
    EditText etName;
    String[] names = {"Batman", "Sunshine", "Barney Flinstone",  "Flubber", "Superstar", "Bob Barker"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = (TextView) findViewById(R.id.textViewHello);
        etName = (EditText) findViewById(R.id.editTextName);
    }

    public void onUpdateName(View v) {
        String userName = (String) etName.getText().toString();
        String tvText = "Hello " + userName + "!";

        tvHello.setText(tvText);
    }

    public void onGenName(View v) {
        int namesRandomIdx =  (int) Math.floor(Math.random() * names.length);
        String generatedName = names[namesRandomIdx];
        String tvText = "Hello " + generatedName + "!";

        tvHello.setText(tvText);
    }
}
