package com.calc.nijibox.calcapp;


    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.support.v7.widget.LinearLayoutManager;
    import android.support.v7.widget.RecyclerView;
    import android.view.View;

    import android.widget.Button;
    import android.widget.TextView;

public class LogActivity extends AppCompatActivity {

    private TextView textView;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private String[] myDataset = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_log);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        for(int i=0; i<myDataset.length; i++) {
            myDataset[i] = "Data_0"+String.valueOf(i);
        }

        // アダプタの指定
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);


        textView = findViewById(R.id.textView);
        StringBuilder stb = new StringBuilder();

        for(int i=0; i< btn.logs.size(); i++ ){
            stb.append(btn.logs.get(i));
        }

        textView.setText(stb);

        //もどるボタン
        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
