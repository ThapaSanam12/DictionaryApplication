package com.dictionaryapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {
TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);
TextView tvText=findViewById(R.id.tvText);
Bundle bundle=getIntent().getExtras();
if(bundle!=null){

    String message=bundle.getString("mymessage");
    tvText.setText(message);

}
else
{
    Toast.makeText(this,"no message",Toast.LENGTH_LONG).show();
}
    }
}
