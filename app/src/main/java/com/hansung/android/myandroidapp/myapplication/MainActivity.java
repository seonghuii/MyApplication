package com.hansung.android.myandroidapp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     Button btn  = (Button)findViewById(R.id.button1);
        btn.setOnClickListener(new MyOnclickListener());
    }
    private class MyOnclickListener implements
            View.OnClickListener {
            public void OnClickListener (View view) {
        Toast.makeText(getApplicationContext(),
R.string.button_clicked_msg, Toast.LENGTH_SHORT).show();
};
}
/* void onClickB1(Veiw v) { // 토스트 메시지 출력 } */
}