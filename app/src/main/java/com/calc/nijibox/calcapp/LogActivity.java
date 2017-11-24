package com.calc.nijibox.calcapp;


    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;

    import android.widget.Button;
    import android.widget.TextView;

public class LogActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_log);

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        textView = findViewById(R.id.textView);
        StringBuilder stb = new StringBuilder();

        for(int i=0; i< btn.logs.size(); i++ ){
            stb.append(btn.logs.get(i));
        }

        textView.setText(stb);
    }
}
